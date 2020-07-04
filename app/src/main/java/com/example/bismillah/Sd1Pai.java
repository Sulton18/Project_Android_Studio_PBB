package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd1Pai extends AppCompatActivity {
    Button mainSd1pai;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd1_pai);
        videoView = findViewById(R.id.sd1pai);
        mainSd1pai = findViewById(R.id.mainSd1pai);
        mediaVideo = new MediaController(this);
        mainSd1pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SD%20KELAS%201%20AGAMA%20-%20ayo%20kita%20sholat.mp4?alt=media&token=a4694afa-e253-4a79-b9c2-85d65612b747");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}