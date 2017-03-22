package com.example.anandparmeetsingh.magicmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        RelativeLayout now = (RelativeLayout) findViewById(R.id.library);
        now.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, library.class);
                startActivity(i);
                finish();
            }
        });
        RelativeLayout playlist = (RelativeLayout) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, Playlist.class);
                startActivity(i);
                finish();
            }
        });
        RelativeLayout radio = (RelativeLayout) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, Radio.class);
                startActivity(i);
                finish();
            }
        });
        RelativeLayout explore = (RelativeLayout) findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(NowPlaying.this, Explore.class);
                startActivity(i);
                finish();
            }
        });
    }
}
