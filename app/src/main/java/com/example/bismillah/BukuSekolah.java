package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BukuSekolah extends AppCompatActivity {
    WebView buku_sekolah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku_sekolah);
        buku_sekolah =findViewById(R.id.buku_sekolah);
        buku_sekolah.getSettings().setJavaScriptEnabled(true);
        buku_sekolah.setWebViewClient(new WebViewClient());
        buku_sekolah.loadUrl("https://bse.kemdikbud.go.id");
    }
}
