package com.iitg.sgc;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.iitg.sgc.Cult_clubs.Anchor_tab_layout;

/**
 * Created by raunak on 23/10/15.
 */
public class Notification extends AppCompatActivity {
Toolbar tb;
    android.support.v4.app.FragmentTransaction mFragmentTransaction;
    android.support.v4.app.FragmentManager mFragmentManager;
    CheckBox cbtech, cbcult, cbsport, cbwelf, cbhab,cbres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.notification);





        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.notificationly, new Notifications_Tab_Layout(), "abcd").commit();
        tb = (android.support.v7.widget.Toolbar) findViewById(R.id.notificationtoolbar);
        new ToolbarConfigurer(this,tb,true);


        tb = (android.support.v7.widget.Toolbar) findViewById(R.id.notificationtoolbar);
        setSupportActionBar(tb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    public class ToolbarConfigurer implements View.OnClickListener {
        private Activity activity;

        public ToolbarConfigurer(Activity activity, Toolbar toolbar, boolean displayHomeAsUpEnabled) {
            if (!displayHomeAsUpEnabled) return;
            toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            toolbar.setNavigationOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.noti, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final SharedPreferences share = getSharedPreferences("Toggle", 0);
        final SharedPreferences.Editor togedit =share.edit();
        int id = item.getItemId();
        switch (id) {
            case R.id.noti_menu:

                final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("Receive Future Notification From : \n ");

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflater.inflate(R.layout.board_menu, null);
                dialog.setView(v);
                dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                cbtech = (CheckBox) v.findViewById(R.id.cb_tech);
                cbcult = (CheckBox) v.findViewById(R.id.cb_cult);
                cbsport = (CheckBox) v.findViewById(R.id.cb_sport);
                cbwelf = (CheckBox) v.findViewById(R.id.cb_welf);
                cbhab = (CheckBox) v.findViewById(R.id.cb_hab);


                Boolean techcheck=share.getBoolean("TECH",true);
                Boolean cultcheck=share.getBoolean("CULT",true);
                Boolean HABcheck=share.getBoolean("HAB",true);
                Boolean welfcheck=share.getBoolean("WELF",true);
                Boolean sportcheck=share.getBoolean("SPORT",true);
                cbtech.setChecked(techcheck);
                cbcult.setChecked(cultcheck);
                cbwelf.setChecked(welfcheck);
                cbsport.setChecked(sportcheck);
                cbhab.setChecked(HABcheck);
                cbtech.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        togedit.putBoolean("TECH", isChecked);
                        togedit.commit();


                    }
                });

                cbcult.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        togedit.putBoolean("CULT", isChecked);
                        togedit.commit();


                    }
                });

                cbsport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        togedit.putBoolean("SPORT", isChecked);
                        togedit.commit();


                       }
                });

                cbwelf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        togedit.putBoolean("WELF",isChecked);
                        togedit.commit();



                    }
                });

                cbhab.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        togedit.putBoolean("HAB", isChecked);
                        togedit.commit();


                    }
                });



                dialog.show();


                break;
            case android.R.id.home:

                NavUtils.navigateUpFromSameTask(this);

                break;
        }

        return super.onOptionsItemSelected(item);
    }




}
