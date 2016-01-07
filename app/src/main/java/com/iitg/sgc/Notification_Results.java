package com.iitg.sgc;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by raunak on 23/10/15.
 */
public class Notification_Results  extends android.support.v4.app.Fragment {
    TextView result1a,result1b,result1c,result3a,result3b,result3c,result4a,result4b,result4c,result5a,result5b,result5c,result6a,result6b,result6c,result7a,result7b,result7c,result8a,result8b,result8c,result9a,result9b,result9c,result2a,result2b,result2c,result10a,result10b,result10c;
    String[] results=new String[12];


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.notification_results,container,false);    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedPreferences a=getActivity().getSharedPreferences("Results",0);

        result1a=(TextView)getActivity().findViewById(R.id.resultiify1a);
        result1b=(TextView)getActivity().findViewById(R.id.resultiify1b);
        result1c=(TextView)getActivity().findViewById(R.id.resultiify1c);
        result2a=(TextView)getActivity().findViewById(R.id.resultiify2a);
        result2b=(TextView)getActivity().findViewById(R.id.resultiify2b);
        result2c=(TextView)getActivity().findViewById(R.id.resultiify2c);

        result3a=(TextView)getActivity().findViewById(R.id.resultiify3a);
        result3b=(TextView)getActivity().findViewById(R.id.resultiify3b);
        result3c=(TextView)getActivity().findViewById(R.id.resultiify3c);

        result4a=(TextView)getActivity().findViewById(R.id.resultiify4a);
        result4b=(TextView)getActivity().findViewById(R.id.resultiify4b);
        result4c=(TextView)getActivity().findViewById(R.id.resultiify4c);

        result5a=(TextView)getActivity().findViewById(R.id.resultiify5a);
        result5b=(TextView)getActivity().findViewById(R.id.resultiify5b);
        result5c=(TextView)getActivity().findViewById(R.id.resultiify5c);

        result6a=(TextView)getActivity().findViewById(R.id.resultiify6a);
        result6b=(TextView)getActivity().findViewById(R.id.resultiify6b);
        result6c=(TextView)getActivity().findViewById(R.id.resultiify6c);

        result7a=(TextView)getActivity().findViewById(R.id.resultiify7a);
        result7b=(TextView)getActivity().findViewById(R.id.resultiify7b);
        result7c=(TextView)getActivity().findViewById(R.id.resultiify7c);

        result8a=(TextView)getActivity().findViewById(R.id.resultiify8a);
        result8b=(TextView)getActivity().findViewById(R.id.resultiify8b);
        result8c=(TextView)getActivity().findViewById(R.id.resultiify8c);


        result9a=(TextView)getActivity().findViewById(R.id.resultiify9a);
        result9b=(TextView)getActivity().findViewById(R.id.resultiify9b);
        result9c=(TextView)getActivity().findViewById(R.id.resultiify9c);

        result10a=(TextView)getActivity().findViewById(R.id.resultiify10a);
        result10b=(TextView)getActivity().findViewById(R.id.resultiify10b);
        result10c=(TextView)getActivity().findViewById(R.id.resultiify10c);

        for(int i=1;i<11;i++)
        { results[i]=a.getString("Resulti"+i,"");

                results[i]=results[i]+"\n \n \n \n \n \n \n \n \n";

        }


        String[] resultify1=results[1].split("\n");
        String[] resultify2=results[2].split("\n");
        String[] resultify3=results[3].split("\n");
        String[]  resultify4=results[4].split("\n");
        String[]   resultify5=results[5].split("\n");
        String[]  resultify6=results[6].split("\n");
        String[]   resultify7=results[7].split("\n");
        String[] resultify8=results[8].split("\n");
        String[]  resultify9=results[9].split("\n");
        String[]    resultify10=results[10].split("\n");


        result1a.setText(resultify1[2]);
        result1b.setText(resultify1[3]);
        result1c.setText(resultify1[4]);

        result2a.setText(resultify2[2]);
        result2b.setText(resultify2[3]);
        result2c.setText(resultify2[4]);

        result3a.setText(resultify3[2]);
        result3b.setText(resultify3[3]);
        result3c.setText(resultify3[4]);

        result4a.setText(resultify4[2]);
        result4b.setText(resultify4[3]);
        result4c.setText(resultify4[4]);

        result5a.setText(resultify5[2]);
        result5b.setText(resultify5[3]);
        result5c.setText(resultify5[4]);

        result6a.setText(resultify6[2]);
        result6b.setText(resultify6[3]);
        result6c.setText(resultify6[4]);

        result7a.setText(resultify7[2]);
        result7b.setText(resultify7[3]);
        result7c.setText(resultify7[4]);

        result8a.setText(resultify8[2]);
        result8b.setText(resultify8[3]);
        result8c.setText(resultify8[4]);

        result9a.setText(resultify9[2]);
        result9b.setText(resultify9[3]);
        result9c.setText(resultify9[4]);

        result10a.setText(resultify10[2]);
        result10b.setText(resultify10[3]);
        result10c.setText(resultify10[4]);


    }




}
