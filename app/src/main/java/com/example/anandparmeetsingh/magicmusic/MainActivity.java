package com.example.anandparmeetsingh.magicmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        RelativeLayout now = (RelativeLayout) findViewById(R.id.nowPlaying);
        now.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(i);
            }
        });
        RelativeLayout library = (RelativeLayout) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, library.class);
                startActivity(i);
            }
        });
        RelativeLayout playlist = (RelativeLayout) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Playlist.class);
                startActivity(i);
            }
        });
        RelativeLayout favourites = (RelativeLayout) findViewById(R.id.favorites);
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Favorites.class);
                startActivity(i);
            }
        });
        RelativeLayout radio = (RelativeLayout) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Radio.class);
                startActivity(i);
            }
        });
        RelativeLayout explore = (RelativeLayout) findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Explore.class);
                startActivity(i);
            }
        });

    }
}