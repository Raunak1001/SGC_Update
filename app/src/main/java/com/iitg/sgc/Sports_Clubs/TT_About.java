package com.iitg.sgc.Sports_Clubs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iitg.sgc.R;

/**
 * Created by Raunak on 10/6/2015.
 */
public class TT_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tt_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvTT);
tv.setText("The members of the club strive to hone their skills in Table Tennis through daily practice.Besides, we motivate and help new players to learn the game.\n" +
        "\n" +
        "-Table Tennis is like an atom. To the ignorant it is merely microscopic and insignificant in existence, but to the dedicated, it is intricate in design and the building block to everything we know.");
        super.onViewCreated(view, savedInstanceState);
    }



}
