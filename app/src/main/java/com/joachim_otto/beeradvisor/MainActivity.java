package com.joachim_otto.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){

        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String beertype = String.valueOf(spinner.getSelectedItem());
        List<String> brandslist = expert.getBrands(beertype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandslist) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
