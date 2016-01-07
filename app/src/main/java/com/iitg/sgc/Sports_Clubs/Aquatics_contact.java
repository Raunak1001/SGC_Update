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
 * Created by Raunak on 10/5/2015.
 */
public class Aquatics_contact extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aquatics_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvAqu2);
        tv2.setText("B1-123 Kameng Hostel" + "\n" + "Contact: +91 865 021 1111" + "\n" + "Webmail: ritvik");
        TextView tv1 = (TextView) getActivity().findViewById(R.id.tvAqu1);
        TextView tv3 = (TextView) getActivity().findViewById(R.id.tvAqu3);
        tv2.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv3.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvAqu1:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100008019016163"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RiiitviiikRAWat")));

                }

                break;
            case R.id.tvAqu2:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100008019016163"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RiiitviiikRAWat")));

                }
                break;
            case R.id.tvAqu3:

                try {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Aquatics-Club-IIT-Guwahati-108980352490511/"));
                    startActivity(intent);

                } catch (Exception e) {

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Aquatics-Club-IIT-Guwahati-108980352490511/")));

                }
                break;
        }
    }
}

