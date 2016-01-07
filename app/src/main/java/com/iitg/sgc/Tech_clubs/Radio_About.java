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
public class Radio_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.radio_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvRadio);
        tv.setText("With a diverse array of events; the likes of Mushaira, Group Discussions, Celebrity Interviews Standup-Comedy, Mr. n Ms. Fresher, Candid Camera, and of course, live radio shows, RadioG strives to enable effective expression. So while the stage bears a glum look, we guys heat up things on the microphone, with the campus hooked on to each one of our words! So if YOU wanna join the fun, come hither to completely change your personality and be part of the crazy ride!");
        super.onViewCreated(view, savedInstanceState);
    }
}