package com.iitg.sgc.Welfare_clubs;

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
public class Academic_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.academic_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvAcademic);
        tv.setText("We are a board which came into existence last year due to fact that a lot of people face problem in Academics in their first year due to various reasons like having problem in understanding Language, Phobia of asking questions in class and many other reasons");
        super.onViewCreated(view, savedInstanceState);
    }
}