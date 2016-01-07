package com.iitg.sgc;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

/**
 * Created by Raunak on 10/6/2015.
 */
public class Splash extends Activity{
    // Asyntask
    AsyncTask<Void, Void, Void> mRegisterTask;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    try{
            setContentView(R.layout.video);
            VideoView videoHolder=(VideoView)findViewById(R.id.vv);
            Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                    + R.raw.splash1);
            videoHolder.setVideoURI(video);

            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                public void onCompletion(MediaPlayer mp) {
                    jump();
                }

            });
            videoHolder.start();
        } catch(Exception ex) {
            jump();
        }
    }


    private void jump() {
//it is safe to use this code even if you
//do not intend to allow users to skip the splash
        if(isFinishing())
            return;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }




}
