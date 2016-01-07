package com.iitg.sgc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gcm.GCMRegistrar;

import static com.iitg.sgc.CommonUtilities.SENDER_ID;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener{
    DrawerLayout mDrawerLayout;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar tb;
    TextView tv;
    Button button;
    ListView list;
    String[] items = {"Home", "Technical Board", "Cultural Board", "Sports Board", "Welfare Board", "Hostel Affairs Board","Students' Senate","Notifications"};

    AsyncTask<Void, Void, Void> mRegisterTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences one = getSharedPreferences("Once", 0);
        SharedPreferences.Editor oneedit = one.edit();


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();


        tb = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(tb);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, tb, R.string.app_name,
                R.string.app_name);
        tb.setLogo(R.drawable.gymkhana);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(new ArrayAdapter<>(this, R.layout.item, items));
        list.setItemChecked(0, true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

        list.setOnItemClickListener(this);
        tv = (TextView) findViewById(R.id.tvdev);
        tv.setOnClickListener(this);
        final String regId = GCMRegistrar.getRegistrationId(MainActivity.this);

        if (isNetworkAvailable()) {
            for (int j = 0; j < 2; j++) {


                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
                if(prefs.getBoolean("firstRun", true)) {
                    GCMRegistrar.setRegisteredOnServer(this,false); // <-- your function
                    prefs.edit().putBoolean("firstRun", false).commit();
                }

                if (regId.equals("")) {
                    GCMRegistrar.register(this, SENDER_ID);

                } else {
                    // Device is already registered on GCM
                    if (GCMRegistrar.isRegisteredOnServer(this)) {
                        // Skips registration.
                        //  Toast.makeText(getApplicationContext(), "Already registered with GCM", Toast.LENGTH_LONG).show();
                    } else {
                        // Try to register again, but not in the UI thread.
                        // It's also necessary to cancel the thread onDestroy(),
                        // hence the use of AsyncTask instead of a raw thread.
                        final Context context = this;

                        mRegisterTask = new AsyncTask<Void, Void, Void>() {

                            @Override
                            protected Void doInBackground(Void... params) {
                                // Register on our server
                                // On server creates a new user
                                ServerUtilities.register(context, regId);
                                return null;
                            }

                            @Override
                            protected void onPostExecute(Void result) {
                                mRegisterTask = null;
                            }

                        };
                        mRegisterTask.execute(null, null, null);
                    }
                }


            }

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent a =new Intent(Intent.ACTION_DIAL);
            a.setData(Uri.parse("tel:+91-361-2582162"));
            startActivity(a);
            return true;
        }

        if(id==android.R.id.home){

        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     mDrawerLayout.closeDrawers();
        switch (position) {
            case 0:
                tb.setTitle("SGC-IITG");
                tb.setLogo(R.drawable.gymkhana);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
                break;

            case 1:
                tb.setTitle("Technical Board");
                tb.setLogo(R.drawable.techlogo);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Tech_Tab_Layout()).commit();
                break;

            case 2:
                tb.setTitle("Cultural Board");
                tb.setLogo(R.drawable.cultlogo);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Cult_tab_layout()).commit();
                break;
            case 3:
                tb.setTitle("Sports Board");
                tb.setLogo(R.drawable.sportslogo);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Sports_Tab_Layout()).commit();
                break;
            case 4:
                tb.setTitle("Welfare Board");
                tb.setLogo(R.drawable.welflogo);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Welfare_tab_layout()).commit();
                break;
            case 5:
                tb.setTitle("Hostel Affairs Board");
                tb.setLogo(R.drawable.gymkhana);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Hab_tab_layout()).commit();
                break;
            case 6:
                tb.setTitle("Students' Senate");
                tb.setLogo(R.drawable.gymkhana);
                mFragmentManager = getSupportFragmentManager();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.containerView, new Students_senate()).commit();
                break;

            case 7:

                startActivity(new Intent(this,Notification.class));
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.tvdev)
        {     mDrawerLayout.closeDrawers();

            Intent a =new Intent(this,Developers.class);
            startActivity(a);




        }

    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}