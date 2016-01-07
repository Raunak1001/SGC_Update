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
public class Cult_about extends android.support.v4.app.Fragment implements View.OnClickListener {

    TextView tv,tv2,tv3,tv4,tv5,tv6,tv7;
    String about,about2,about3,about4,about5,about6,about7;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.cult_about,container,false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv=(TextView)getActivity().findViewById(R.id.tvcult_about);
        tv2=(TextView)getActivity().findViewById(R.id.tvcult_chair1);
        tv3=(TextView)getActivity().findViewById(R.id.tvcult_chair2);
        tv4=(TextView)getActivity().findViewById(R.id.tvcult_gen1);
        tv5=(TextView)getActivity().findViewById(R.id.tvcult_gen2);
        tv6=(TextView)getActivity().findViewById(R.id.tvcult_event1);
        tv7=(TextView)getActivity().findViewById(R.id.tvcult_event2);

        about="IIT G is packed with culture in every sense of the word. You’ll not only find plenty of people who share the same interests as you, but you’ll also have the opportunity to break out and try something different. A perfect platform for the campus junta to come forward and showcase their talents. We aim at nurturing the skills and upbringing of the hidden co-curricular talents.";
        about2="Dr. Kaustabha Mohanty";
        about3="Associate Professor\n" +
                "Room No. 202\n" +
                "Chemical Engineering\n" +
                "Contact: +91-361-258-2267";

        about4="Chaitanya Sangani";
        about5="B.Tech, Pre-Final year\n" +
                "B3-330, Kameng Hostel\n" +
                "Contact: +91-8011035925";

        about6="Pragyam Maheshwari";
        about7="222, Lohit Hostel\n" +
                "Contact: +91-7597075404\n" +
                "Webmail: pragyam";


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


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tvcult_chair1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-361-258-2267"));
                startActivity(a);

                break;

            case R.id.tvcult_chair2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-361-258-2267"));
                startActivity(b);
                break;

            case R.id.tvcult_gen1:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(c);
                break;

            case R.id.tvcult_gen2:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(d);
                break;

            case R.id.tvcult_event1:
                Intent e = new Intent(Intent.ACTION_DIAL);
                e.setData(Uri.parse("tel:+91-7597075404"));
                startActivity(e);
                break;
            case R.id.tvcult_event2:
                Intent f = new Intent(Intent.ACTION_DIAL);
                f.setData(Uri.parse("tel:+91-7597075404"));
                startActivity(f);
                break;
        }


    }


}


