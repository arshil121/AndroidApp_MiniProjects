package com.androshil.fourinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoPlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play_list);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://www.youtube.com/embed/ZCTbp6YYNH8";
                Intent intent = new Intent(VideoPlayList.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://www.youtube.com/embed/ZCTbp6YYNH8";
                Intent intent = new Intent(VideoPlayList.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://www.youtube.com/embed/568FIEjM0FM";
                Intent intent = new Intent(VideoPlayList.this, VideoPlayer.class);
                startActivity(intent);
            }
        });
    }
}