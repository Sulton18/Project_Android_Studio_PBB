package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sma11BhsInggris extends AppCompatActivity {
    Button mainSma11bhsinggris;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma11_bhs_inggris);
        videoView = findViewById(R.id.sma11bhsinggris);
        mainSma11bhsinggris = findViewById(R.id.mainSma11bhsinggris);
        mediaVideo = new MediaController(this);
        mainSma11bhsinggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMA%20KELAS%20XI%20BHS%20INGGRIS%20-%20expressing%20intention.mp4?alt=media&token=29d530e3-5e4d-41e8-85d2-b8fcbd729f26");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}
