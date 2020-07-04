package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class SlbDefault extends AppCompatActivity {

    Button mainSlbDeafault;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slb_default);
        videoView = findViewById(R.id.slbDefault);
        mainSlbDeafault = findViewById(R.id.mainSlbDefault);
        mediaVideo = new MediaController(this);
        mainSlbDeafault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SLB%20DEFAULT%20-%20antaranku%20nan%20cantik.mp4?alt=media&token=d8448787-72fd-4e10-9e5b-24b7b6694078");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}