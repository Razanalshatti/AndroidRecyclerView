package com.razan.androidrecyclerview.repositry;

import com.razan.androidrecyclerview.Currency;

import java.util.ArrayList;



public class CurrencyAppRepo {
    private static CurrencyAppRepo instance;
    private CurrencyAppRepo(){}
    public static CurrencyAppRepo getInstance(){
        if(instance == null)
            instance = new CurrencyAppRepo();
        return instance;
    }

    public ArrayList<Currency> generateDummyCurrencies(int numberOfItem){
        ArrayList<Currency> currencies = new ArrayList<>();
        for (int i=0; i < numberOfItem; i++) {
            currencies.add(new Currency("KWD","Kuwaiti Dinar",1));
            currencies.add(new Currency("USD","United State Dollar",3.25));
            currencies.add(new Currency("KWD","Euro",2.97));
        }
        return currencies;

    }
}
