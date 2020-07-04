package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KaryaKomunitas extends AppCompatActivity {
    WebView karya_komunitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karya_komunitas);
        karya_komunitas = findViewById(R.id.karya_komunitas);
        karya_komunitas.getSettings().setJavaScriptEnabled(true);
        karya_komunitas.setWebViewClient(new WebViewClient());
        karya_komunitas.loadUrl("https://belajar.kemdikbud.go.id/karyakomunitas");
    }
}
