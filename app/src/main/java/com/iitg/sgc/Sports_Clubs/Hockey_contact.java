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
public class Hockey_contact  extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hockey_contact,container,false);
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvHoc2);
        tv2.setText("A-230 Umiam Hostel" + "\n" + "Contact: +91 801 103 6755" + "\n" + "Webmail: n.suraj");
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvHoc1);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvHoc1:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001039771181"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100001039771181")));

                }

                break;
            case R.id.tvHoc2:

                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001039771181"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100001039771181")));

                }
                break;

        }
    }
}