package com.iitg.sgc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Raunak on 10/5/2015.
 */
public class Students_senate extends Fragment implements View.OnClickListener {


    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16, tv17, tv18, tv19, tv20, tv21, tv22,tv23;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.studnts_senate, container, false);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.findItem(R.id.action_settings).setVisible(false);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);

        tv1 = (TextView) getActivity().findViewById(R.id.tvsenate101);
        tv2 = (TextView) getActivity().findViewById(R.id.tvsenate102);
        tv3 = (TextView) getActivity().findViewById(R.id.tvsenate103);
        tv4 = (TextView) getActivity().findViewById(R.id.tvsenate104);
        tv5 = (TextView) getActivity().findViewById(R.id.tvsenate105);
        tv6 = (TextView) getActivity().findViewById(R.id.tvsenate106);
        tv7 = (TextView) getActivity().findViewById(R.id.tvsenate107);
        tv8 = (TextView) getActivity().findViewById(R.id.tvsenate108);
        tv9 = (TextView) getActivity().findViewById(R.id.tvsenate109);
        tv10 = (TextView) getActivity().findViewById(R.id.tvsenate110);
        tv11 = (TextView) getActivity().findViewById(R.id.tvsenate111);
        tv12 = (TextView) getActivity().findViewById(R.id.tvsenate112);
        tv13 = (TextView) getActivity().findViewById(R.id.tvsenate113);
        tv14 = (TextView) getActivity().findViewById(R.id.tvsenate114);
        tv15 = (TextView) getActivity().findViewById(R.id.tvsenate115);
        tv16 = (TextView) getActivity().findViewById(R.id.tvsenate116);
        tv17 = (TextView) getActivity().findViewById(R.id.tvsenate117);
        tv18 = (TextView) getActivity().findViewById(R.id.tvsenate118);
        tv19 = (TextView) getActivity().findViewById(R.id.tvsenate119);
        tv20 = (TextView) getActivity().findViewById(R.id.tvsenate120);
        tv21 = (TextView) getActivity().findViewById(R.id.tvsenate121);
        tv22 = (TextView) getActivity().findViewById(R.id.tvsenate122);
        tv23 = (TextView) getActivity().findViewById(R.id.tvsenate123);

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
        tv14.setOnClickListener(this);
        tv15.setOnClickListener(this);
        tv16.setOnClickListener(this);
        tv17.setOnClickListener(this);
        tv18.setOnClickListener(this);
        tv19.setOnClickListener(this);
        tv20.setOnClickListener(this);
        tv21.setOnClickListener(this);
        tv22.setOnClickListener(this);
        tv23.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tvsenate101:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-8011082220"));
                startActivity(a);
                break;

            case R.id.tvsenate123:
                Intent z = new Intent(Intent.ACTION_DIAL);
                z.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(z);
                break;

            case R.id.tvsenate102:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-8473995760"));
                startActivity(b);
                break;
            case R.id.tvsenate103:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-8011025452"));
                startActivity(c);
                break;
            case R.id.tvsenate104:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+91-8876577383"));
                startActivity(d);
                break;
            case R.id.tvsenate105:
                Intent e = new Intent(Intent.ACTION_DIAL);
                e.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(e);
                break;
            case R.id.tvsenate106:
                Intent f = new Intent(Intent.ACTION_DIAL);
                f.setData(Uri.parse("tel:+91-9085287242"));
                startActivity(f);
                break;
            case R.id.tvsenate107:
                Intent g = new Intent(Intent.ACTION_DIAL);
                g.setData(Uri.parse("tel:+91-8011034503"));
                startActivity(g);
                break;
            case R.id.tvsenate108:
                Intent h = new Intent(Intent.ACTION_DIAL);
                h.setData(Uri.parse("tel:+91-8011021855"));
                startActivity(h);
                break;
            case R.id.tvsenate109:
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+91-8011035400"));
                startActivity(i);
                break;
            case R.id.tvsenate110:
                Intent j = new Intent(Intent.ACTION_DIAL);
                j.setData(Uri.parse("tel:+91-9508282312"));
                startActivity(j);
                break;
            case R.id.tvsenate111:
                Intent k = new Intent(Intent.ACTION_DIAL);
                k.setData(Uri.parse("tel:+91-8399968897"));
                startActivity(k);
                break;
            case R.id.tvsenate112:
                Intent l = new Intent(Intent.ACTION_DIAL);
                l.setData(Uri.parse("tel:+91-7662863265"));
                startActivity(l);
                break;
            case R.id.tvsenate113:
                Intent m = new Intent(Intent.ACTION_DIAL);
                m.setData(Uri.parse("tel:+91-7663818879"));
                startActivity(m);
                break;
            case R.id.tvsenate114:
                Intent n = new Intent(Intent.ACTION_DIAL);
                n.setData(Uri.parse("tel:+91-9085286868"));
                startActivity(n);
                break;
            case R.id.tvsenate115:
                Intent o = new Intent(Intent.ACTION_DIAL);
                o.setData(Uri.parse("tel:+91-8011035941"));
                startActivity(o);
                break;
            case R.id.tvsenate116:
                Intent p = new Intent(Intent.ACTION_DIAL);
                p.setData(Uri.parse("tel:+91-7896888895"));
                startActivity(p);
                break;
            case R.id.tvsenate117:
                Intent q = new Intent(Intent.ACTION_DIAL);
                q.setData(Uri.parse("tel:+91-9085434968"));
                startActivity(q);
                break;
            case R.id.tvsenate118:
                Intent r = new Intent(Intent.ACTION_DIAL);
                r.setData(Uri.parse("tel:+91-9678416849"));
                startActivity(r);
                break;
            case R.id.tvsenate119:
                Intent s = new Intent(Intent.ACTION_DIAL);
                s.setData(Uri.parse("tel:+91-9085729348"));
                startActivity(s);
                break;
            case R.id.tvsenate120:
                Intent t = new Intent(Intent.ACTION_DIAL);
                t.setData(Uri.parse("tel:+91-8474859796"));
                startActivity(t);
                break;
            case R.id.tvsenate121:
                Intent u = new Intent(Intent.ACTION_DIAL);
                u.setData(Uri.parse("tel:+91-9435301188"));
                startActivity(u);
                break;
            case R.id.tvsenate122:
                Intent w = new Intent(Intent.ACTION_DIAL);
                w.setData(Uri.parse("tel:+91-8486692121"));
                startActivity(w);

        }
    }
}