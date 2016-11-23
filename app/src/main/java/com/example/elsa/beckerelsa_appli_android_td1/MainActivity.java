package com.example.elsa.beckerelsa_appli_android_td1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.activity_main);

        //A utiliser si les données affichées ne modifient pas la taille du recyclerview -> optimisation
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        final ArrayList<Animaux> animalsList = new ArrayList<Animaux>();
        initList(animalsList);

        adapter = new Adapter_RecyclerView(animalsList);
        recyclerView.setAdapter(adapter);
    }

    public void initList(ArrayList<Animaux> animalsList){

    }
}
