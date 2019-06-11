package com.example.week1daily2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Car_Registration_Activity extends AppCompatActivity {
    EditText etCarYear;
    EditText etCarMake;
    EditText etCarModel;
    EditText etCarColor;
    EditText etCarEngineSize;
    EditText etTransmission;
    Intent passedIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car__registration_);
        etCarYear = findViewById(R.id.etCarYear);
        etCarMake = findViewById(R.id.etCarMake);
        etCarModel = findViewById(R.id.etCarModel);
        etCarColor = findViewById(R.id.etCarColor);
        etCarEngineSize = findViewById(R.id.etCarEngine);
        etTransmission = findViewById(R.id.etCarTransmission);
        passedIntent = getIntent();

    }

    public void onClick(View view) {
        String year = etCarYear.getText().toString();
        String make = etCarMake.getText().toString();
        String model = etCarModel.getText().toString();
        String color = etCarColor.getText().toString();
        String engine = etCarEngineSize.getText().toString();
        String transmission = etTransmission.getText().toString();

        Person passedPerson = new Person(year, make, model, color, engine, transmission);
        Bundle carBundle = new Bundle();
        carBundle.putParcelable("car", passedPerson);
        passedIntent.putExtras(carBundle);

        setResult(111,passedIntent);
        finish();
    }
}
