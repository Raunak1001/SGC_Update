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
public class Music_Contact extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.music_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvMus2);
        tv2.setText("B-216, Barak Hostel" + "\n" + "Contact: 8011037312" + "\n" + "Webmail: surya.prakash");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvMus1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvMus3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvMus1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000381447421"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/surya10050")));

                }

                break;
            case R.id.tvMus2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000381447421"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/surya10050")));

                }
                break;
            case R.id.tvMus3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/musicclubiitg"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/musicclubiitg")));

                }
                break;
        }
    }
}