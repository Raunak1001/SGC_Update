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
public class Aero_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aero_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvAero);
        tv.setText("Aeromodelling club, IIT Guwahati aims at developing and inculcating an interest in building of flying machines like planes and multi-rotors (both autonomous and manual). If you passionate about swimming in the clouds then this is the right place for you. To showcase their passion for flying the club members participate in various fares like Techniche, Techkriti and similar shows held at other institutes all over the country.");
        super.onViewCreated(view, savedInstanceState);
    }
}