package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PetaBudaya extends AppCompatActivity {
    WebView budaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta_budaya);
        budaya = findViewById(R.id.peta_budaya);
        budaya.setWebViewClient(new WebViewClient());
        budaya.loadUrl("https://belajar.kemdikbud.go.id/PetaBudaya");
    }
}
