package com.iitg.sgc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iitg.sgc.Sports_Clubs.Aquatics;
import com.iitg.sgc.Sports_Clubs.Athletics;
import com.iitg.sgc.Sports_Clubs.Badminton;
import com.iitg.sgc.Sports_Clubs.Basketball;
import com.iitg.sgc.Sports_Clubs.Cricket;
import com.iitg.sgc.Sports_Clubs.Football;
import com.iitg.sgc.Sports_Clubs.Hockey;
import com.iitg.sgc.Sports_Clubs.Squash;
import com.iitg.sgc.Sports_Clubs.TT;
import com.iitg.sgc.Sports_Clubs.Tennis;
import com.iitg.sgc.Sports_Clubs.Volleyball;
import com.iitg.sgc.Sports_Clubs.WeightLifting;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Sports_contact extends android.support.v4.app.Fragment implements View.OnClickListener {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.sports_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iv1=(ImageView)getActivity().findViewById(R.id.ivsports1);
        iv1.setOnClickListener(this);
        iv2=(ImageView)getActivity().findViewById(R.id.ivsports2);
        iv2.setOnClickListener(this);
        iv3=(ImageView)getActivity().findViewById(R.id.ivsports3);
        iv3.setOnClickListener(this);
        iv4=(ImageView)getActivity().findViewById(R.id.ivsports4);
        iv4.setOnClickListener(this);
        iv5=(ImageView)getActivity().findViewById(R.id.ivsports5);
        iv5.setOnClickListener(this);
        iv6=(ImageView)getActivity().findViewById(R.id.ivsports6);
        iv6.setOnClickListener(this);
        iv7=(ImageView)getActivity().findViewById(R.id.ivsports7);
        iv7.setOnClickListener(this);
        iv8=(ImageView)getActivity().findViewById(R.id.ivsports8);
        iv8.setOnClickListener(this);
        iv9=(ImageView)getActivity().findViewById(R.id.ivsports9);
        iv9.setOnClickListener(this);
        iv10=(ImageView)getActivity().findViewById(R.id.ivsports10);
        iv10.setOnClickListener(this);
        iv11=(ImageView)getActivity().findViewById(R.id.ivsports11);
        iv11.setOnClickListener(this);
        iv12=(ImageView)getActivity().findViewById(R.id.ivsports12);
        iv12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.ivsports1:

                Intent a =new Intent(getActivity(),Aquatics.class);

           startActivity(a);
            break;

            case R.id.ivsports2:
                Intent b =new Intent(getActivity(), Athletics.class);

                startActivity(b);
                break;
            case R.id.ivsports3:
                Intent c =new Intent(getActivity(), Badminton.class);

                startActivity(c);
                break;
            case R.id.ivsports4:
                Intent d=new Intent(getActivity(), Basketball.class);

                startActivity(d);
                break;
            case R.id.ivsports5:
                Intent e =new Intent(getActivity(), Cricket.class);

                startActivity(e);
                break;
            case R.id.ivsports6:
                Intent f =new Intent(getActivity(), Football.class);

                startActivity(f);
                break;
            case R.id.ivsports7:
                Intent g =new Intent(getActivity(), Hockey.class);

                startActivity(g);
                break;
            case R.id.ivsports8:
                Intent h =new Intent(getActivity(), Squash.class);

                startActivity(h);
                break;
            case R.id.ivsports9:
                Intent i =new Intent(getActivity(), Tennis.class);

                startActivity(i);
                break;
            case R.id.ivsports10:
                Intent j =new Intent(getActivity(), TT.class);

                startActivity(j);
                break;
            case R.id.ivsports11:
                Intent k =new Intent(getActivity(), Volleyball.class);

                startActivity(k);
                break;
            case R.id.ivsports12:
                Intent l =new Intent(getActivity(),WeightLifting.class);

                startActivity(l);
                break;

        }
    }}