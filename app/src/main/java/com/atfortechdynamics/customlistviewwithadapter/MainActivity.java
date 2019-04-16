package com.atfortechdynamics.customlistviewwithadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    County[] counties = {
            new County("Nairobi","047","4,000,000"),
            new County("Mombasa","001","2,000,000"),
            new County("Bungoma","39","1,000,000"),
            new County("Nyamira","023","500,000"),
            new County("Uasin Gishu","012","800,000"),
            new County("Bomet","002","500,000"),
            new County("Kisii","044","900,000"),
            new County("Kitui","043","300,000"),
            new County("Embu","020","600,000"),
            new County("Taita Taveta","045","700,000"),
            new County("Kiambu","026","3,500,000")
    };

    CustomAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter(getApplicationContext(),
                counties);
        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
