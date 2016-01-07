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
public class FineArts_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.finearts_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvFine);
        tv.setText("Finnese Art is the most sublime mission of man since it is the exercise of thought, seeking to understand the world and make it understood, and that is what we, Finesse- the Fine arts club, seek to do in this club. We feel a campus poised on sheer scientific thrills requires a balancing dose of art so that aesthetics and beauty around us are not forgotten.");
        super.onViewCreated(view, savedInstanceState);
    }
}