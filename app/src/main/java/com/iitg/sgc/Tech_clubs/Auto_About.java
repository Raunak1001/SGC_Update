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
public class Auto_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.auto_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvAuto);
        tv.setText("Have you ever looked at a car and marveled at its intricacies and complexity? Does hearing the roar of a V12 engine make your heart beat faster? If your answer was yes to the above questions, then this club is the perfect place for you. The Green Automobile Club (GAC) has taken part in several national level competitions such as the SAENIS Efficycle and stood a remarkable 13th place throughout India. The club has most recently designed and built an F1 car for the SUPRA SAE competition. So don’t miss out on the opportunity to get down and dirty with one of man’s greatest creations – the automobile. ");
        super.onViewCreated(view, savedInstanceState);
    }
}