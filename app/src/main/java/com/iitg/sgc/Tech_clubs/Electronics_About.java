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
public class Electronics_About extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.electronics_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = (TextView) getActivity().findViewById(R.id.tvElectronics);
        tv.setText("The Electronics Club aims to provide students a platform and resources to gain practical skills and realize projects. We strive to teach and help students acquire new skills in an era of rapidly evolving technology. We believe in coming up with projects that are innovative and tackle real life problems. To achieve these objectives we conduct various lectures, workshops and mentorship programs to help students realize their projects. The mission of the club is to expose students to challenges and new technologies in the field of electronics and thus to nurture and develop their skill set in this arena. Regular meetings and mentorship programs will definitely help students to achieve their goals. The emphasis is on experimenting and learning, no experience is necessary but eagerness to learn is essential.");
        super.onViewCreated(view, savedInstanceState);
    }
}