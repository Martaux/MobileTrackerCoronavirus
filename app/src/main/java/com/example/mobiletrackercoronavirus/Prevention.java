package com.example.mobiletrackercoronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Prevention extends AppCompatActivity {
    private Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        button = (Button) findViewById(R.id.button_mz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent((Intent.ACTION_VIEW, Uri.parse("https://www.gov.pl/web/koronawirus"));
                startActivity(browserIntent);
                startActivity(browserIntent);
            }
        });
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        button = (Button) findViewById(R.id.button_sanepid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent((Intent.ACTION_VIEW, Uri.parse("https://gis.gov.pl/kampania/koronawirus-informacje/"));
                startActivity(browserIntent);
                startActivity(browserIntent);
            }
        });
    }

}
