package com.yourbusinessname.keyword1.keyword2;

import android.content.Intent;
import android.gold.webview.codecanyon.com.webview.R;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.yourbusinessname.keyword1.keyword2.Config.SPLASH_TIMEOUT;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorWhite));
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorWhite));

        final ImageView splash = findViewById(R.id.splash);
        splash.setImageResource(R.mipmap.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, MainActivity.class));
                SplashScreen.this.finish();
            }
        }, SPLASH_TIMEOUT);

    }
}
