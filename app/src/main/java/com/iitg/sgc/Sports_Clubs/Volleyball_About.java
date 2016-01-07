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
public class Volleyball_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.volleyball_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvVolleyball);
tv.setText("Volleyball club has been provided with a large space of 3 courts and with facilities like jerseys, knee caps and what all are required with good support from the admin. \n" +
        "Both the men’s and women’s volleyball teams work hard throughout the year attending regular practice sessions with discipline and dedication and also attend many local tournaments and practice matches regularly to keep improving and to perform their best at the inter iit sports meet. Also, many people work hard on the ground to get selected in the team. \n" +
        "Regular NSO sessions are held to teach students volleyball and to keep them fit. ");
        super.onViewCreated(view, savedInstanceState);
    }

}
