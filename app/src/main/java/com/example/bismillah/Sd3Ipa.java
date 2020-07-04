package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd3Ipa extends AppCompatActivity {
    Button mainSd3ipa;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd3_ipa);
        videoView = findViewById(R.id.sd3ipa);
        mainSd3ipa = findViewById(R.id.mainSd3ipa);
        mediaVideo = new MediaController(this);
        mainSd3ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SD%20KELAS%203%20IPA%20-%20Alat%20Komunikasi%20Masa%20Kini.mp4?alt=media&token=9d8342b4-fe9f-4536-93de-547ca1575621");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}