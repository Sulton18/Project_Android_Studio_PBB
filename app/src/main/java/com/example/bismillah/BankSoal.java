package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BankSoal extends AppCompatActivity {
    WebView bank_soal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_soal);
        bank_soal = findViewById(R.id.bank_soal);
        bank_soal.setWebViewClient(new WebViewClient());
        bank_soal.loadUrl("https://belajar.kemdikbud.go.id/banksoal");
    }
}
