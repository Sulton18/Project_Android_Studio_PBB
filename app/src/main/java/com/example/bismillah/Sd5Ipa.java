package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sd5Ipa extends AppCompatActivity {

    Button mainSd5ipa;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd5_ipa);
        videoView = findViewById(R.id.sd5ipa);
        mainSd5ipa = findViewById(R.id.mainSd5ipa);
        mediaVideo = new MediaController(this);
        mainSd5ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SD%20KELAS%205%20IPA%20-%20Rangka%20Manusia%20dan%20Fungsinya.mp4?alt=media&token=fc9f229b-6dcf-41fe-bfbe-fb96873745b2");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}