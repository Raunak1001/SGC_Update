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
public class Youth_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.youth_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvYouth);
        tv.setText("The Youth Empowerment Club engages youth in positive activities during the hours that they are most likely to be involved in the negative lures of their communities. The program of the club is designed to help students build self-esteem, enhance communication, manage anger and violent expression, enhance decision making skills, become independent thinkers and create positive relationships with others. Our programs promote safety by empowering youth to make positive choices about their education, recreational activities and personal actions. Mission of Club is to empower young people through development and implementation of different programs so that they actively participate in the life of the campus and to support them in solving of their problems and needs, and in that way to contribute the development of quality of youth and community.");
        super.onViewCreated(view, savedInstanceState);
    }
}