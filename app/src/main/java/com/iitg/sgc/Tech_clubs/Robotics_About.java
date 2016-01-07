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
public class Robotics_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.robotics_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvRobot);
        tv.setText("Being crowned the \"Best Gymkhana Club'14-15\" the Robotics Club is an innovator's paradise, even if you aren’t one our team would be working full force to teach you until you reciprocate. We still might have not been able to build the Ironman suit, but we can assure you that after seeing our projects you would be struggling to keep that jaw of yours above the ground. From Humanoids to Robotic Arms, Autonomous indoor navigation to swarm of tiny robots we build stuff that can make you the coolest among your fellow mates. Believe us when we say that none of us had any idea of Robotics when we came here, neither do we expect anything from you. All you have to do now is to come up for the Robotics Club Orientation and we will take you places from there.");
        super.onViewCreated(view, savedInstanceState);
    }
}