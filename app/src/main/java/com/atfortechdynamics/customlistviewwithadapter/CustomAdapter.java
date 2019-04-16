package com.atfortechdynamics.customlistviewwithadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    County[] data;

    LayoutInflater inflater;
    public CustomAdapter(Context context, County[] data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_item,null);

        TextView name = view.findViewById(R.id.name);
        TextView code = view.findViewById(R.id.code);
        TextView population = view.findViewById(R.id.population);

        name.setText(data[i].getName());
        code.setText(data[i].getCode());
        population.setText(data[i].getPopulation());

        return view;
    }
}
