package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Smk11Tmesin extends AppCompatActivity {
    Button mainSmk11tmesin;
    VideoView videoView;
    MediaController mediaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smk11_tmesin);
        videoView = findViewById(R.id.smk11tmesin);
        mainSmk11tmesin = findViewById(R.id.mainSmk11tmesin);
        mediaVideo = new MediaController(this);
        mainSmk11tmesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/bismillah-c4d86.appspot.com/o/SMK%20KELAS%20XI%20TEKNIK%20PERMESINAN%20-%20bagian-bagian%20mesin%20bubut%20cnc.mp4?alt=media&token=0ee96c75-bc30-4b55-89bb-ada5ad3c912c");
                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaVideo);
                mediaVideo.setAnchorView(videoView);
                videoView.start();
            }
        });
    }
}