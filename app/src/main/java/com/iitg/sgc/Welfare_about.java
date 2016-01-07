package com.iitg.sgc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Welfare_about extends android.support.v4.app.Fragment implements View.OnClickListener {

    TextView tv,tv2,tv3,tv4,tv5;
    String about,about2,about3,about4,about5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.welfare_about,container,false);
    }

    @Override
    public void onViewCreated (View view, @Nullable Bundle savedInstanceState) {
        tv=(TextView)getActivity().findViewById(R.id.tvWelfareAbout);
        about="Students’ Welfare Board (SWB) is committed to the total development of the students of IIT-Guwahati. The Welfare Service forms part of Campus Well-being Services and is committed to providing free professional and confidential support to enhance the well-being of the campus community. Based on the founding principles of the university, SWB implements programs and activities designed to nurture and develop the mind, body, and spirit.";
        tv.setText(about);
        super.onViewCreated(view, savedInstanceState);

        tv2=(TextView)getActivity().findViewById(R.id.tvwel_chair1);
        tv3=(TextView)getActivity().findViewById(R.id.tvwel_chair2);
        tv4=(TextView)getActivity().findViewById(R.id.tvwel_gen1);
        tv5=(TextView)getActivity().findViewById(R.id.tvwel_gen2);

        about2="Dr. Biman B. Mandal";
        about3="Associate Professor,\n" +
                "Room No. 107 N-Block\n" +
                "Department of Biosciences and Bioengineering\n" +
                "Contact: +91 361 258 2225\n" +
                "Webmail: chrwb@iitg.ernet.in\n" +
                "biman.mandal@iitg.ernet.in";

        about4="Mohammed Zilani";
        about5="A-247, Barak Hostel\n" +
                "Roll Number: 120104041\n" +
                "Contact: +91- 8876577383\n" +
                "gensec_welfare@iitg.ernet.in\n" +
                "msmzilani27@gmail.com";

       tv2.setText(about2);
        tv3.setText(about3);
        tv4.setText(about4);
        tv5.setText(about5);

        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tvwel_chair1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91 361 258 220"));
                startActivity(a);

                break;

            case R.id.tvwel_chair2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91 361 258 220"));
                startActivity(b);
                break;

            case R.id.tvwel_gen1:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91- 8876577383"));
                startActivity(c);
                break;

            case R.id.tvwel_gen2:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91- 8876577383"));
                startActivity(d);
                break;


        }


    }


}