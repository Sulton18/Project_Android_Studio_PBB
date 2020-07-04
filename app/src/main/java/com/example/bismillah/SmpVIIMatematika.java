package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class SmpVIIMatematika extends AppCompatActivity {
    Button mainSmp7matematika;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp_viimatematika);
        videoView = findViewById(R.id.smp7matematika);
        mainSmp7matematika = findViewById(R.id.mainSmp7matematika);
        mediaVideo = new MediaController(this);
        mainSmp7matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMP%20KELAS%20VII%20MATEMATIKA%20-%20skala.mp4?alt=media&token=d487ec80-3e69-47d9-b1b8-fb9750ef3cd1");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}