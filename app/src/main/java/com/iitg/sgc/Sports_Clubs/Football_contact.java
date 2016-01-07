package com.iitg.sgc.Sports_Clubs;

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
 * Created by Raunak on 10/6/2015.
 */
public class Football_contact  extends Fragment implements View.OnClickListener{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.football_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvFoo2);
        tv2.setText("B-201 Manas Hostel" + "\n" + "Contact: +91-8011026310" + "\n" + "Webmail: aditya2013");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvFoo1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvFoo3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvFoo1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000712934619"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/maddicted.adi")));

                }

                break;
            case R.id.tvFoo2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000712934619"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/maddicted.adi")));

                }
                break;
            case R.id.tvFoo3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://group/1561661917432925"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/footballclubiitg/")));

                }
                break;
        }
    }
}