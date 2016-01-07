package com.iitg.sgc;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raunak on 10/home2/2015.
 */
public class Hab_contact extends android.support.v4.app.Fragment implements View.OnClickListener {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.hab_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ImageView iv1 = (ImageView) getActivity().findViewById(R.id.ivBarak);
        ImageView iv2 = (ImageView) getActivity().findViewById(R.id.ivBrahma);
        ImageView iv3 = (ImageView) getActivity().findViewById(R.id.ivDhano);
        ImageView iv4 = (ImageView) getActivity().findViewById(R.id.ivDibang);
        ImageView iv5 = (ImageView) getActivity().findViewById(R.id.ivDihing);
        ImageView iv6 = (ImageView) getActivity().findViewById(R.id.ivKameng);
        ImageView iv7 = (ImageView) getActivity().findViewById(R.id.ivKapili);
        ImageView iv8 = (ImageView) getActivity().findViewById(R.id.ivLohit);
        ImageView iv9 = (ImageView) getActivity().findViewById(R.id.ivManas);
        ImageView iv10 = (ImageView) getActivity().findViewById(R.id.ivMSH);
        ImageView iv11 = (ImageView) getActivity().findViewById(R.id.ivSiang);
        ImageView iv12 = (ImageView) getActivity().findViewById(R.id.ivSubbu);
        ImageView iv13 = (ImageView) getActivity().findViewById(R.id.ivUmiam);

        TextView tv1 = (TextView) getActivity().findViewById(R.id.tvBarak);
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tvBrahma);
        TextView tv3 = (TextView) getActivity().findViewById(R.id.tvDhano);
        TextView tv4 = (TextView) getActivity().findViewById(R.id.tvDibang);
        TextView tv5 = (TextView) getActivity().findViewById(R.id.tvDihing);
        TextView tv6 = (TextView) getActivity().findViewById(R.id.tvKameng);
        TextView tv7 = (TextView) getActivity().findViewById(R.id.tvKapili);
        TextView tv8 = (TextView) getActivity().findViewById(R.id.tvLohit);
        TextView tv9 = (TextView) getActivity().findViewById(R.id.tvManas);
        TextView tv10 = (TextView) getActivity().findViewById(R.id.tvMSH);
        TextView tv11 = (TextView) getActivity().findViewById(R.id.tvSiang);
        TextView tv12 = (TextView) getActivity().findViewById(R.id.tvSubbu);
        TextView tv13 = (TextView) getActivity().findViewById(R.id.tvUmiam);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);
        iv9.setOnClickListener(this);
        iv10.setOnClickListener(this);
        iv11.setOnClickListener(this);
        iv12.setOnClickListener(this);
        iv13.setOnClickListener(this);

        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        tv9.setOnClickListener(this);
        tv10.setOnClickListener(this);
        tv11.setOnClickListener(this);
        tv12.setOnClickListener(this);
        tv13.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivBarak:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/barak/")));
                break;
            case R.id.ivBrahma:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/brahmaputra/")));
                break;
            case R.id.ivDhano:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dhansiri/")));
                break;
            case R.id.ivDibang:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dibang/")));
                break;
            case R.id.ivDihing:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dihing/")));
                break;
            case R.id.ivKameng:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/kameng/")));
                break;
            case R.id.ivKapili:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/kapili/")));
                break;
            case R.id.ivLohit:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/lohit/")));
                break;
            case R.id.ivManas:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/manas/")));
                break;
            case R.id.ivMSH:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/msh/")));
                break;
            case R.id.ivSiang:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/siang/")));
                break;
            case R.id.ivSubbu:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/subansiri/")));
                break;
            case R.id.ivUmiam:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/umiam/")));
                break;
            case R.id.tvBarak:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/barak/")));
                break;
            case R.id.tvBrahma:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/brahmaputra/")));
                break;
            case R.id.tvDhano:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dhansiri/")));
                break;
            case R.id.tvDibang:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dibang/")));
                break;
            case R.id.tvDihing:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/dihing/")));
                break;
            case R.id.tvKameng:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/kameng/")));
                break;
            case R.id.tvKapili:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/kapili/")));
                break;
            case R.id.tvLohit:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/lohit/")));
                break;
            case R.id.tvManas:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/manas/")));
                break;
            case R.id.tvMSH:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/msh/")));
                break;
            case R.id.tvSiang:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/siang/")));
                break;
            case R.id.tvSubbu:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/subansiri/")));
                break;
            case R.id.tvUmiam:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iitg.ernet.in/hostels/umiam/")));
                break;

        }
    }
}
