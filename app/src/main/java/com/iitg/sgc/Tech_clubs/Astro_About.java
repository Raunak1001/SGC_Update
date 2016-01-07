package com.iitg.sgc.Tech_clubs;

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
public class Astro_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.astro_about,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv2=(TextView)getActivity().findViewById(R.id.tvAstro2);
        TextView tv1=(TextView)getActivity().findViewById(R.id.tvAstro1);
        tv1.setText("The universe is a pretty big place.If it's just us, seems like an awful waste of space"+"-"+" Carl Sagan");
        tv2.setText("Do you know that as you read this sentence, the Universe expanded by 100 km, i.e. 80 mega trillion trillion km3 of space was added to our observable Universe, 1000 new stars were born, Voyager 2 traversed 32 km and somewhere in the Universe 2 years just passed away! \n" +
                "\n" +
                "Well to sum it up, we at the Astronomy Club aim towards exploring the Universe on scales that we can achieve. Staring at the night sky is one of our many not-so-common hobbies and you'd be as astounded as I was to see what all floats out there.");
        super.onViewCreated(view, savedInstanceState);

    }
}
