package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KelasDigital extends AppCompatActivity {
    WebView kelas_digital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_digital);
        kelas_digital = findViewById(R.id.kelas_digital);
        kelas_digital.getSettings().setJavaScriptEnabled(true);
        kelas_digital.setWebViewClient(new WebViewClient());
        kelas_digital.loadUrl("https://belajar.kemdikbud.go.id/kelasmaya");
    }
}
