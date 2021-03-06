package com.example.mobiletrackercoronavirus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Szczegółowe informacje o "+ com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(com.example.mobiletrackercoronavirus.AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
