package com.iitg.sgc.Tech_clubs;

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
public class Finance_Contact extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.finance_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvFin2);
        tv2.setText("125,Kapili" + "\n" + "Contact: 7896365115" + "\n" + "Webmail: saurav.mohanty");
        TextView tv1 = (TextView) getActivity().findViewById(R.id.tvFin1);
        TextView tv3 = (TextView) getActivity().findViewById(R.id.tvFin3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvFin1:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003894258161"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saurav.mohanty.393")));

                }

                break;
            case R.id.tvFin2:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003894258161"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saurav.mohanty.393")));

                }
                break;
            case R.id.tvFin3:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://group/1402272670092457"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/1402272670092457/")));

                }
                break;
        }
    }
}