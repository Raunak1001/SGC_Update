package com.iitg.sgc;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by Raunak on 10/2/2015.
 */
public class Home_Body extends android.support.v4.app.Fragment implements View.OnClickListener {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22,tv23,tv24,tv25,tv26,tv27;
ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;
    String about1,about2,about3,about4,about5,about6,about7,about8,about9,about10,about11,about12,about13,about14,about15,about16,about17,about18,about19,about20,about21,about22,about23,about24,about25,about26,about27;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.home_body, container, false);
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tv1=(TextView)getActivity().findViewById(R.id.tvdosa1);
        tv2=(TextView)getActivity().findViewById(R.id.tvdosa2);
        tv3=(TextView)getActivity().findViewById(R.id.tvdosa3);
        tv4=(TextView)getActivity().findViewById(R.id.tvada1);
        tv5=(TextView)getActivity().findViewById(R.id.tvada2);
        tv6=(TextView)getActivity().findViewById(R.id.tvada3);
        tv7=(TextView)getActivity().findViewById(R.id.tvadb1);
        tv8=(TextView)getActivity().findViewById(R.id.tvadb2);
        tv9=(TextView)getActivity().findViewById(R.id.tvadb3);
        tv10=(TextView)getActivity().findViewById(R.id.tvvp1);
        tv11=(TextView)getActivity().findViewById(R.id.tvvp2);
        tv12=(TextView)getActivity().findViewById(R.id.tvvp3);
        tv13=(TextView)getActivity().findViewById(R.id.tvgs_tech1);
        tv14=(TextView)getActivity().findViewById(R.id.tvgs_tech2);
        tv15=(TextView)getActivity().findViewById(R.id.tvgs_tech3);
        tv16=(TextView)getActivity().findViewById(R.id.tvgs_wel1);
        tv17=(TextView)getActivity().findViewById(R.id.tvgs_wel2);
        tv18=(TextView)getActivity().findViewById(R.id.tvgs_wel3);
        tv19=(TextView)getActivity().findViewById(R.id.tvgs_sports1);
        tv20=(TextView)getActivity().findViewById(R.id.tvgs_sports2);
        tv21=(TextView)getActivity().findViewById(R.id.tvgs_sports3);
        tv22=(TextView)getActivity().findViewById(R.id.tvgs_cult1);
        tv23=(TextView)getActivity().findViewById(R.id.tvgs_cult2);
        tv24=(TextView)getActivity().findViewById(R.id.tvgs_cult3);
        tv25=(TextView)getActivity().findViewById(R.id.tvhab1);
        tv26=(TextView)getActivity().findViewById(R.id.tvhab2);
        tv27=(TextView)getActivity().findViewById(R.id.tvhab3);

        iv1=(ImageView)getActivity().findViewById(R.id.ivdosa);
        iv2=(ImageView)getActivity().findViewById(R.id.ivada);
        iv3=(ImageView)getActivity().findViewById(R.id.ivadb);
        iv4=(ImageView)getActivity().findViewById(R.id.ivvp);
        iv5=(ImageView)getActivity().findViewById(R.id.gs_tech);
        iv6=(ImageView)getActivity().findViewById(R.id.ivgs_wel);
        iv7=(ImageView)getActivity().findViewById(R.id.ivgs_sports);
        iv8=(ImageView)getActivity().findViewById(R.id.ivgs_cult);
        iv9=(ImageView)getActivity().findViewById(R.id.ivgs_hab);

        about1="Prof. Chandan Mahanta";
        about2="Dean, Students’ Affairs & President,\n" +
        "Students’ Gymkhana Council";
        about3="Contact: +91-361-258 2083(O)\n" +
        "E-mail: dos@iitg.ac.in";

        about4="Prof. Kannan Pakshirajan";
        about5="Associate Dean 1,\n" +
                "Students’ Affairs";
        about6="Contact: +91-361-258 2929(O)\n" +
                "E-mail: adosa_1@iitg.ac.in";

        about7="Prof. Latha Rangan";
        about8="Associate Dean 2,\n" +
                "Students’ Affairs";
        about9="Contact: +91-361-258 2928(O)\n" +
                "E-mail: adosa_2@iitg.ac.in";

