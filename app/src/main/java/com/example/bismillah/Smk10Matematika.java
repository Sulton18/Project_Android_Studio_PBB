package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Smk10Matematika extends AppCompatActivity {
    Button mainSma10matemtika;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma10_matematika);
        videoView = findViewById(R.id.sma10matematika);
        mainSma10matemtika = findViewById(R.id.mainSma10matematika);
        mediaVideo = new MediaController(this);
        mainSma10matemtika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMK%20KELAS%20X%20MATEMATIKA%20-%20operasi%20hitung%20pada%20matriks.mp4?alt=media&token=7fc0965e-d1c9-4405-a94b-c5472d9e9fec");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}
