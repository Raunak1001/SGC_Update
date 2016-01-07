package com.iitg.sgc.Tech_clubs;

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
public class EDC_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.edc_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvEDC);
        tv.setText("At EDC, we understand and believe that this fast changing and evolving era is the perfect time to live in and step-up to shape our future by looking at the world as our playground! So, aiming to promote the spirit of entrepreneurship amongst the IITG community as well as the youth of the North-East India, we host various workshops, lectures, innovative games, \n" +
                "brainstorming sessions, competitions which provide a complete learning experience to the attendees and fill them with the zeal to change their monotonous lives! \n");
        super.onViewCreated(view, savedInstanceState);
    }
}