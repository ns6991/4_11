package com.example.a4_11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context applicationContext;
    String countryList[];
    String capitalList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countryList, String[] capitalList, int[] flags) {
        this.applicationContext = applicationContext;
        this.countryList = countryList;
        this.capitalList = capitalList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.custom_spinner_layout, null);
        TextView capital = (TextView) view.findViewById(R.id.capital);
        TextView country = (TextView) view.findViewById(R.id.country);
        ImageView flag = (ImageView) view.findViewById(R.id.flag);
        capital.setText(capitalList[i]);
        country.setText(countryList[i]);
        flag.setImageResource(flags[i]);
        return view;
    }
}
