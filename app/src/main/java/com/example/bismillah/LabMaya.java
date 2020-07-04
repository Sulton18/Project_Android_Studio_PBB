package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LabMaya extends AppCompatActivity {
    WebView lab_maya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_maya);
        lab_maya = findViewById(R.id.lab_maya);
        lab_maya.setWebViewClient(new WebViewClient());
        lab_maya.loadUrl("https://vlab.belajar.kemdikbud.go.id/");
    }
}
