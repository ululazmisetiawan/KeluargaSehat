package com.project.keluargasehat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

    public class Splashscreen extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_splashscreen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent home = new Intent(Splashscreen.this, Login.class);
                    startActivity(home);
                    finish();
                }
            }, 3000);


        }
    }
