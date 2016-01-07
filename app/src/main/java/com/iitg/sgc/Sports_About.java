package com.iitg.sgc;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Sports_About extends android.support.v4.app.Fragment implements View.OnClickListener {
    TextView tv,tv2,tv3,tv4,tv5,tv6,tv7;
            String about,about2,about3,about4,about5,about6,about7;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sports_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
         tv = (TextView) getActivity().findViewById(R.id.tvSportsAbout);
         about = "You are here for an overall development of your personality, so to keep you healthy and fit, we have all the facilities for sports, both indoor and outdoor.\n" +
                "\n" +
                "All outdoor sports like athletics, swimming, cricket, football, hockey, basketball, volleyball, etc. and indoor sports like table tennis, weight lifting, chess, carrom, squash, etc. are actively played by all throughout the year.\n" +
                "\n" +
                "We organize and promote all extra-curricular activities in the field of sports. It has currently twelve clubs: Athletics and Gymnastics Club, aquatics Club, Badminton Club, Basketball Club, Cricket Club, Football Club, Hockey Club, Lawn Tennis Club, Table Tennis Club, Squash Club, Volleyball Club and Weightlifting Club. The three main events conducted every year are Inter IIT Sports Meet, Spardha and Spirit.";

        tv2 = (TextView) getActivity().findViewById(R.id.tvsports_chair1);
        tv3 = (TextView) getActivity().findViewById(R.id.tvsports_chair2);
        tv4 = (TextView) getActivity().findViewById(R.id.tvsports_gen1);
        tv5 = (TextView) getActivity().findViewById(R.id.tvsports_gen2);
        tv6 = (TextView) getActivity().findViewById(R.id.tvsports_event1);
        tv7 = (TextView) getActivity().findViewById(R.id.tvsports_event2);

        about2="Dr. Perumal Alagarsamy";
        about3="Professor\n" +
                "Room No. 304,\n" +
                "Department of Physics\n" +
                "Contact: +91 361 258 2714\n" +
                "chrsports@iitg.ac.in";

        about4="Sai Sushanth Akula";
        about5="B.Tech, Final year\n" +
                "254, Siang\n" +
                "Contact: +91-801 102 5452\n" +
                "Webmail: sportsec";

about6="Nihar Lohiya";
        about7="A-223,Lohit Hostel\n" +
                "Contact: +91-801 149 1720\n" +
                "Webmail: l.nishant";







        tv.setText(about);
        tv2.setText(about2);
        tv3.setText(about3);
        tv4.setText(about4);
        tv5.setText(about5);
        tv6.setText(about6);
        tv7.setText(about7);

        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);


        super.onViewCreated(view, savedInstanceState);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tvsports_chair1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91 361 258 2714"));
                startActivity(a);

                break;

            case R.id.tvsports_chair2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91 361 258 2714"));
                startActivity(b);
                break;

            case R.id.tvsports_gen1:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-801 102 5452"));
                startActivity(c);
                break;

            case R.id.tvsports_gen2:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-801 102 5452"));
                startActivity(d);
                break;

            case R.id.tvsports_event1:
                Intent e = new Intent(Intent.ACTION_DIAL);
                e.setData(Uri.parse("tel:+91-801 149 1720"));
                startActivity(e);
                break;
            case R.id.tvsports_event2:
                Intent f = new Intent(Intent.ACTION_DIAL);
                f.setData(Uri.parse("tel:+91-801 149 1720"));
                startActivity(f);
                break;
        }


    }
}
