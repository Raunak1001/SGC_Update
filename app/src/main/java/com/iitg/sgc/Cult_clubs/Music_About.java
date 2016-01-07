package com.iitg.sgc.Cult_clubs;

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
public class Music_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.music_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvMusic);
        tv.setText("Octaves is a group of music lovers of IITG. Anyone who wants to learn or sink themselves in music can be the part of the club.It is one of the most dynamic and happening clubs in the campus. Comprising of a bunch of solid talented musicians and ever hungry music worshipers, the club with its various bands has been enthralling the IITG junta for years.");
        super.onViewCreated(view, savedInstanceState);
    }
}