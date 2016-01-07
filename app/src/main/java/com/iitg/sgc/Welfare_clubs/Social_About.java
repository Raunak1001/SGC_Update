package com.iitg.sgc.Welfare_clubs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iitg.sgc.R;

/**
 * Created by Ankit Chahar on 06-10-2015.
 */
public class Social_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.social_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvSocial);
        tv.setText("Social Service Club IITG carries its works in the institute as a part of the public service initiative taken up by the institute .The aim being to inculcate social welfare thoughts in students who are the future of our nation and carry out actions reflecting the same without any prejudice.\n" +
                "Thus there stands the scheme in the campus, to carry out actions with about 220 students under various disciplines like Educational Outreach, Green campus and Events working rigorously for literacy drives, environmental conservation and sustainability.");
        super.onViewCreated(view, savedInstanceState);
    }
}