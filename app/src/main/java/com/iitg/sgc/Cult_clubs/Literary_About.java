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
public class Literary_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.literary_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvLit);
        tv.setText("LitSoc is an amalgamation of two disciplines – Literary and Debating. It is a club that comprises of individuals who have a passion for all things related to creative writing or debates. The members range from seasoned debaters to novices, magicians with words to interested writers. Everyone is welcome in this club.");
        super.onViewCreated(view, savedInstanceState);
    }
}