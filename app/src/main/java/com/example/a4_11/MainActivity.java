package com.example.a4_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    TextView tv_information;
    String countries[] = {"Pick a country","France","Germany","Israel","Italy","Netherlands","Spain","Sweden","Switzerland"};
    int[] imgid={0,R.drawable.france1,R.drawable.germany1,R.drawable.israel1,R.drawable.italy1,R.drawable.netherlands1,R.drawable.spain1,R.drawable.sweden1,R.drawable.switzerland1};
    String capCities[] = {"","Paris","Berlin","Jerusalem","Rome","Amsterdam","Madrid","Stockholm","Bern"};
    Country countries_array[] = new Country[8];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        tv_information = (TextView)findViewById(R.id.tv_information);
        create();
        CustomAdapter customadp = new CustomAdapter(getApplicationContext(), countries,capCities, imgid);
        spinner.setAdapter(customadp);
        spinner.setOnItemSelectedListener(this);

    }



    private void create(){
        countries_array[0] = new Country(countries[1],capCities[1],"La Marseillaise","65,464,591","French");
        countries_array[1]  = new Country(countries[2],capCities[2],"Deutschlandlied","84,138,328","Deutsch");
        countries_array[2]  = new Country(countries[3],capCities[3],"The tikva","9,420,214","French");
        countries_array[3] = new Country(countries[4],capCities[4],"Il Canto degli Italiani","60,344,172","Italian");
        countries_array[4] = new Country(countries[5],capCities[5],"Wilhelmus","17,185,029","Nederlands");
        countries_array[5] = new Country(countries[6],capCities[6],"Marcha Real","46,778,740","Spanish");
        countries_array[6] = new Country(countries[7],capCities[7],"Du gamla, du fria ","10,182,542","French");
        countries_array[7] = new Country(countries[8],capCities[8],"Schweizerpsalm","8,738,310","French, Deutsch, Rumantsch, Italian");

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position==0)
        {
            tv_information.setText(" ");
        }
        else {
            tv_information.setText(countries_array[position-1].toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}