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
public class Badminton_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.badminton_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvBadminton);
tv.setText("Badminton is undoubtedly the most popular sport in the campus. There is a wonderful culture of the sport prevailing in the campus. This culture has developed over the years due to the hard work and passion shown by the members of the club and the outstanding performance of the team in Inter IIT sports meet and other tournaments.\n" +
        "\n" +
        "What sets Badminton Club apart is our strong team-spirit, dedication, camaraderie, the amazing bonding, the fun and frolic and the constant on-court banter we indulge in. But donít get us wrong, for our motto is Party Hard, Practice HARDER.\n" +
        "\n" +
        "With five synthetic and five wooden flooring courts, players get ample opportunity to play the sport on a regular basis. Competitive tournaments like Spardha(Inter hostel sports tournament), Spirit(Annual sports fest of IITG), Freshers tournament, etc. are organised through out the year for the students to participate in.\n" +
        "\n" +
        "So if Badminton is your sport, and above all your passion, feel free to join our family!");
        super.onViewCreated(view, savedInstanceState);
    }



}