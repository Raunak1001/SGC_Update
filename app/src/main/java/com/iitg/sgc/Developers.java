package com.iitg.sgc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raunak on 06-10-2015.
 */
public class Developers extends AppCompatActivity implements View.OnClickListener {
    android.support.v7.widget.Toolbar tb;
    TextView tv1,tv2,tv3,tv4;
String about1,about2,about3,about4;
    ImageView iv1,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developers);

        iv1=(ImageView)findViewById(R.id.ivankit);
        iv2=(ImageView)findViewById(R.id.ivraunak);

        tb = (android.support.v7.widget.Toolbar) findViewById(R.id.developers_toolbar);
        new ToolbarConfigurer(this,tb,true);

        about1="Raunak Agrawal";
        about2="Contact: +91-9085750717\nWebmail: agrawal.rajesh@iitg.ernet.in";
        about3="Ankit Chahar";
        about4="Contact: +91-8011491811\nWebmail: a.chahar@iitg.ernet.in";


        tv1=(TextView)findViewById(R.id.tvdev1);
        tv2=(TextView)findViewById(R.id.tvdev2);
        tv3=(TextView)findViewById(R.id.tvdev3);
        tv4=(TextView)findViewById(R.id.tvdev4);


        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);

        tv1.setText(about1);
        tv2.setText(about2);
        tv3.setText(about3);
        tv4.setText(about4);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.tvdev1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-9085750717"));
                startActivity(a);
                break;

            case R.id.tvdev2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-9085750717)"));
                startActivity(b);
                break;


            case R.id.tvdev3:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-8011491811"));
                startActivity(c);
                break;


            case R.id.tvdev4:

                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-8011491811"));
                startActivity(d);

                break;

            case R.id.ivankit:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000535533267"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ankit.chahar.332")));

                }
                break;

            case R.id.ivraunak:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002460457825"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/raunak.agrawal.75")));

                }
                break;

        }

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


    }
