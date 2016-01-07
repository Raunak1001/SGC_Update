package com.iitg.sgc.Tech_clubs;

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
public class Coding_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.coding_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvCoding);
        tv.setText("We are a group of people highly enthusiastic about anything and everything related to Programming. Being the only club of programming in IITG, we have highly talented people working with us. We help promoting programming culture in college by organizing events such as Workshops, Hackathons, Lecture Series.\n" +
                "Coding is our cup of Coffee!!");
        super.onViewCreated(view, savedInstanceState);
    }
}