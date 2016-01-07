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
public class Cricket_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cricket_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvCricket);
tv.setText("Cricket club is one of the first teams from the institute to taste the success at the Inter IIT Sports Meet when it marched to glory at the 45th and 46th Inter IIT Sports Meet. We remain active throughout the year by having regular sessions and matches and we do party a lot TO CELEBRATE SUCCESS OF THE CLUB.");
        super.onViewCreated(view, savedInstanceState);
    }

}