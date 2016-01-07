package com.iitg.sgc;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Raunak on 10/21/2015.
 */
public class Notification_Events extends android.support.v4.app.Fragment {
    TextView noti1a,noti1b,noti1c,noti3a,noti3b,noti3c,noti4a,noti4b,noti4c,noti5a,noti5b,noti5c,noti6a,noti6b,noti6c,noti7a,noti7b,noti7c,noti8a,noti8b,noti8c,noti9a,noti9b,noti9c,noti2a,noti2b,noti2c,noti10a,noti10b,noti10c;
    String[] notifications=new String[12];
Toolbar tb;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
return inflater.inflate(R.layout.notification_events,container,false);    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       SharedPreferences a=getActivity().getSharedPreferences("Notifications",0);

        noti1a=(TextView)getActivity().findViewById(R.id.notiify1a);
     noti1b=(TextView)getActivity().findViewById(R.id.notiify1b);
      noti1c=(TextView)getActivity().findViewById(R.id.notiify1c);
        noti2a=(TextView)getActivity().findViewById(R.id.notiify2a);
        noti2b=(TextView)getActivity().findViewById(R.id.notiify2b);
        noti2c=(TextView)getActivity().findViewById(R.id.notiify2c);

        noti3a=(TextView)getActivity().findViewById(R.id.notiify3a);
        noti3b=(TextView)getActivity().findViewById(R.id.notiify3b);
        noti3c=(TextView)getActivity().findViewById(R.id.notiify3c);

        noti4a=(TextView)getActivity().findViewById(R.id.notiify4a);
        noti4b=(TextView)getActivity().findViewById(R.id.notiify4b);
        noti4c=(TextView)getActivity().findViewById(R.id.notiify4c);

        noti5a=(TextView)getActivity().findViewById(R.id.notiify5a);
        noti5b=(TextView)getActivity().findViewById(R.id.notiify5b);
        noti5c=(TextView)getActivity().findViewById(R.id.notiify5c);

        noti6a=(TextView)getActivity().findViewById(R.id.notiify6a);
        noti6b=(TextView)getActivity().findViewById(R.id.notiify6b);
        noti6c=(TextView)getActivity().findViewById(R.id.notiify6c);

        noti7a=(TextView)getActivity().findViewById(R.id.notiify7a);
        noti7b=(TextView)getActivity().findViewById(R.id.notiify7b);
        noti7c=(TextView)getActivity().findViewById(R.id.notiify7c);

        noti8a=(TextView)getActivity().findViewById(R.id.notiify8a);
        noti8b=(TextView)getActivity().findViewById(R.id.notiify8b);
        noti8c=(TextView)getActivity().findViewById(R.id.notiify8c);


        noti9a=(TextView)getActivity().findViewById(R.id.notiify9a);
        noti9b=(TextView)getActivity().findViewById(R.id.notiify9b);
        noti9c=(TextView)getActivity().findViewById(R.id.notiify9c);

        noti10a=(TextView)getActivity().findViewById(R.id.notiify10a);
        noti10b=(TextView)getActivity().findViewById(R.id.notiify10b);
        noti10c=(TextView)getActivity().findViewById(R.id.notiify10c);

        for(int i=1;i<11;i++)
        { notifications[i]=a.getString("Noti"+i,"");
if(notifications[i].equals("")){

    notifications[i]="  \n  \n  \n  \n  \n";
}

   if(notifications[i].split("\n").length<6)
   {
       notifications[i]=notifications[i]+"\n \n \n \n \n";

   }
        }


        String[] notify1=notifications[1].split("\n");
        String[] notify2=notifications[2].split("\n");
        String[] notify3=notifications[3].split("\n");
        String[]  notify4=notifications[4].split("\n");
        String[]   notify5=notifications[5].split("\n");
        String[]  notify6=notifications[6].split("\n");
        String[]   notify7=notifications[7].split("\n");
        String[] notify8=notifications[8].split("\n");
        String[]  notify9=notifications[9].split("\n");
        String[]    notify10=notifications[10].split("\n");


        noti1a.setText(notify1[2]);
        noti1b.setText(notify1[3]);
       noti1c.setText(notify1[4]);

        noti2a.setText(notify2[2]);
        noti2b.setText(notify2[3]);
        noti2c.setText(notify2[4]);

        noti3a.setText(notify3[2]);
        noti3b.setText(notify3[3]);
        noti3c.setText(notify3[4]);

        noti4a.setText(notify4[2]);
        noti4b.setText(notify4[3]);
        noti4c.setText(notify4[4]);

        noti5a.setText(notify5[2]);
        noti5b.setText(notify5[3]);
        noti5c.setText(notify5[4]);

        noti6a.setText(notify6[2]);
        noti6b.setText(notify6[3]);
        noti6c.setText(notify6[4]);

        noti7a.setText(notify7[2]);
        noti7b.setText(notify7[3]);
        noti7c.setText(notify7[4]);

        noti8a.setText(notify8[2]);
        noti8b.setText(notify8[3]);
        noti8c.setText(notify8[4]);

        noti9a.setText(notify9[2]);
        noti9b.setText(notify9[3]);
        noti9c.setText(notify9[4]);

        noti10a.setText(notify10[2]);
        noti10b.setText(notify10[3]);
        noti10c.setText(notify10[4]);


       }





}








