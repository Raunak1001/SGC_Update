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
public class Ribbon_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ribbon_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvRibbon);
        tv.setText("Red Ribbon is a globally recognised symbol for HIV/AIDS awareness. Establishment of Red Ribbon Clubs was an important initiative undertaken by the Government of India to spread awareness about HIV/AIDS and associated myths among the youth and empower them as per educators. The Red Ribbon Club in IIT Guwahati came into effect in 2015.");
        super.onViewCreated(view, savedInstanceState);
    }
}