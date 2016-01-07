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
public class EDC_Contact extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.edc_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvEDC2);
        tv2.setText("B-128, Umiam Hostel" + "\n" + "Contact: 8011036864" + "\n" + "Webmail: r.kande");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvEDC1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvEDC3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvEDC1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002983312679"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rahul.kande.16")));

                }

                break;
            case R.id.tvEDC2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002983312679"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rahul.kande.16")));

                }
                break;
            case R.id.tvEDC3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EDC.IITG"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EDC.IITG")));

                }
                break;
        }
    }
}