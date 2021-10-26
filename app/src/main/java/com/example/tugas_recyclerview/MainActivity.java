package com.example.tugas_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GamesAdapter adapter;
    private ArrayList<Games> gamesArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new GamesAdapter(gamesArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        gamesArrayList = new ArrayList<>();
        gamesArrayList.add(new Games(R.drawable.sotr,"Shadow of The Tomb Raider","Eidos-Montréal","2018"));
        gamesArrayList.add(new Games(R.drawable.taniv,"Tomb Raider: Anniversary","Crystal Dynamics","2007"));
        gamesArrayList.add(new Games(R.drawable.gi2,"Genshin Impact","MiHoyo","2020"));
        gamesArrayList.add(new Games(R.drawable.hi,"Honkai Impact 3","MiHoyo","2016"));
        gamesArrayList.add(new Games(R.drawable.rer2,"Resident Evil: Revelations 2","Capcom","2015"));
        gamesArrayList.add(new Games(R.drawable.rage,"Rage 2","Bethesda Softworks","2019"));
        gamesArrayList.add(new Games(R.drawable.so,"Sunset Overdrive","Insomniac Games","2014"));
        gamesArrayList.add(new Games(R.drawable.jc4,"Just Cause 4","Square Enix","2018"));
        gamesArrayList.add(new Games(R.drawable.fc5,"Far Cry 5","Ubisoft","2018"));
    }
}