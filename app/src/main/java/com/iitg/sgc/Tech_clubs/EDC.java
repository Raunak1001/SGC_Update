package com.iitg.sgc.Tech_clubs;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.iitg.sgc.R;

/**
 * Created by Ankit Chahar on 06-10-2015.
 */
public class EDC extends AppCompatActivity {
    android.support.v7.widget.Toolbar tb;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edc);

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.edcly, new EDC_tab_layout(), "abcd").commit();
        tb = (android.support.v7.widget.Toolbar) findViewById(R.id.edc_toolbar);
new ToolbarConfigurer(this,tb,true);
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
