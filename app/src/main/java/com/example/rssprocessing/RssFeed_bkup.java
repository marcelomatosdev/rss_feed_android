package com.example.rssprocessing;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RssFeed_bkup extends AppCompatActivity {

    private ArrayList<String> mFeeds = new ArrayList<>();
    private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rss_feed);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");


        initRssFeedUrl();


    }

    private void initRssFeedUrl() {

        mFeeds.add(url);
        mFeeds.add(url);

        initRecycleView();
    }


    private void initRecycleView(){

            RecyclerView recyclerView = findViewById(R.id.rss_recycler_view);

            MyAdapter adapter = new MyAdapter(mFeeds,this);

            recyclerView.setAdapter(adapter);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
    }









