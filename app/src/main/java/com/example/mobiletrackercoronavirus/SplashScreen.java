package com.example.mobiletrackercoronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SplashScreen extends AppCompatActivity {
    private ImageButton imageButton;
//    @Override
    public SplashScreen(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageButton = (ImageButton) findViewById(R.id.button_info);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevention();
            }
        });
    }

    private void openPrevention() {
        Intent intent = new Intent(this, Prevention.class);
        startActivity(intent);
    }
    private ImageButton imageButton2;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageButton2 = (ImageButton) findViewById(R.id.button_go);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    private void openMainActivity() {
        Intent intent = new Intent(this, Prevention.class);
        startActivity(intent);
    }
}

