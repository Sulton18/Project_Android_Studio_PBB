package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sma12Kimia extends AppCompatActivity {
    Button mainSma12kimia;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma12_kimia);
        videoView = findViewById(R.id.sma12kimia);
        mainSma12kimia = findViewById(R.id.mainSma12kimia);
        mediaVideo = new MediaController(this);
        mainSma12kimia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMA%20KELAS%20XII%20KIMIA%20-%20korosi%20dan%20pencegahannya.mp4?alt=media&token=8716a163-ab1c-42e5-9959-fa10f95d97bf");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}