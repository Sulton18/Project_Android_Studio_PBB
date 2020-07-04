package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.content.SharedPreferences;
import android.os.Bundle;

public class DefaultDefault extends AppCompatActivity {
    private PDFView pdfView;
    private int savePage;
    private SharedPreferences pref;
    private SharedPreferences.Editor prefedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_default);
        pref = getApplicationContext().getSharedPreferences("default_budidaya_tanaman_hias",0);
        prefedit = pref.edit();
        pdfView = findViewById(R.id.pdfView);
        savePage = pref.getInt("savePage", savePage);
        pdfView.fromAsset("default_budidaya_tanaman_hias.pdf")
                .enableSwipe(true)
                .defaultPage(savePage)
                .load();
    }
    protected void onPause(){
        super.onPause();
        savePage = pdfView.getCurrentPage();
        prefedit.putInt("savePage",savePage);
        prefedit.apply();
    }
    protected void onStop(){
        super.onStop();
        savePage = pdfView.getCurrentPage();
        prefedit.putInt("savePage",savePage);
        prefedit.apply();
    }
}
