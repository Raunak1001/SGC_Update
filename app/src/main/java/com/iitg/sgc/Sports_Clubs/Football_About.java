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
public class Football_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.football_about,container,false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvFootball);
tv.setText("We encourage people to take up football and help organise Inter IIT coaching sessions, NSO sessions, spardha, spirit,football league and many other football related events. What sets our club apart is our strong team-spirit, dedication, camaraderie, the amazing bonding, the fun and frolic and the constant on-field banter we indulge in. Playing football with your feet is one thing, playing football with your heart is another.");
        super.onViewCreated(view, savedInstanceState);
    }

}
