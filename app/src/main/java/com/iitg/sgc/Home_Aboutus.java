package com.iitg.sgc;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by Raunak on 10/2/2015.
 */
public class Home_Aboutus extends android.support.v4.app.Fragment implements View.OnClickListener {
    TextView tv1,tv2,tv3;
    String about,title;
    ViewFlipper vf;
    String notificationText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.home_aboutus,container,false);
    }


    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv3=(TextView)getActivity().findViewById(R.id.tvhome_about1);
        tv1=(TextView)getActivity().findViewById(R.id.tvhome_title);
        tv2=(TextView)getActivity().findViewById(R.id.tvhome_about);
        vf=(ViewFlipper)getActivity().findViewById(R.id.vfhome_about);
        vf.setFlipInterval(2000);
        title="STUDENTS' GYMKHANA COUNCIL";

        about="Students' Gymkhana Council is the body that promotes the objectives of fostering extra-curricular, co-curricular activities, welfare of students, and their stay in the campus.";

        tv2.setText(about);
        tv1.setText(title);
        tv1.setTextColor(Color.rgb(27,149,150));
        tv3.setText("Students' Gymkhana Council, New SAC Building\n" +
                "IIT Guwahati, Guwahati (Assam) - 781039\n"+
        "© Students' Gymkhana Council, IIT Guwahati\n" +
                "Maintained by Digital Ops Team, SGC IIT Guwahati ");
    }



    @Override
    public void onClick(View v) {

    }



    }







