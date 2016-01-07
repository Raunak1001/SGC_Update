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
public class Drama_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drama_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvDrama);
        tv.setText("Xpressions- The Dramatics Society of IIT Guwahati and Tamachey - The Nukkad Society of IIT Guwahati is a bunch of aesthetes from the IITG family who thrives to bring a change in society by portraying the problems and issues in a riveting manner through popular art forms of dramatics - Theatre, Mimes, Nukkad Naataks(Street Play) , Movies.");
        super.onViewCreated(view, savedInstanceState);
    }
}