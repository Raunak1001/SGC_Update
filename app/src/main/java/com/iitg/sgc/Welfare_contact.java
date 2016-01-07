package com.iitg.sgc;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iitg.sgc.Tech_clubs.Acumen;
import com.iitg.sgc.Welfare_clubs.Academic;
import com.iitg.sgc.Welfare_clubs.Ribbon;
import com.iitg.sgc.Welfare_clubs.Rights;
import com.iitg.sgc.Welfare_clubs.Saathi;
import com.iitg.sgc.Welfare_clubs.Social;
import com.iitg.sgc.Welfare_clubs.Youth;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Welfare_contact extends android.support.v4.app.Fragment implements View.OnClickListener {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.welfare_contact,container,false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iv1=(ImageView)getActivity().findViewById(R.id.ivwel1);
        iv1.setOnClickListener(this);
        iv2=(ImageView)getActivity().findViewById(R.id.ivwel2);
        iv2.setOnClickListener(this);
        iv3=(ImageView)getActivity().findViewById(R.id.ivwel3);
        iv3.setOnClickListener(this);
        iv4=(ImageView)getActivity().findViewById(R.id.ivwel4);
        iv4.setOnClickListener(this);
        iv5=(ImageView)getActivity().findViewById(R.id.ivwel5);
        iv5.setOnClickListener(this);
        iv6=(ImageView)getActivity().findViewById(R.id.ivwel6);
        iv6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

switch (v.getId()){

    case R.id.ivwel1:
        Intent a =new Intent(getActivity(),Academic.class);
        startActivity(a);
        break;
    case R.id.ivwel2:
        Intent b =new Intent(getActivity(),Ribbon.class);
        startActivity(b);
        break;
    case R.id.ivwel3:
        Intent c =new Intent(getActivity(),Rights.class);
        startActivity(c);
        break;
    case R.id.ivwel4:
        Intent d =new Intent(getActivity(),Saathi.class);
        startActivity(d);
        break;
    case R.id.ivwel5:
        Intent e =new Intent(getActivity(),Social.class);
        startActivity(e);
        break;
    case R.id.ivwel6:
        Intent f =new Intent(getActivity(),Youth.class);
        startActivity(f);
        break;

}


    }
}