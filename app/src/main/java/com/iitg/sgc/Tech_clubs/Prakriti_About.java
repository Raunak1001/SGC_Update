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
public class Prakriti_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.prakriti_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvPrakriti);
        tv.setText("Welcome all to the lush green beautiful campus of IITG located near the banks of the majestic Brahmaputra river, having serene divine beauty. “Prakriti” is a Hindi word and means nature or the environment. Through plantation drives, solving problems of waste disposal, invited talks by leading activists and more such amicable initiatives, we, a group of environment enthusiasts strive to establish harmony between the flora and fauna. So, to all those who want to be a part of a change, to all those who are nature lovers, this is the most apt place. You’ll get lot to learn and more so, you can contribute immensely to an exorbitant environment friendly IITG!");
        super.onViewCreated(view, savedInstanceState);
    }
}