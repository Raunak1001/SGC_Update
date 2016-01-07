package com.iitg.sgc.Cult_clubs;

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
public class Dance_Contact extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dance_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvDan2);
        tv2.setText("Subansiri Hostel\n" +
                "Contact: 9085289715\n" +
                "Webmail: k.jyothi");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvDan1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvDan3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvDan1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100006186911445"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/arunjyothi.kethavath")));

                }

                break;
            case R.id.tvDan2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100006186911445"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/arunjyothi.kethavath")));

                }
                break;
            case R.id.tvDan3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cadence.iitg"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cadence.iitg")));

                }
                break;
        }
    }
}
