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
public class Tennis_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tennis_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvTennis);
tv.setText("The sheer joy of hitting a winner past the opponent or hitting an ace while the opponent glances at the ball is what we play for.\n" +
        "\n" +
        "We’re a bunch of tennis enthusiasts who strive to perfect their skills through rigorous practice. While we help novice players learn, your motivation and dedication are essential to help you pick up the sport.\n" +
        "The club features four high quality synthetic courts for the IITG community, also ball issuing facility is available.\n" +
        "Lawn Tennis is one of the toughest racket sports, with players starting at an early age of as young as 6 years. Knowing this fact doesn’t restrain us in teaching novice players and helping them master their technique. But in tennis as in any sports, skills are not taught but learned through hours of self-learning. So, it is your motivation, which will decide how fast you improve and learn. \n" +
        "If you are interested in learning, contact Secretary of Lawn Tennis Club.");
        super.onViewCreated(view, savedInstanceState);
    }



}