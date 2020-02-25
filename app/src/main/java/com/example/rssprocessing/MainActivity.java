package com.example.rssprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button topStories;
    private Button sports;
    private final int STANDARD_REQUEST_CODE = 222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topStories = findViewById(R.id.topStories);
        sports = findViewById(R.id.sports);


        EventHandler eventHandler = new EventHandler();

        topStories.setOnClickListener(eventHandler);
        sports.setOnClickListener(eventHandler);

    }

    class EventHandler implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            //what View (UI widget) was clicked?
            switch (view.getId()) {
                case R.id.topStories:

                    //create explicit Intent to start OtherActivity
                    Intent i = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(i, STANDARD_REQUEST_CODE);
                    i.putExtra("url", "https://rss.cbc.ca/lineup/topstories.xml");
                    startActivity(i);
                    break;
                case R.id.sports:

                    //create explicit Intent to start OtherActivity
                    Intent j = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    j.putExtra("url", "https://rss.cbc.ca/lineup/sports.xml");
                    startActivity(j);
                    break;
            }
        }
    }
}
