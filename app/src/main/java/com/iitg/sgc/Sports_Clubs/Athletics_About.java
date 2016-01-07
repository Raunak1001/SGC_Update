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
 * Created by Raunak on 10/5/2015.
 */
public class Athletics_About  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.athletics_about,container,false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv=(TextView)getActivity().findViewById(R.id.tvAthletics);
        tv.setText("Athletics Club is the apex body for controlling, running and managing athletics in IIT Guwahati, which works under the jurisdiction of Sports Board, IIT Guwahati. We define Athletics as a sport that goes “The Extra Mile” in addition to what people perceive it as a collection of “Run, Jump, Throw” events. Athletics also carries the mantle of being the Inter IIT Sports Meet’s leading sport.");
        super.onViewCreated(view, savedInstanceState);
    }

}