package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Angkasa extends AppCompatActivity {
    WebView angkasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkasa);
        angkasa = findViewById(R.id.angkasa);
        angkasa.getSettings().setJavaScriptEnabled(true);
        angkasa.setWebViewClient(new WebViewClient());
        angkasa.loadUrl("wwt.belajar.kemdikbud.go.id");
    }
}
