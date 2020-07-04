package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd2BhsIndo extends AppCompatActivity {
    Button mainSd2BhsIndo;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd2_bhs_indo);
        videoView = findViewById(R.id.sd2bhsIndo);
        mainSd2BhsIndo = findViewById(R.id.mainSd2BhsIndo);
        mediaVideo = new MediaController(this);
        mainSd2BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-1585671872082.appspot.com/o/sd_2_bhs_indo__penggunaan_huruf_apital.mp4?alt=media&token=74bdf9ff-a67e-452d-b752-bf5c9d8a598e");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}
