package com.yasmin.appfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getSupportActionBar().hide();


        videoView = findViewById(R.id.videoView);
        String video = getIntent().getExtras().getString("video");

        //criar controladores
        videoView.setMediaController(new MediaController(this));

        //converter string para uri
        videoView.setVideoURI(Uri.parse(video));
        videoView.requestFocus();
        videoView.start();
    }
}