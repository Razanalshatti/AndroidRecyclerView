package com.razan.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.razan.androidrecyclerview.adapter.CurrencyApp;
import com.razan.androidrecyclerview.repositry.CurrencyAppRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView accountsRecycleView;
    ArrayList<Currency> currencies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // enable the back button
//        getSupportActionBar().setTitle("Currency App");

        // adding our data to arrayList
        currencies = CurrencyAppRepo.getInstance().generateDummyCurrencies(1);

        // setting up our recyclerview
        accountsRecycleView = findViewById(R.id.accountsRecyclerView);
        accountsRecycleView.setLayoutManager(new LinearLayoutManager(this));

        CurrencyApp currencyApp = new CurrencyApp(currencies);
        accountsRecycleView.setAdapter(currencyApp);





    }
}