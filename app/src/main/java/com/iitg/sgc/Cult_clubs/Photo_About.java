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
public class Photo_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.photo_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvPhoto);
        tv.setText("Montage - The Photography Club, IIT Guwahati is a group of Like Minded IITG members, which includes mostly Students, Faculty members and staff members who expresses their Love and Passion for Photography and like to capture Beautiful moments and express their feelings in the form of Photographs. The Club members are mostly Amateur Photographers who come together and help each other’s to learn the art of Photography, and Undertake Photography as an Interesting Hobby. The club had been an integral part of IIT Guwahati Cultural from last 7-8 years.");
        super.onViewCreated(view, savedInstanceState);
    }
}