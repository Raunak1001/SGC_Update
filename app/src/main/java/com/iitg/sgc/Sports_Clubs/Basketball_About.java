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
public class Basketball_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.basketball_about,container,false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvBasketball);
tv.setText("Rhinos – IITG Basketball Club manages the basketball activities of IIT Guwahati. It is one of the most active clubs in the institute with fantastic teams for both boys and girls. The club activities include organizing regular sessions for Inter-IIT training, Freshers’ tournament and a franchise style league in the even semester called the \"Playoffs\".");
        super.onViewCreated(view, savedInstanceState);
    }

}