package com.iitg.sgc.Sports_Clubs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iitg.sgc.R;

/**
 * Created by Raunak on 10/5/2015.
 */
public class Aquatics_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aquatics_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvAquatics);
        tv.setText("Aquatics Club is the sports club of the campus which takes care of the water borne activities in the campus. We train and form amateur sports teams for swimming and water polo. The club has events throughout the season and conducts competitions at various levels. The club is to encourages love for swimming and provides an umbrella for all the activities in the aqua-sphere. We encourage newbies to take up swimming as a part of a healthy lifestyle and provide a positive environment for acquiring this life saving skill. The primary goal of the club is to represent the institution in national level meets like Inter IIT and Spirit.");
        super.onViewCreated(view, savedInstanceState);
    }


}
