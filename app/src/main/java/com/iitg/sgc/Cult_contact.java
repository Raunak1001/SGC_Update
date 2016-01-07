package com.iitg.sgc;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iitg.sgc.Cult_clubs.Anchor;
import com.iitg.sgc.Cult_clubs.Dance;
import com.iitg.sgc.Cult_clubs.Drama;
import com.iitg.sgc.Cult_clubs.FineArts;
import com.iitg.sgc.Cult_clubs.Literary;
import com.iitg.sgc.Cult_clubs.Movie;
import com.iitg.sgc.Cult_clubs.Music;
import com.iitg.sgc.Cult_clubs.Photo;
import com.iitg.sgc.Sports_Clubs.Aquatics;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Cult_contact extends android.support.v4.app.Fragment implements View.OnClickListener {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
    String[] clubs={"Anchoring Club","Dance Club","Drama Club ","Fine Arts Club","Literary Club","Movie Club","Music Club","Photography Club"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.cult_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iv1=(ImageView)getActivity().findViewById(R.id.ivcult1);
        iv1.setOnClickListener(this);
        iv2=(ImageView)getActivity().findViewById(R.id.ivcult2);
        iv2.setOnClickListener(this);
        iv3=(ImageView)getActivity().findViewById(R.id.ivcult3);
        iv3.setOnClickListener(this);
        iv4=(ImageView)getActivity().findViewById(R.id.ivcult4);
        iv4.setOnClickListener(this);
        iv5=(ImageView)getActivity().findViewById(R.id.ivcult5);
        iv5.setOnClickListener(this);
        iv6=(ImageView)getActivity().findViewById(R.id.ivcult6);
        iv6.setOnClickListener(this);
        iv7=(ImageView)getActivity().findViewById(R.id.ivcult7);
        iv7.setOnClickListener(this);
        iv8=(ImageView)getActivity().findViewById(R.id.ivcult8);
        iv8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
switch (v.getId()){

    case R.id.ivcult1:
        Intent a =new Intent(getActivity(),Anchor.class);
        startActivity(a);
            break;

    case R.id.ivcult2:
        Intent b =new Intent(getActivity(),Dance.class);
        startActivity(b);
        break;
    case R.id.ivcult3:
        Intent c =new Intent(getActivity(),Drama.class);

        startActivity(c);
        break;
    case R.id.ivcult4:
        Intent d =new Intent(getActivity(),FineArts.class);

        startActivity(d);
        break;
    case R.id.ivcult5:
        Intent e =new Intent(getActivity(),Literary.class);

        startActivity(e);
        break;
    case R.id.ivcult6:
        Intent f =new Intent(getActivity(),Movie.class);

        startActivity(f);
        break;
    case R.id.ivcult7:
        Intent g =new Intent(getActivity(),Music.class);

        startActivity(g);
        break;
    case R.id.ivcult8:
        Intent h =new Intent(getActivity(),Photo.class);

        startActivity(h);
        break;




}



    }
}