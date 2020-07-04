package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd6Pai extends AppCompatActivity {

    Button mainSd6pai;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd6_pai);
        videoView = findViewById(R.id.sd6pai);
        mainSd6pai = findViewById(R.id.mainSd6pai);
        mediaVideo = new MediaController(this);
        mainSd6pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SD%20KELAS%206%20AGAMA%20-%20infaq%20dan%20sedekah.mp4?alt=media&token=bde59adf-d59b-4ccb-9b36-31b579add85d");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}