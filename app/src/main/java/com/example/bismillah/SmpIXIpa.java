package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class SmpIXIpa extends AppCompatActivity {

    Button mainSmp9ipa;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp_ixipa);
        videoView = findViewById(R.id.smp9ipa);
        mainSmp9ipa = findViewById(R.id.mainSmp9ipa);
        mediaVideo = new MediaController(this);
        mainSmp9ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMP%20KELAS%20IX%20IPA%20-%20muatan%20listrik.mp4?alt=media&token=73f8b37e-4deb-457d-a14f-4caa6aecacd2");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}