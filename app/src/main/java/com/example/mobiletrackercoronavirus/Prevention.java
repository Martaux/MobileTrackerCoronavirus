package com.example.mobiletrackercoronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class Prevention extends AppCompatActivity {
    private Button button_mz;
    private Button button_sanepid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        button_mz = findViewById(R.id.button_mz);
        button_mz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gov.pl/web/koronawirus"));
                startActivity(browserIntent);
                startActivity(browserIntent);
            }
        });

        button_sanepid = findViewById(R.id.button_sanepid);
        button_sanepid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://gis.gov.pl/kampania/koronawirus-informacje/"));
                startActivity(browserIntent);
                startActivity(browserIntent);
            }
        });
    }

}
