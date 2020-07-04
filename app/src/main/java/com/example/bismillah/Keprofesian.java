package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Keprofesian extends AppCompatActivity {
    WebView keprofesian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keprofesian);
        keprofesian = findViewById(R.id.keprofesian);
        keprofesian.getSettings().setJavaScriptEnabled(true);
        keprofesian.setWebViewClient(new WebViewClient());
        keprofesian.loadUrl("https://simpatik.belajar.kemdikbud.go.id");
    }
}
