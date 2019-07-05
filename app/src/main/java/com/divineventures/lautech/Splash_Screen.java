package com.divineventures.lautech;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splash_Screen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress = 0;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        //sets the time interval for progressbar
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progress<100){
                    progress+=5;
                    //update progressbar with completion of operatiom
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progress);
                        }
                    });
                    try {
                        //sleep for 300 milliseconds
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                finish();
                startActivity(new Intent(getApplicationContext(),HomeActivity .class));
            }
        }).start();
    }
}
