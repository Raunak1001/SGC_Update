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
public class Tech_About extends android.support.v4.app.Fragment implements View.OnClickListener{
    TextView tv,tv2,tv3,tv4,tv5,tv6,tv7;
    String about,about2,about3,about4,about5,about6,about7;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tech_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        tv =(TextView)getActivity().findViewById(R.id.tvtech_about);
        tv2 =(TextView)getActivity().findViewById(R.id.tvtech_chair1);
        tv3 =(TextView)getActivity().findViewById(R.id.tvtech_chair2);
        tv4 =(TextView)getActivity().findViewById(R.id.tvtech_gen1);
        tv5 =(TextView)getActivity().findViewById(R.id.tvtech_gen2);
        tv6 =(TextView)getActivity().findViewById(R.id.tvtech_event1);
        tv7 =(TextView)getActivity().findViewById(R.id.tvtech_event2);

    about="With the motto of promoting technology, creativity and innovation, the Technical Board understands and believes that this fast changing and evolving era is the perfect time to live in and step-up to shape our future by looking at the world as our playground!\n" +
            "\n" +
            "Many students have that creative urge in them ready to shoot out at any moment. They have dreamt and believed that they were supposed to do something amazing, special, important and outstanding and they were destined for success! Those who believe that they can innovate, create and build their own future, Technical Board provides them with both the opportunity and support to help them leave their mark, make a difference and leave their legacy by choice and not by chance!\n";
tv.setText(about);


        about2="Dr. Karuna Kalita";
        about3="Associate Professor\n" +
                "Room No. 302 D-Block\n" +
                "Mechanical Engineering\n" +
                "Contact: +91 361 258 2680\n" +
                "Webmail: chrtb@iitg.ac.in";

        about4="Paawan Talwar";
        about5="B.Tech, Final year\n" +
                "148, Siang Hostel\n" +
                "Contact: +91-847 399 5760\n" +
                "Webmail: techsec";

        about6="Kuldeep Singh Parewa";
        about7 ="46, Kapili Hostel \n" +
                "Contact: +91-757 691 8642\n" +
                "Webmail: k.parewa";


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


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tvtech_gen1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-847 399 5760"));
                startActivity(a);

                break;

            case R.id.tvtech_gen2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-847 399 5760"));
                startActivity(b);
                break;

            case R.id.tvtech_event1:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-757 691 8642"));
                startActivity(c);
                break;

            case R.id.tvtech_event2:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-757 691 8642"));
                startActivity(d);
                break;

            case R.id.tvtech_chair1:
                Intent e = new Intent(Intent.ACTION_DIAL);
                e.setData(Uri.parse("tel:+91 361 258 2427"));
                startActivity(e);
                break;
            case R.id.tvtech_chair2:
                Intent f = new Intent(Intent.ACTION_DIAL);
                f.setData(Uri.parse("tel:+91 361 258 2427"));
                startActivity(f);
                break;
        }


    }
}