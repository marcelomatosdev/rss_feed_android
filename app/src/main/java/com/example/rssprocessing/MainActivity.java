package com.example.rssprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button topStories;
    private Button sports;
    private Button world;
    private Button canada;
    private Button business;
    private Button technology;
    private Button nhl;
    private Button curling;
    private Button cfl;
    private Button nba;

    //private final int STANDARD_REQUEST_CODE = 222;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        topStories = findViewById(R.id.topStories);
        sports = findViewById(R.id.sports);
          world = findViewById(R.id.world);
          canada = findViewById(R.id.canada);
          business = findViewById(R.id.business);
          technology = findViewById(R.id.technology);
          nhl = findViewById(R.id.nhl);
          curling = findViewById(R.id.curling);
          cfl = findViewById(R.id.cfl);
          nba = findViewById(R.id.nba);


        EventHandler eventHandler = new EventHandler();

        topStories.setOnClickListener(eventHandler);
        sports.setOnClickListener(eventHandler);
          world.setOnClickListener(eventHandler);
          canada.setOnClickListener(eventHandler);
          business.setOnClickListener(eventHandler);
          technology.setOnClickListener(eventHandler);
          nhl.setOnClickListener(eventHandler);
          curling.setOnClickListener(eventHandler);
          cfl.setOnClickListener(eventHandler);
          nba.setOnClickListener(eventHandler);


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
                case R.id.world:
                    //create explicit Intent to start OtherActivity
                    Intent k = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    k.putExtra("url", "https://rss.cbc.ca/lineup/world.xml");
                    startActivity(k);
                    break;
                case R.id.canada:

                    //create explicit Intent to start OtherActivity
                    Intent l = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    l.putExtra("url", "https://rss.cbc.ca/lineup/canada.xml");
                    startActivity(l);
                    break;
                case R.id.business:

                    //create explicit Intent to start OtherActivity
                    Intent m = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    m.putExtra("url", "https://rss.cbc.ca/lineup/business.xml");
                    startActivity(m);
                    break;
                case R.id.technology:

                    //create explicit Intent to start OtherActivity
                    Intent n = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    n.putExtra("url", "https://rss.cbc.ca/lineup/technology.xml");
                    startActivity(n);
                    break;
                case R.id.nhl:

                    //create explicit Intent to start OtherActivity
                    Intent o = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    o.putExtra("url", "https://rss.cbc.ca/lineup/sports-nhl.xml");
                    startActivity(o);
                    break;
                case R.id.curling:

                    //create explicit Intent to start OtherActivity
                    Intent p = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    p.putExtra("url", "https://rss.cbc.ca/lineup/sports-curling.xml");
                    startActivity(p);
                    break;
                case R.id.cfl:

                    //create explicit Intent to start OtherActivity
                    Intent q = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    q.putExtra("url", "https://rss.cbc.ca/lineup/sports-cfl.xml");
                    startActivity(q);
                    break;
                case R.id.nba:

                    //create explicit Intent to start OtherActivity
                    Intent r = new Intent(MainActivity.this, RssFeed.class);
                    //...and start it to get data back from OtherActivity
                    //startActivityForResult(j, STANDARD_REQUEST_CODE);
                    r.putExtra("url", "https://rss.cbc.ca/lineup/sports-nba.xml");
                    startActivity(r);
                    break;
            }
        }
    }
}
