package com.iitg.sgc;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.iitg.sgc.Cult_clubs.Anchor;
import com.iitg.sgc.Tech_clubs.Acumen;
import com.iitg.sgc.Tech_clubs.Aero;
import com.iitg.sgc.Tech_clubs.Astro;
import com.iitg.sgc.Tech_clubs.Auto;
import com.iitg.sgc.Tech_clubs.Coding;
import com.iitg.sgc.Tech_clubs.EDC;
import com.iitg.sgc.Tech_clubs.Electronics;
import com.iitg.sgc.Tech_clubs.Finance;
import com.iitg.sgc.Tech_clubs.Prakriti;
import com.iitg.sgc.Tech_clubs.Radio;
import com.iitg.sgc.Tech_clubs.Robotics;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Tech_contact extends android.support.v4.app.Fragment implements View.OnClickListener {

    String[] clubs = {"Aeromodelling Club", "Astronomy Club", "Coding Club ", "Electronics Club", "EDC", "Robotics Club", "Automobile Club", "Acumen", "Finance & Electronics Club", "Prakriti", "RadioG"};
ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tech_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    iv1=(ImageView)getActivity().findViewById(R.id.ivtech1);
        iv1.setOnClickListener(this);

        iv2=(ImageView)getActivity().findViewById(R.id.ivtech2);
        iv2.setOnClickListener(this);
        iv3=(ImageView)getActivity().findViewById(R.id.ivtech3);
        iv3.setOnClickListener(this);
        iv4=(ImageView)getActivity().findViewById(R.id.ivtech4);
        iv4.setOnClickListener(this);
        iv5=(ImageView)getActivity().findViewById(R.id.ivtech5);
        iv5.setOnClickListener(this);
        iv6=(ImageView)getActivity().findViewById(R.id.ivtech6);
        iv6.setOnClickListener(this);
        iv7=(ImageView)getActivity().findViewById(R.id.ivtech7);
        iv7.setOnClickListener(this);
        iv8=(ImageView)getActivity().findViewById(R.id.ivtech8);
        iv8.setOnClickListener(this);
        iv9=(ImageView)getActivity().findViewById(R.id.ivtech9);
        iv9.setOnClickListener(this);
        iv10=(ImageView)getActivity().findViewById(R.id.ivtech10);
        iv10.setOnClickListener(this);
        iv11=(ImageView)getActivity().findViewById(R.id.ivtech11);
        iv11.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

switch (v.getId()){

    case R.id.ivtech1:
        Intent a =new Intent(getActivity(),Acumen.class);
        startActivity(a);
        break;
    case R.id.ivtech2:
        Intent b =new Intent(getActivity(),Aero.class);
        startActivity(b);
        break;
    case R.id.ivtech3:
        Intent c =new Intent(getActivity(),Astro.class);
        startActivity(c);
        break;
    case R.id.ivtech4:
        Intent d =new Intent(getActivity(),Auto.class);
        startActivity(d);
        break;
    case R.id.ivtech5:
        Intent e =new Intent(getActivity(),Coding.class);
        startActivity(e);
        break;
    case R.id.ivtech6:
        Intent f =new Intent(getActivity(),EDC.class);
        startActivity(f);
        break;
    case R.id.ivtech7:
        Intent g =new Intent(getActivity(),Electronics.class);
        startActivity(g);
        break;
    case R.id.ivtech8:
        Intent h =new Intent(getActivity(),Finance.class);
        startActivity(h);
        break;
    case R.id.ivtech9:
        Intent i =new Intent(getActivity(),Prakriti.class);
        startActivity(i);
        break;
    case R.id.ivtech10:
        Intent j =new Intent(getActivity(),Radio.class);
        startActivity(j);
        break;
    case R.id.ivtech11:
        Intent k =new Intent(getActivity(),Robotics.class);
        startActivity(k);
        break;





}







    }
}