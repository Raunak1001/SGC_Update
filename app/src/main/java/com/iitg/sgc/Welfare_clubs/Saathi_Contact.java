package com.iitg.sgc.Welfare_clubs;

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
public class Saathi_Contact extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.saathi_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvSaa2);
        tv2.setText("A-304, Manas Hostel" + "\n" + "Contact: +91-8011036179 " + "\n" + "Webmail: krishna.a");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvSaa1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvSaa3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvSaa1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002416814044"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100002416814044")));

                }

                break;
            case R.id.tvSaa2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002416814044"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100002416814044")));

                }
                break;
            case R.id.tvSaa3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saathi.counsellingservice.iitguwahati"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saathi.counsellingservice.iitguwahati")));

                }
                break;
        }
    }
}