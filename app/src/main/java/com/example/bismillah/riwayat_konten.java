package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class riwayat_konten extends AppCompatActivity {
    Button riwayat_konten;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_konten);
        videoView = findViewById(R.id.riwayatKonten);
        riwayat_konten = findViewById(R.id.riwayat_konten);
        mediaVideo = new MediaController(this);
        riwayat_konten.setOnClickListener(new View.OnClickListener() {
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
