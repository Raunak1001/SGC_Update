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
 * Created by Raunak on 10/6/2015.
 */
public class WeightLifting_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.weightlifting_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvWeightlifting);
tv.setText("It is not just a game but it is more than that, it requires burning passion, discipline, iron will, sacrifices, belief in oneself and the heart of a Lion. The club is one of the most sincere clubs in the campus, founded by Mr. Ankit Upadhyay. It has been a record that the graph of performance of the team never went down since it started. We enjoy working hard under the able guidance of our coach Mr. Santanu Gogoi and former player Mr. Bhuppi Singh. Consistency in performance is our trademark. We not only routinely participate in other prestigious competitions like Assam Olympics, North East Games, Assam state level weightlifting competition etc. but also secure several medals…………Yes, including the Gold! The club is equipped with Olympic standard Barbells and Weights. “Go Heavy or Go Home.” ");
        super.onViewCreated(view, savedInstanceState);
    }



}

