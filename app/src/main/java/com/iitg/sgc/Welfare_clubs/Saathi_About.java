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
public class Saathi_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.saathi_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvSaathi);
        tv.setText("Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. \n" +
                "In the current climate of ever increasing stress, cut throat competition, and increasing consumerism, it is only natural for any of us to encounter social, personal, or academic problems. The constant pressure and expectation from oneself and significant others often leads to emotional or psychological turmoil, thus disturbing the peace of mind.\n" +
                "When one is away from his/her comfort zone, a mentor, a counsellor, a saathi emerges as ‘a shelter in the storm’. Saathi, the counselling service of IIT Guwahati, has experienced counsellors and a dedicated team who are ready to take the responsibility of guiding and supporting the students in their path towards success and self-fulfillment. This includes handling personal, family and peer problems as well as managing academics more responsibly.\n" +
                "The counsellors provide a comfortable and confidential environment where the students feel at ease to discuss anything that may be bothering them, and help find solution to their problems.");
        super.onViewCreated(view, savedInstanceState);
    }
}