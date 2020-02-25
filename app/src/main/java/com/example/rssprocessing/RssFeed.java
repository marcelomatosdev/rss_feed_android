package com.example.rssprocessing;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class RssFeed extends AppCompatActivity {

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


        initRecycleView();
    }


    private void initRecycleView(){

            RecyclerView recyclerView = findViewById(R.id.rss_recycler_view);

            MyAdapter adapter = new MyAdapter(mFeeds,this);

            recyclerView.setAdapter(adapter);

            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }
    }




