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
public class Hockey_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hockey_about,container,false);
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvHockey);
tv.setText("We are group of enthusiastic players trying to give our best in the field and also building the culture of sport in the institute.Hockey here is all about fun.We not only learn to play the sport but also learn how to make a good team and take confidence back with us from what we doing.We challenge each other and strive for improvement every moment on the field.Live, study and play in the heart of elite hockey in IIT Guwahati.\n" +
        "\n" +
        "HOCKEY is a game of Passion.It is a game in which u can truly confront yourself. You have to beat the fear inside their mind to be in this game.It is a fast game and not a physical sport. You can command this game using your speed and agility. Hockey is not only skills game but also a team unity game where you can learn how to work or play in a group and how to make combination’s with other. \n" +
        "\n" +
        "Motivation has been defined as ‘the direction and intensity of ones efforts’ so one has to definitely show some discipline and dedication towards the game.If you carry the passion to sport your way on the field and are a team player, see you on the hockey field.");
        super.onViewCreated(view, savedInstanceState);
    }
}
