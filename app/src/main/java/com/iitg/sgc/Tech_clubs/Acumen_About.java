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
public class Acumen_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.acumen_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvAcumen);
        tv.setText("Quiz Club has been one of the most successful and active clubs in the North East region. Regular finalist and winners of quizzes like Tata Crucible and various Assam Quiz Association quizzes, the Quiz Club of IITG has been making waves in the north east quizzing circuit. Quiz Club is currently composed of passionate knowledge seeking individuals specializing in different genres like Movies, Sports, India etc. Quiz Club regularly hosts quizzes across the year like General Quiz, India Quiz, Sports quiz etc and also on popular topics like Harry Potter, Game of Thrones, F.R.I.E.N.D.S etc.");
        super.onViewCreated(view, savedInstanceState);
    }
}
