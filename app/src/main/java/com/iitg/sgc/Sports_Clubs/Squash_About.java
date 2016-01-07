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
public class Squash_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.squash_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvSquash);
tv.setText("Squash Club is a very active club. Racquets of the best quality are available for practice.We organize regular sessions for practice for inter IIT Sports meet during odd semesters,we organize Squash event in Spardha, Inter Hostel Sports competition of IIT Guwahati and Squash Ladder tournament during even semester.Squash Ladder Tournament is an individual competition in which all the players are initially given some rank and then they challenge players with higher rank and if they succeed in defeating him the ranks get exchanged and at last we get a final winner who holds rank 1. \n" +
        "\n" +
        "The squash ladder tournament is open for all the people in the campus and it normally commences in first week of March and continues till mid-April.");
        super.onViewCreated(view, savedInstanceState);
    }



}