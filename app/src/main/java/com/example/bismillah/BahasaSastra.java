package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BahasaSastra extends AppCompatActivity {
    WebView bahasa_sastra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahasa_sastra);
        bahasa_sastra = findViewById(R.id.bahasa_sastra);
        bahasa_sastra.setWebViewClient(new WebViewClient());
        bahasa_sastra.loadUrl("https://belajar.kemdikbud.go.id/BahasaSastra");
    }
}
