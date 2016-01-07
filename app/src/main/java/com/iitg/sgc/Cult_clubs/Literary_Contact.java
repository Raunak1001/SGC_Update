package com.iitg.sgc.Cult_clubs;

import android.content.Intent;
import android.net.Uri;
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
public class Literary_Contact extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.literary_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv1 = (TextView) getActivity().findViewById(R.id.tvLit1);
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvLit2);
        TextView tv3 = (TextView) getActivity().findViewById(R.id.tvLit3);
        TextView tv4 = (TextView) getActivity().findViewById(R.id.tvLit4);
        TextView tv5 = (TextView) getActivity().findViewById(R.id.tvLit5);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv2.setText("Contact: 8011035664" +"\n"+ "Webmail: r.murthy");
        tv4.setText("Contact: 9706969538" + "\n" +"Webmail: y.nakul");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvLit1:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1354513071"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rohit.murthy")));

                }
                break;
            case R.id.tvLit2:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1354513071"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rohit.murthy")));

                }
                break;
            case R.id.tvLit3:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1650198716"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nakul.yadav")));

                }
                break;
            case R.id.tvLit4:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1650198716"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nakul.yadav")));

                }
                break;
            case R.id.tvLit5:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/LiterarySocietyIITG"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/LiterarySocietyIITG")));

                }
                break;
        }
    }
}
