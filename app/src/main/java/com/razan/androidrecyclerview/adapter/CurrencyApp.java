package com.razan.androidrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.razan.androidrecyclerview.R;
import com.razan.androidrecyclerview.Currency;
import java.util.ArrayList;


public class CurrencyApp extends RecyclerView.Adapter<CurrencyApp.CurrencyViewHolder> {

    private ArrayList<Currency> currencies;

    public CurrencyApp(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }


    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency,parent,false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currency currency = currencies.get(position);
        holder.currencyNameTextView.setText(currency.getCurrencyName());
        holder.currencyCodeTextView.setText(currency.getCurrencyCode());
        holder.currencyExchangeRate.setText(String.valueOf(currency.getExchangeRate()));
    }
    @Override
    public int getItemCount() {
        return currencies.size();
    }

    static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView currencyNameTextView;
        TextView currencyCodeTextView;
        TextView currencyExchangeRate;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);
            currencyExchangeRate = itemView.findViewById(R.id.currencyExchangeRate);

        }
}}