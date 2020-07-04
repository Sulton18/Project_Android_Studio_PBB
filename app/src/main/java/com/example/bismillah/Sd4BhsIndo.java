package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd4BhsIndo extends AppCompatActivity {
    Button mainSd4bhsindo;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd4_bhs_indo);
        videoView = findViewById(R.id.sd4bhsindo);
        mainSd4bhsindo = findViewById(R.id.mainSd4bhsindo);
        mediaVideo = new MediaController(this);
        mainSd4bhsindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SD%20KELAS%204%20BAHASA%20INDONESIA%20-%20membuat%20pertanyaan%20untuk%20wawancara.mp4?alt=media&token=212a37d9-ae31-45c5-b26d-d8e93b751603");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}