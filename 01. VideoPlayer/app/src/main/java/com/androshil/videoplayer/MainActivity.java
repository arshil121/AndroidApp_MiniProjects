package com.androshil.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://drive.google.com/file/d/19GjibnDD6Uyqi7cHK4btE898dzI8asR2/preview";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://www.youtube.com/embed/ZCTbp6YYNH8";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url="https://www.youtube.com/embed/568FIEjM0FM";
                Intent intent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(intent);
            }
        });

    }
}