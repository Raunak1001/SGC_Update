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
public class Rights_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.rights_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvRights);
        tv.setText("This club is Responsible for:\n" +
                "\n" +
                "Advising the board and simulating efforts for preserving and creating awareness about human rights of campus residents, including issues of ragging,harassment, and discrimination.\n" +
                "Will be entrusted with creating a ‘Students Rights Charter’ for the students in IIT-Guwahati.\n" +
                "Will organize workshops on sensitization on various issues like sexual harassment,especially at the work place, and the Right to Information (RTI).\n" +
                "To make people aware of already existing Internal Complaint Cell and ensure whether the problems reported to the cell are rectified or not. Infact if someone feels that their rights are violated in any quarter and they feel forcibly obliged, they are free to come up with their issues and the club will try to help them in all possible ways.\n" +
                "Thus this club would be the Voice of Students and along with that the students are also expected to know their responsibility. ");
        super.onViewCreated(view, savedInstanceState);
    }
}