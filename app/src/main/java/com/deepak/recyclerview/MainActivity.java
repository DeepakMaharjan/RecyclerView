package com.deepak.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Create a list of cars to display in Recycler View
        List<Cars> carsList = new ArrayList<>();

        carsList.add(new Cars("BMW-07AD", "Japanese", R.drawable.bmw));
        carsList.add(new Cars("Hyundai-ASD45","Hyundai Italy",R.drawable.hyundai));
        carsList.add(new Cars("Lambergini","Lambo",R.drawable.lambo));

        CarsAdapter carsAdapter = new CarsAdapter(this, carsList);
        recyclerView.setAdapter(carsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

    }
}
