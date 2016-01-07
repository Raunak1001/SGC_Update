package com.iitg.sgc.Cult_clubs;

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
public class Anchor_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.anchor_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvAnchor);
        tv.setText("What is one thing everyone associates with a cultural festival like Alcheringa, a rock performance, your cult nights, debates or even a technical fest like Techniche? An engrossing experience! And while everything, for the performances to the prizes may be in place, the events would be incomplete without someone to bind the audience’s interest, ensuring the smooth conduct of the performances, damage controlling an emergency or two and on the whole, ensuring everyone has the time of their lives! To every event organizers’ rescue, comes the Anchoring Club of IIT-G, spicing up even the blandest of offerings and imparting stage skills to the the IIT-G junta since 2006.");
        super.onViewCreated(view, savedInstanceState);
    }
}