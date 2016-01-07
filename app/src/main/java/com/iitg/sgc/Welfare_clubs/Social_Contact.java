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
public class Social_Contact extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.social_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvSoc2);
        tv2.setText("AF-29, Dhansiri Hostel" + "\n" + "Contact: +91-9957740468" + "\n" + "Webmail: k.aishwarya");
        TextView tv1 = (TextView) getActivity().findViewById(R.id.tvSoc1);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvAcu1:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000655922971"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aishwarya.kar")));

                }

                break;
            case R.id.tvAcu2:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000655922971"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aishwarya.kar")));

                }
                break;

        }
    }

}