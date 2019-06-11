package com.example.week1daily2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayRegistration extends AppCompatActivity {
    TextView tvCarYear;
    TextView tvCarMake;
    TextView tvCarModel;
    TextView tvCarColor;
    TextView tvCarEngineSize;
    TextView tvTransmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_registration);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (data != null) {
//
//            Bundle passedBundle = data.getExtras();
//            if (passedBundle != null) {
//                Person person = passedBundle.getParcelable("car");
//                if (person != null) {
//                    tvCarYear.setText(person.getCarYear());
//                    tvCarMake.setText(person.getCarMake());
//                    tvCarModel.setText(person.getCarModel());
//                    tvCarColor.setText(person.getCarColor());
//                    tvCarEngineSize.setText(person.getCarEngine());
//                    tvTransmission.setText(person.getCarTransmission());
//
//                }
//            }
//        }
    }

    public void onClick(View view) {
        finish();
    }
}