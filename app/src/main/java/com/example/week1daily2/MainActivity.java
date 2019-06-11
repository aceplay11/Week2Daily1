package com.example.week1daily2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCarYear;
    TextView tvCarMake;
    TextView tvCarModel;
    TextView tvCarColor;
    TextView tvCarEngineSize;
    TextView tvTransmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCarYear = findViewById(R.id.tvCarYear);
        tvCarMake = findViewById(R.id.tvCarMake);
        tvCarModel = findViewById(R.id.tvCarModel);
        tvCarColor = findViewById(R.id.tvCarColor);
        tvCarEngineSize = findViewById(R.id.tvCarEngine);
        tvTransmission = findViewById(R.id.tvCarTransmission);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCarRegistration:
                startCarRegistration();

                break;

            case R.id.btnDisplayRegistration:




                break;
        }
    }




private void startCarRegistration(){
    Intent displayIntent = new Intent(this, Car_Registration_Activity.class);
    startActivityForResult(displayIntent, 111);
}


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle passedBundle = data.getExtras();
        if (passedBundle != null) {

            Person person = passedBundle.getParcelable("car");
            if (person != null) {
                tvCarYear.setText(person.getCarYear());
                tvCarMake.setText(person.getCarMake());
                tvCarModel.setText(person.getCarModel());
                tvCarColor.setText(person.getCarColor());
                tvCarEngineSize.setText(person.getCarEngine());
                tvTransmission.setText(person.getCarTransmission());


            }
        }
    }
}
