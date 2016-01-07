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
public class Tennis_contact  extends Fragment implements View.OnClickListener{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tennis_contact,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvTen2);
        tv2.setText("B202 - Barak Hostel" + "\n" + "Contact: +91 8011034596" + "\n" + "Webmail: h.jasani");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvTen1);
        TextView tv3=(TextView)getActivity().findViewById(R.id.tvTen3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvTen1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1526654480"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/harsh.jasani")));

                }

                break;
            case R.id.tvTen2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1526654480"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/harsh.jasani")));

                }
                break;
            case R.id.tvTen3:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://group/199485686758576"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/tennisiitg/")));

                }
                break;
        }
    }
}