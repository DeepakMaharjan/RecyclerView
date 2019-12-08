package com.deepak.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CarDetails extends AppCompatActivity {

    ImageView imgCars;
    TextView tvBrand, tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        imgCars = findViewById(R.id.imgCars);
        tvName = findViewById(R.id.tvName);
        tvBrand = findViewById(R.id.tvBrand);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            imgCars.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvBrand.setText(bundle.getString("brand"));
        }


    }
}
