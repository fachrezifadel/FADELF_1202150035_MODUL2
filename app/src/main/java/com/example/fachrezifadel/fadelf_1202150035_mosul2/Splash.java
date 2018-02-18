package com.example.fachrezifadel.fadelf_1202150035_mosul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        int splashInterval = 2000;
        // waktu splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainMenu.class);
                startActivity(intent);

                Toast.makeText(Splash.this, "Fadel Fachrezi 1202150035", Toast.LENGTH_LONG).show();
                this.finish();
                //toast saat berganti activity
            }

            private void finish() {

            }
        }, splashInterval);
    }
}
