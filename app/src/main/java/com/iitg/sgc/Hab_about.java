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

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Hab_about extends android.support.v4.app.Fragment implements View.OnClickListener{
    TextView tv,tv2,tv3,tv4,tv5;
String about,about2,about3,about4,about5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hab_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        tv = (TextView) getActivity().findViewById(R.id.tvHabAbout);
        about = "The Hostel Affairs Board is the apex decision and policy making body for Hostels. " +
                "It acts as a central coordinating body and its main function is to ensure proper working of the Hostel Management" +
                " Committees (HMC) in individual hostels as per the directions laid by the Hostel Constitution and the HAB" +
                " Procedures And Resolutions (HABPR). The HAB works under the purview of the Hostel Constitution and ensures" +
                " that the rules and policies set up are followed.";
        tv.setText(about);

        tv2 = (TextView) getActivity().findViewById(R.id.tvhab_chair1);
        tv3 = (TextView) getActivity().findViewById(R.id.tvhab_chair2);

        tv4 = (TextView) getActivity().findViewById(R.id.tvhab_gen1);
        tv5 = (TextView) getActivity().findViewById(R.id.tvhab_gen2);



        about2="Dr. C. Mallikarjuna";
        about3="Department: CE\n" +
                "Contact: 9435732401\n" +
                "Dept. Phone: 2424\n" +
                "Res. Phone: 4424\n" +
                "HAB Phone No.: 2164\n" +
                "chr_hab @ iitg.ernet.in";

        about4="Naresh Kumar Peddinti";
        about5="General Secretary,\n" +
                "HAB\n" +
                "Mobile: 9085702585" +"\n" +
                "Address: room-258, Kapili Hostel";
        tv2.setText(about2);
        tv3.setText(about3);
tv4.setText(about4);
        tv5.setText(about5);
tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tvhab_chair1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-9435732401"));
                startActivity(a);

                break;

            case R.id.tvhab_chair2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-9435732401"));
                startActivity(b);
                break;

            case R.id.tvhab_gen1:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(c);
                break;

            case R.id.tvhab_gen2:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(d);
                break;




        }
    }
}