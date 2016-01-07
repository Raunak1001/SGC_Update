package com.iitg.sgc.Tech_clubs;

import android.content.Intent;
import android.net.Uri;
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
public class Robotics_Contact extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.robotics_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvRob2);
        tv2.setText("301, Kapili Hostel" + "\n" + "Contact: 8011036734" + "\n" + "Webmail: r.jangir");
        TextView tv4 = (TextView) getActivity().findViewById(R.id.tvProj2);
        tv4.setText("B-145, Umiam Hostel \n" +
                "Contact: 8011034469\n" +
                "Webmail: k.raghuram");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvRob1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvRob3);
        TextView tv5=(TextView)getActivity().findViewById(R.id.tvProj2);

        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
tv4.setOnClickListener(this);
        tv5.setOnClickListener(this
        );
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvRob1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002363622241"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rishabh.jangir")));

                }

                break;
            case R.id.tvRob2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002363622241"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rishabh.jangir")));

                }
                break;
            case R.id.tvRob3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://group/120490468075088"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/120490468075088/")));

                }
                break;

        case R.id.tvProj1:

            try{

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000479150978"));
                startActivity(intent);

            }catch(Exception e){

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/krish.raghuram")));

            }

            break;
            case R.id.tvProj2:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000479150978"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/krish.raghuram")));

                }

                break;



        }
    }
}