about10="Bhavin Mandalaywala";
        about11="Vice President";
        about12="Mobile: +91-8011082220\n" +
                "E-mail: vp@iitg.ac.in\n" +
                "Address: A-207, Manas Hostel";

about13="Paawan Talwar";
        about14="General Secretary,\n" +
                "Technical Board";
        about15="Mobile: +91-8473995760\n" +
                "E-mail: techsec@iitg.ac.in\n" +
                "Address: 148, Siang Hostel";

about16="Mohammed Zilani";
        about17="General Secretary,\n" +
                "Welfare Board";
        about18="Mobile: +91-8876577383\n" +
                "E-mail: gensec_welfare@iitg.ac.in\n" +
                "Address: A-247, Barak Hostel";


        about19="A Sai Sushanth";
        about20="General Secretary,\n" +
                "Sports Board";
        about21="Mobile: +91-8011025452\n" +
                "E-mail: sportsec@iitg.ac.in\n" +
                "Address: 254, Siang Hostel";

        about22="Chaitanya Sangani";
        about23="General Secretary,\n" +
                "Cultural Board";
        about24="Mobile: +91-8011035925\n" +
                "E-mail: cultsec@iitg.ac.in\n" +
                "Address: B3-330, Kameng Hostel";

about25="Naresh Kumar Peddinti";
        about26="General Secretary,\n"+"Hostel Affairs' Board";
        about27="Mobile: 9085702585\n" +
                "Address: room-258, Kapili Hostel";



        tv1.setText(about1);
        tv2.setText(about2);
        tv3.setText(about3);
        tv4.setText(about4);
        tv5.setText(about5);
        tv6.setText(about6);
        tv7.setText(about7);
        tv8.setText(about8);
        tv9.setText(about9);
        tv10.setText(about10);
        tv11.setText(about11);
        tv12.setText(about12);
        tv13.setText(about13);
        tv14.setText(about14);
        tv15.setText(about15);
        tv16.setText(about16);
        tv17.setText(about17);
        tv18.setText(about18);
        tv19.setText(about19);
        tv20.setText(about20);
        tv21.setText(about21);
        tv22.setText(about22);
        tv23.setText(about23);
        tv24.setText(about24);
        tv25.setText(about25);
        tv26.setText(about26);
        tv27.setText(about27);

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
        tv24.setOnClickListener(this);
        tv25.setOnClickListener(this);
        tv26.setOnClickListener(this);
        tv27.setOnClickListener(this);





        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);
        iv9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tvdosa1:
                Intent a = new Intent(Intent.ACTION_DIAL);
                a.setData(Uri.parse("tel:+91-361-258 2083(O)"));
                startActivity(a);
                break;

            case R.id.tvdosa2:
                Intent b = new Intent(Intent.ACTION_DIAL);
                b.setData(Uri.parse("tel:+91-361-258 2083(O)"));
                startActivity(b);

                break;

            case R.id.tvdosa3:
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:+91-361-258 2083(O)"));
                startActivity(c);
                break;

            case R.id.tvada1:
                Intent d = new Intent(Intent.ACTION_DIAL);
                d.setData(Uri.parse("tel:+ 91-361-258 2929(O)"));
                startActivity(d);
                break;

            case R.id.tvada2:
                Intent e = new Intent(Intent.ACTION_DIAL);
                e.setData(Uri.parse("tel:+91-361-258 2929(O)"));
                startActivity(e);
                break;

            case R.id.tvada3:
                Intent f = new Intent(Intent.ACTION_DIAL);
                f.setData(Uri.parse("tel:+91-361-258 2929(O)"));
                startActivity(f);
                break;
            case R.id.tvadb1:
                Intent g = new Intent(Intent.ACTION_DIAL);
                g.setData(Uri.parse("tel:+91-361-258 2928(O)"));
                startActivity(g);
                break;


            case R.id.tvadb2:
                Intent h = new Intent(Intent.ACTION_DIAL);
                h.setData(Uri.parse("tel:++91-361-258 2928(O)"));
                startActivity(h);
                break;



            case R.id.tvadb3:
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+91-361-258 2928(O)"));
                startActivity(i);

                break;

            case R.id.tvvp1:
                Intent j = new Intent(Intent.ACTION_DIAL);
                j.setData(Uri.parse("tel:+91-8011082220"));
                startActivity(j);
                break;

            case R.id.tvvp2:
                Intent k = new Intent(Intent.ACTION_DIAL);
                k.setData(Uri.parse("tel:+91-8011082220"));
                startActivity(k);
                break;

            case R.id.tvvp3:
                Intent l = new Intent(Intent.ACTION_DIAL);
                l.setData(Uri.parse("tel:+91-8011082220"));
                startActivity(l);
                break;

            case R.id.tvgs_tech1:
                Intent m = new Intent(Intent.ACTION_DIAL);
                m.setData(Uri.parse("tel:+91-8473995760"));
                startActivity(m);
                break;
            case R.id.tvgs_tech2:
                Intent n = new Intent(Intent.ACTION_DIAL);
                n.setData(Uri.parse("tel:+91-8473995760"));
                startActivity(n);
                break;


            case R.id.tvgs_tech3:
                Intent o = new Intent(Intent.ACTION_DIAL);
                o.setData(Uri.parse("tel:+91-8473995760"));
                startActivity(o);
                break;



            case R.id.tvgs_wel1:
                Intent p = new Intent(Intent.ACTION_DIAL);
                p.setData(Uri.parse("tel:+91-8876577383"));
                startActivity(p);

                break;

            case R.id.tvgs_wel2:
                Intent q = new Intent(Intent.ACTION_DIAL);
                q.setData(Uri.parse("tel:+91-8876577383"));
                startActivity(q);
                break;

            case R.id.tvgs_wel3:
                Intent r = new Intent(Intent.ACTION_DIAL);
                r.setData(Uri.parse("tel:+91-8876577383"));
                startActivity(r);
                break;

            case R.id.tvgs_sports1:
                Intent s = new Intent(Intent.ACTION_DIAL);
                s.setData(Uri.parse("tel:+91-8011025452"));
                startActivity(s);
                break;

            case R.id.tvgs_sports2:
                Intent t = new Intent(Intent.ACTION_DIAL);
                t.setData(Uri.parse("tel:+91-8011025452"));
                startActivity(t);
                break;
            case R.id.tvgs_sports3:
                Intent u = new Intent(Intent.ACTION_DIAL);
                u.setData(Uri.parse("tel:+91-8011025452"));
                startActivity(u);
                break;


            case R.id.tvgs_cult1:
                Intent y = new Intent(Intent.ACTION_DIAL);
                y.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(y);
                break;


            case R.id.tvgs_cult2:
                Intent w = new Intent(Intent.ACTION_DIAL);
                w.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(w);

                break;

            case R.id.tvgs_cult3:
                Intent x = new Intent(Intent.ACTION_DIAL);
                x.setData(Uri.parse("tel:+91-8011035925"));
                startActivity(x);
                break;

            case R.id.tvhab1:
                Intent zb = new Intent(Intent.ACTION_DIAL);
                zb.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(zb);
                break;

            case R.id.tvhab2:
                Intent z = new Intent(Intent.ACTION_DIAL);
                z.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(z);
                break;

            case R.id.tvhab3:
                Intent za = new Intent(Intent.ACTION_DIAL);
                za.setData(Uri.parse("tel:+91-9085702585"));
                startActivity(za);
                break;


            case R.id.ivdosa:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1015610763"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/chandan.mahanta.16")));

                }

                break;


            case R.id.ivgs_hab:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003775395206"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nareshkumar.peddinti")));

                }

                break;


            case R.id.ivvp:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000417968046"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/bhavin.mandalaywala4455")));

                }

                break;


            case R.id.gs_tech:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/1378686601"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/paawan.talwar.3")));

                }

                break;

            case R.id.ivgs_wel:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003932877412"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/mohammedsultanmohideen.zilani")));

                }

                break;


            case R.id.ivgs_sports:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000396649213"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/saisushanthakula")));

                }

                break;

            case R.id.ivgs_cult:
                try{

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000733255481"));
                    startActivity(intent);

                }catch(Exception e1){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/chaitanya.chaitu1")));

                }

                break;


        }
    }
}
