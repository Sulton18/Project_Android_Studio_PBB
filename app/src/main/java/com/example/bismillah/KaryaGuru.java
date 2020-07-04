package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KaryaGuru extends AppCompatActivity {
    WebView karya_guru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karya_guru);
        karya_guru = findViewById(R.id.karya_guru);
        karya_guru.getSettings().setJavaScriptEnabled(true);
        karya_guru.setWebViewClient(new WebViewClient());
        karya_guru.loadUrl("https://belajar.kemdikbud.go.id/karyaguru");
    }
}
