package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class SumberBelajar extends AppCompatActivity {
    LinearLayout linearLayoutSlb, linearLayoutDefault, linearLayoutPaud,linearLayoutSd, linearLayoutSmp,linearLayoutSma,linearLayoutSmk,
    linearLayoutKelasSlb, linearLayoutKelasDefault, linearLayoutKelasPaud1, linearLayoutKelasPaud2,linearLayoutKelasPaud3,
    linearLayoutKelasSmpVII,linearLayoutKelasSmpVIII,linearLayoutKelasSmpIX,
    linearLayoutKelasSmaX,linearLayoutKelasSmaXI,linearLayoutKelasSmaXII,
    linearLayoutKelasSmkX,linearLayoutKelasSmkXI,linearLayoutKelasSmkXII,
    linearLayoutKelasSd1,linearLayoutKelasSd2,linearLayoutKelasSd3,linearLayoutKelasSd4,linearLayoutKelasSd5,linearLayoutKelasSd6;
    ImageButton slb,Bdefault,paud,sd,smp,sma,smk,
    KelasSlb,KelasDefault,KelasPaud1,KelasPaud2,KelasPaud3,
    KelasSd1,KelasSd2,KelasSd3,KelasSd4,KelasSd5,KelasSd6,
    KelasSmpVII,KelasSmpVIII, KelasSmpIX,
    KelasSmaX,KelasSmaXI,KelasSmaXII,
    KelasSmkX,KelasSmkXI,KelasSmkXII,
            Sd1BhsIndo,Sd1BhsInggriss,Sd1Ipa,Sd1Ips,Sd1Matematika,Sd1Pai,Sd1Pjok,Sd1Pkn,
            Sd2BhsIndo,Sd2BhsInggriss,Sd2Ipa,Sd2Ips,Sd2Matematika,Sd2Pai,Sd2Pjok,Sd2Pkn,
            Sd3BhsIndo,Sd3BhsInggriss,Sd3Ipa,Sd3Ips,Sd3Matematika,Sd3Pai,Sd3Pjok,Sd3Pkn,
            Sd4BhsIndo,Sd4BhsInggriss,Sd4Ipa,Sd4Ips,Sd4Matematika,Sd4Pai,Sd4Pjok,Sd4Pkn,
            Sd5BhsIndo,Sd5BhsInggriss,Sd5Ipa,Sd5Ips,Sd5Matematika,Sd5Pai,Sd5Pjok,Sd5Pkn,
            Sd6BhsIndo,Sd6BhsInggriss,Sd6Ipa,Sd6Ips,Sd6Matematika,Sd6Pai,Sd6Pjok,Sd6Pkn,

            Smp7BhsIndo,Smp7BhsInggris,Smp7Ipa,Smp7Ips,Smp7Matematika,Smp7Smp,Smp7Pjok,Smp7Pkn,Smp7Sbudaya,Smp7Tik,
            Smp8BhsIndo,Smp8BhsInggris,Smp8Ipa,Smp8Ips,Smp8Matematika,Smp8Smp,Smp8Pjok,Smp8Pkn,Smp8Sbudaya,Smp8Tik,
            Smp9BhsIndo,Smp9BhsInggris,Smp9Ipa,Smp9Ips,Smp9Matematika,Smp9Smp,Smp9Pjok,Smp9Pkn,Smp9Sbudaya,Smp9Tik,

            Sma10Akuntansi,Sma10BhsIndo,Sma10BhsInggris,Sma10BhsJawa,Sma10Biologi,Sma10Ekonomi,Sma10Fisika,Sma10Geografi,Sma10Kimia,Sma10Matematika,Sma10Pab,Sma10Pah,
            Sma11Akuntansi,Sma11BhsIndo,Sma11BhsInggris,Sma11BhsJawa,Sma11Biologi,Sma11Ekonomi,Sma11Fisika,Sma11Geografi,Sma11Kimia,Sma11Matematika,Sma11Pab,Sma11Pah,
            Sma12Akuntansi,Sma12BhsIndo,Sma12BhsInggris,Sma12BhsJawa,Sma12Biologi,Sma12Ekonomi,Sma12Fisika,Sma12Geografi,Sma12Kimia,Sma12Matematika,Sma12Pab,Sma12Pah,

            Smk10Akuntansi,Smk10BhsIndo,Smk10Tkj,Smk10Matematika,Smk10Mulmed,Smk10Tei,Smk10Tmesin,
            Smk11Akuntansi,Smk11BhsIndo,Smk11Tkj,Smk11Matematika,Smk11Mulmed,Smk11Tei,Smk11Tmesin,
            Smk12Akuntansi,Smk12BhsIndo,Smk12Tkj,Smk12Matematika,Smk12Mulmed,Smk12Tei,Smk12Tmesin,

    defaultSLB, ipaSLB, DefaulDefault, Paud02,Paud5, Paud34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumber_belajar);

        final boolean[] statusSlb = {true};
        final boolean[] statusDefault = {true};
        final boolean[] statusPaud = {true};
        final boolean[] statusSd = {true};
        final boolean[] statusSmp = {true};
        final boolean[] statusSma = {true};
        final boolean[] statusSmk = {true};

        final boolean[] kelasSlb = {true};
        final boolean[] kelasDefault = {true};
        final boolean[] kelasPaud1 = {true};
        final boolean[] kelasPaud2 = {true};
        final boolean[] kelasPaud3 = {true};

        final boolean[] kelasSd1 = {true};
        final boolean[] kelasSd2 = {true};
        final boolean[] kelasSd3 = {true};
        final boolean[] kelasSd4 = {true};
        final boolean[] kelasSd5 = {true};
        final boolean[] kelasSd6 = {true};

        final boolean[] kelasSmp1 = {true};
        final boolean[] kelasSmp2 = {true};
        final boolean[] kelasSmp3 = {true};

        final boolean[] kelasSma1 = {true};
        final boolean[] kelasSma2 = {true};
        final boolean[] kelasSma3 = {true};

        final boolean[] kelasSmk1 = {true};
        final boolean[] kelasSmk2 = {true};
        final boolean[] kelasSmk3 = {true};


        linearLayoutSlb = findViewById(R.id.klik_slb);
        linearLayoutDefault = findViewById(R.id.klik_default);
        linearLayoutPaud = findViewById(R.id.klik_paud);
        linearLayoutSd = findViewById(R.id.klik_sd);
        linearLayoutSmp = findViewById(R.id.klik_smp);
        linearLayoutSma = findViewById(R.id.klik_sma);
        linearLayoutSmk = findViewById(R.id.klik_smk);

        linearLayoutKelasSlb = findViewById(R.id.mapel_slb);
        linearLayoutKelasDefault = findViewById(R.id.mapel_default);
        linearLayoutKelasSd1 = findViewById(R.id.mapel_sd1);
        linearLayoutKelasSd2 = findViewById(R.id.mapel_sd2);
        linearLayoutKelasSd3 = findViewById(R.id.mapel_sd3);
        linearLayoutKelasSd4 = findViewById(R.id.mapel_sd4);
        linearLayoutKelasSd5 = findViewById(R.id.mapel_sd5);
        linearLayoutKelasSd6 = findViewById(R.id.mapel_sd6);
        linearLayoutKelasPaud1 = findViewById(R.id.mapel_paud1);
        linearLayoutKelasPaud2 = findViewById(R.id.mapel_paud2);
        linearLayoutKelasPaud3 = findViewById(R.id.mapel_paud3);
        linearLayoutKelasSmpVII = findViewById(R.id.mapel_smp_vii);
        linearLayoutKelasSmpVIII = findViewById(R.id.mapel_smp_viii);
        linearLayoutKelasSmpIX = findViewById(R.id.mapel_smp_ix);
        linearLayoutKelasSmaX = findViewById(R.id.mapel_sma_x);
        linearLayoutKelasSmaXI = findViewById(R.id.mapel_sma_xi);
        linearLayoutKelasSmaXII = findViewById(R.id.mapel_sma_xii);
        linearLayoutKelasSmkX = findViewById(R.id.mapel_smk_x);
        linearLayoutKelasSmkXI = findViewById(R.id.mapel_smk_xi);
        linearLayoutKelasSmkXII = findViewById(R.id.mapel_smk_xii);


        slb = findViewById(R.id.button_slb);
        Bdefault = findViewById(R.id.button_default);
        paud = findViewById(R.id.button_paud);
        sd = findViewById(R.id.button_sd);
        smp = findViewById(R.id.button_smp);
        sma = findViewById(R.id.button_sma);
        smk = findViewById(R.id.button_smk);

        KelasSlb = findViewById(R.id.kelas_slb);
        KelasDefault = findViewById(R.id.kelas_default);
        KelasPaud1 = findViewById(R.id.kelas_paud1);
        KelasPaud2 = findViewById(R.id.kelas_paud2);
        KelasPaud3 = findViewById(R.id.kelas_paud3);
        KelasSd1 = findViewById(R.id.kelas_sd1);
        KelasSd2 = findViewById(R.id.kelas_sd2);
        KelasSd3 = findViewById(R.id.kelas_sd3);
        KelasSd4 = findViewById(R.id.kelas_sd4);
        KelasSd5 = findViewById(R.id.kelas_sd5);
        KelasSd6 = findViewById(R.id.kelas_sd6);
        KelasSmpVII = findViewById(R.id.kelas_smp1);
        KelasSmpVIII = findViewById(R.id.kelas_smp2);
        KelasSmpIX = findViewById(R.id.kelas_smp3);
        KelasSmaX = findViewById(R.id.kelas_sma1);
        KelasSmaXI = findViewById(R.id.kelas_sma2);
        KelasSmaXII = findViewById(R.id.kelas_sma3);
        KelasSmkX = findViewById(R.id.kelas_smk1);
        KelasSmkXI = findViewById(R.id.kelas_smk2);
        KelasSmkXII = findViewById(R.id.kelas_smk3);


        Sd1BhsIndo = findViewById(R.id.pelajaran_sd1_bhs_indonesia);
        Sd1BhsInggriss = findViewById(R.id.pelajaran_sd1_bhs_inggris);
        Sd1Ipa = findViewById(R.id.pelajaran_sd1_ipa);
        Sd1Ips = findViewById(R.id.pelajaran_sd1_ips);
        Sd1Matematika = findViewById(R.id.pelajaran_sd1_matematika);
        Sd1Pai =findViewById(R.id.pelajaran_sd1_pai);
        Sd1Pjok = findViewById(R.id.pelajaran_sd1_pjok);
        Sd1Pkn = findViewById(R.id.pelajaran_sd1_pkn);

        Sd2BhsIndo = findViewById(R.id.pelajaran_sd2_bhs_indonesia);
        Sd2BhsInggriss = findViewById(R.id.pelajaran_sd2_bhs_inggris);
        Sd2Ipa = findViewById(R.id.pelajaran_sd2_ipa);
        Sd2Ips = findViewById(R.id.pelajaran_sd2_ips);
        Sd2Matematika = findViewById(R.id.pelajaran_sd2_matematika);
        Sd2Pai =findViewById(R.id.pelajaran_sd2_pai);
        Sd2Pjok = findViewById(R.id.pelajaran_sd2_pjok);
        Sd2Pkn = findViewById(R.id.pelajaran_sd2_pkn);

        Sd3BhsIndo = findViewById(R.id.pelajaran_sd3_bhs_indonesia);
        Sd3BhsInggriss = findViewById(R.id.pelajaran_sd3_bhs_inggris);
        Sd3Ipa = findViewById(R.id.pelajaran_sd3_ipa);
        Sd3Ips = findViewById(R.id.pelajaran_sd3_ips);
        Sd3Matematika = findViewById(R.id.pelajaran_sd3_matematika);
        Sd3Pai =findViewById(R.id.pelajaran_sd3_pai);
        Sd3Pjok = findViewById(R.id.pelajaran_sd3_pjok);
        Sd3Pkn = findViewById(R.id.pelajaran_sd3_pkn);

        Sd4BhsIndo = findViewById(R.id.pelajaran_sd4_bhs_indonesia);
        Sd4BhsInggriss = findViewById(R.id.pelajaran_sd4_bhs_inggris);
        Sd4Ipa = findViewById(R.id.pelajaran_sd4_ipa);
        Sd4Ips = findViewById(R.id.pelajaran_sd4_ips);
        Sd4Matematika = findViewById(R.id.pelajaran_sd4_matematika);
        Sd4Pai =findViewById(R.id.pelajaran_sd4_pai);
        Sd4Pjok = findViewById(R.id.pelajaran_sd4_pjok);
        Sd4Pkn = findViewById(R.id.pelajaran_sd4_pkn);

        Sd5BhsIndo = findViewById(R.id.pelajaran_sd5_bhs_indonesia);
        Sd5BhsInggriss = findViewById(R.id.pelajaran_sd5_bhs_inggris);
        Sd5Ipa = findViewById(R.id.pelajaran_sd5_ipa);
        Sd5Ips = findViewById(R.id.pelajaran_sd5_ips);
        Sd5Matematika = findViewById(R.id.pelajaran_sd5_matematika);
        Sd5Pai =findViewById(R.id.pelajaran_sd5_pai);
        Sd5Pjok = findViewById(R.id.pelajaran_sd5_pjok);
        Sd5Pkn = findViewById(R.id.pelajaran_sd5_pkn);

        Sd6BhsIndo = findViewById(R.id.pelajaran_sd6_bhs_indonesia);
        Sd6BhsInggriss = findViewById(R.id.pelajaran_sd6_bhs_inggris);
        Sd6Ipa = findViewById(R.id.pelajaran_sd6_ipa);
        Sd6Ips = findViewById(R.id.pelajaran_sd6_ips);
        Sd6Matematika = findViewById(R.id.pelajaran_sd6_matematika);
        Sd6Pai =findViewById(R.id.pelajaran_sd6_pai);
        Sd6Pjok = findViewById(R.id.pelajaran_sd6_pjok);
        Sd6Pkn = findViewById(R.id.pelajaran_sd6_pkn);


        Smp7BhsIndo = findViewById(R.id.pelajaran_smp7_bhs_indo);
        Smp7BhsInggris = findViewById(R.id.pelajaran_smp7_bhs_inggris);
        Smp7Ipa = findViewById(R.id.pelajaran_smp7_ipa);
        Smp7Ips = findViewById(R.id.pelajaran_smp7_ips);
        Smp7Matematika = findViewById(R.id.pelajaran_smp7_matematika);
        Smp7Pjok = findViewById(R.id.pelajaran_smp7_pjok);
        Smp7Pkn = findViewById(R.id.pelajaran_smp7_pkn);
        Smp7Sbudaya = findViewById(R.id.pelajaran_smp7_seni_budaya);
        Smp7Tik = findViewById(R.id.pelajaran_smp7_tik);
        Smp7Smp = findViewById(R.id.pelajaran_smp7_pai);

        Smp8BhsIndo = findViewById(R.id.pelajaran_smp8_bhs_indo);
        Smp8BhsInggris = findViewById(R.id.pelajaran_smp8_bhs_inggris);
        Smp8Ipa = findViewById(R.id.pelajaran_smp8_ipa);
        Smp8Ips = findViewById(R.id.pelajaran_smp8_ips);
        Smp8Matematika = findViewById(R.id.pelajaran_smp8_matematika);
        Smp8Pjok = findViewById(R.id.pelajaran_smp8_pjok);
        Smp8Pkn = findViewById(R.id.pelajaran_smp8_pkn);
        Smp8Sbudaya = findViewById(R.id.pelajaran_smp8_seni_budaya);
        Smp8Tik = findViewById(R.id.pelajaran_smp8_tik);
        Smp8Smp = findViewById(R.id.pelajaran_smp8_pai);

        Smp9BhsIndo = findViewById(R.id.pelajaran_smp9_bhs_indo);
        Smp9BhsInggris = findViewById(R.id.pelajaran_smp9_bhs_inggris);
        Smp9Ipa = findViewById(R.id.pelajaran_smp9_ipa);
        Smp9Ips = findViewById(R.id.pelajaran_smp9_ips);
        Smp9Matematika = findViewById(R.id.pelajaran_smp9_matematika);
        Smp9Pjok = findViewById(R.id.pelajaran_smp9_pjok);
        Smp9Pkn = findViewById(R.id.pelajaran_smp9_pkn);
        Smp9Sbudaya = findViewById(R.id.pelajaran_smp9_seni_budaya);
        Smp9Tik = findViewById(R.id.pelajaran_smp9_tik);
        Smp9Smp = findViewById(R.id.pelajaran_smp9_pai);

        Sma10Akuntansi = findViewById(R.id.pelajaran_sma10_akuntansi);
        Sma10BhsIndo = findViewById(R.id.pelajaran_sma10_bhs_indonesia);
        Sma10BhsInggris = findViewById(R.id.pelajaran_sma10_bhs_inggris);
        Sma10BhsJawa = findViewById(R.id.pelajaran_sma10_bhs_jawa);
        Sma10Biologi = findViewById(R.id.pelajaran_sma10_biologi);
        Sma10Ekonomi = findViewById(R.id.pelajaran_sma10_ekonomi);
        Sma10Fisika = findViewById(R.id.pelajaran_sma10_fisika);
        Sma10Geografi = findViewById(R.id.pelajaran_sma10_geografi);
        Sma10Kimia = findViewById(R.id.pelajaran_sma10_kimia);
        Sma10Matematika = findViewById(R.id.pelajaran_sma10_matematika);
        Sma10Pab = findViewById(R.id.pelajaran_sma10_pab);
        Sma10Pah = findViewById(R.id.pelajaran_sma10_pah);

        Sma11Akuntansi = findViewById(R.id.pelajaran_sma11_akuntansi);
        Sma11BhsIndo = findViewById(R.id.pelajaran_sma11_bhs_indonesia);
        Sma11BhsJawa = findViewById(R.id.pelajaran_sma11_bhs_jawa);
        Sma11Biologi = findViewById(R.id.pelajaran_sma11_biologi);
        Sma11Ekonomi = findViewById(R.id.pelajaran_sma11_ekonomi);
        Sma11Fisika = findViewById(R.id.pelajaran_sma11_fisika);
        Sma11Geografi = findViewById(R.id.pelajaran_sma11_geografi);
        Sma11Kimia = findViewById(R.id.pelajaran_sma11_kimia);
        Sma11Matematika = findViewById(R.id.pelajaran_sma11_matematika);
        Sma11Pab = findViewById(R.id.pelajaran_sma11_pab);
        Sma11Pah = findViewById(R.id.pelajaran_sma11_pah);

        Sma12Akuntansi = findViewById(R.id.pelajaran_sma12_akuntansi);
        Sma12BhsIndo = findViewById(R.id.pelajaran_sma12_bhs_indonesia);
        Sma12BhsJawa = findViewById(R.id.pelajaran_sma12_bhs_jawa);
        Sma12Biologi = findViewById(R.id.pelajaran_sma12_biologi);
        Sma12Ekonomi = findViewById(R.id.pelajaran_sma12_ekonomi);
        Sma12Fisika = findViewById(R.id.pelajaran_sma12_fisika);
        Sma12Geografi = findViewById(R.id.pelajaran_sma12_geografi);
        Sma12Kimia = findViewById(R.id.pelajaran_sma12_kimia);
        Sma12Matematika = findViewById(R.id.pelajaran_sma12_matematika);
        Sma12Pab = findViewById(R.id.pelajaran_sma12_pab);
        Sma12Pah = findViewById(R.id.pelajaran_sma12_pah);

        Smk10Akuntansi = findViewById(R.id.pelajaran_smk10_akuntansi);
        Smk10BhsIndo = findViewById(R.id.pelajaran_smk10_bhs_indonesia);
        Smk10Mulmed = findViewById(R.id.pelajaran_smk10_mulmed);
        Smk10Matematika = findViewById(R.id.pelajaran_smk10_matematika);
        Smk10Tei = findViewById(R.id.pelajaran_smk10_teknik_elektronika_industri);
        Smk10Tkj = findViewById(R.id.pelajaran_smk10_tkj);
        Smk10Tmesin = findViewById(R.id.pelajaran_smk10_teknik_mesin);

        Smk11Akuntansi = findViewById(R.id.pelajaran_smk11_akuntansi);
        Smk11BhsIndo = findViewById(R.id.pelajaran_smk11_bhs_indonesia);
        Smk11Mulmed = findViewById(R.id.pelajaran_smk11_mulmed);
        Smk11Matematika = findViewById(R.id.pelajaran_smk11_matematika);
        Smk11Tei = findViewById(R.id.pelajaran_smk11_teknik_elektronika_industri);
        Smk11Tkj = findViewById(R.id.pelajaran_smk11_tkj);
        Smk11Tmesin = findViewById(R.id.pelajaran_smk11_teknik_mesin);

        Smk12Akuntansi = findViewById(R.id.pelajaran_smk12_akuntansi);
        Smk12BhsIndo = findViewById(R.id.pelajaran_smk12_bhs_indonesia);
        Smk12Mulmed = findViewById(R.id.pelajaran_smk12_mulmed);
        Smk12Matematika = findViewById(R.id.pelajaran_smk12_matematika);
        Smk12Tei = findViewById(R.id.pelajaran_smk12_teknik_elektronika_industri);
        Smk12Tkj = findViewById(R.id.pelajaran_smk12_tkj);
        Smk12Tmesin = findViewById(R.id.pelajaran_smk12_teknik_mesin);

        defaultSLB = findViewById(R.id.pelajaran_slb1);
        ipaSLB = findViewById(R.id.pelajaran_slb2);
        DefaulDefault = findViewById(R.id.plajaran_default);
        Paud02 = findViewById(R.id.plajaran_paud1);
        Paud34 = findViewById(R.id.plajaran_paud2);
        Paud5 = findViewById(R.id.plajaran_paud3);

        defaultSLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SlbDefault.class);
                startActivity(intent);
            }
        });
        ipaSLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SlbIpa.class);
                startActivity(intent);
            }
        });
        DefaulDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DefaultDefault.class);
                startActivity(intent);
            }
        });
        Paud02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Paud02Paud.class);
                startActivity(intent);
            }
        });
        Paud34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Paud34Paud.class);
                startActivity(intent);
            }
        });
        Paud5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Paud5Paud.class);
                startActivity(intent);
            }
        });





        Smk10Tmesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Tmesin.class);
                startActivity(intent);
            }
        });
        Smk10Tkj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Tkj.class);
                startActivity(intent);
            }
        });
        Smk10Tei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Tei.class);
                startActivity(intent);
            }
        });
        Smk10Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Matematika.class);
                startActivity(intent);
            }
        });
        Smk10Mulmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Mulmed.class);
                startActivity(intent);
            }
        });
        Smk10BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10BhsIndo.class);
                startActivity(intent);
            }
        });
        Smk10Akuntansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Smk10Akuntansi.class);
                startActivity(intent);
            }
        });

        Smk11Akuntansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11Akuntansi.class);
                startActivity(intent);
            }
        });
        Smk11BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11BhsIndo.class);
                startActivity(intent);
            }
        });
        Smk11Mulmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11Mulmed.class);
                startActivity(intent);
            }
        });
        Smk11Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(v.getContext(), com.example.bismillah.Smk11Matematika.class);
                startActivity(intent);
            }
        });
        Smk11Tei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11Tei.class);
                startActivity(intent);
            }
        });
        Smk11Tkj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11Tkj.class);
                startActivity(intent);
            }
        });
        Smk11Tmesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk11Tmesin.class);
                startActivity(intent);
            }
        });

        Smk12Akuntansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), com.example.bismillah.Smk12Akuntansi.class);
                startActivity(intent);
            }
        });
        Smk12BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12BhsIndo.class);
                startActivity(intent);
            }
        });
        Smk12Mulmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12Mulmed.class);
                startActivity(intent);
            }
        });
        Smk12Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12Matematika.class);
                startActivity(intent);
            }
        });
        Smk12Tei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12Tei.class);
                startActivity(intent);
            }
        });
        Smk12Tmesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12Tmesin.class);
                startActivity(intent);
            }
        });
        Smk12Tkj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Smk12Tkj.class);
                startActivity(intent);
            }
        });




        Sma10Pah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Pah.class);
                startActivity(intent);
            }
        });
        Sma10Pab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(),Sma10Pab.class);
                startActivity(intent);
            }
        });
        Sma10Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Matematika.class);
                startActivity(intent);
            }
        });
        Sma10Kimia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Sma10Kimia.class);
                startActivity(intent);
            }
        });
        Sma10Geografi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Geografi.class);
                startActivity(intent);
            }
        });
        Sma10Fisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Fisika.class);
                startActivity(intent);
            }
        });
        Sma10Ekonomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Ekonomi.class);
                startActivity(intent);
            }
        });
        Sma10Biologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Sma10Biologi.class);
                startActivity(intent);
            }
        });
        Sma10BhsJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10BhsJawa.class);
                startActivity(intent);
            }
        });
        Sma10BhsInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Sma10BhsInggris.class);
                startActivity(intent);
            }
        });
        Sma10BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), Sma10BhsIndo.class);
                startActivity(intent);
            }
        });
        Sma10Akuntansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sma10Akuntansi.class);
                startActivity(intent);
            }
        });




        Smp7BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SmpVIIBhsIndo.class );
                startActivity(intent);
            }
        });
        Smp7BhsInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIBhsInggris.class);
                startActivity(intent);
            }
        });

        Smp7Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SmpVII_Ipa.class);
                startActivity(intent);
            }
        });
        Smp7Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SmpVII_Ips.class);
                startActivity(intent);
            }
        });
        Smp7Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIMatematika.class);
                startActivity(intent);
            }
        });
        Smp7Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIPjok.class);
                startActivity(intent);
            }
        });
        Smp7Smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIPai.class);
                startActivity(intent);
            }
        });
        Smp7Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIPkn.class);
                startActivity(intent);
            }
        });

        Smp8BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIIBhsIndo.class);
                startActivity(intent);
            }
        });
        Smp8BhsInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(v.getContext(), SmpVIIIBhsInggris.class);
                startActivity(intent);
            }
        });
        Smp8Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIII_Ipa.class);
                startActivity(intent);
            }
        });
        Smp8Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIII_Ips.class);
                startActivity(intent);
            }
        });
        Smp8Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIIMatematika.class);
                startActivity(intent);
            }
        });
        Smp8Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIIPjok.class);
                startActivity(intent);
            }
        });
        Smp8Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIIPkn.class);
                startActivity(intent);
            }
        });
        Smp8Smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpVIIIPai.class);
                startActivity(intent);
            }
        });

        Smp9BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXBhsIndo.class);
                startActivity(intent);
            }
        });
        Smp9BhsInggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXBhsInggris.class);
                startActivity(intent);
            }
        });
        Smp9Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXIpa.class);
                startActivity(intent);
            }
        });
        Smp9Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXIps.class);
                startActivity(intent);
            }
        });
        Smp9Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXMatematika.class);
                startActivity(intent);
            }
        });
        Smp9Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXPjok.class);
                startActivity(intent);
            }
        });
        Smp9Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXPkn.class);
                startActivity(intent);
            }
        });
        Smp9Smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SmpIXPai.class);
                startActivity(intent);
            }
        });




        Sd1BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1BhsInggris.class);
                startActivity(intent);
            }
        });

        Sd1BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1BhsIndonesia.class);
                startActivity(intent);
            }
        });
        Sd1Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Ipa.class);
                startActivity(intent);
            }
        });
        Sd1Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Ips.class);
                startActivity(intent);
            }
        });
        Sd1Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Matematika.class);
                startActivity(intent);
            }
        });
        Sd1Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Pai.class);
                startActivity(intent);
            }
        });
        Sd1Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Pjok.class);
                startActivity(intent);
            }
        });
        Sd1Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd1Pkn.class);
                startActivity(intent);
            }
        });

        Sd2BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2BhsIndo.class);
                startActivity(intent);
            }
        });
        Sd2BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Sd2BhsInggris.class);
                startActivity(intent);
            }
        });
        Sd2Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), com.example.bismillah.Sd2Matematika.class);
                startActivity(intent);
            }
        });
        Sd2Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2Pkn.class);
                startActivity(intent);
            }
        });
        Sd2Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2Pjok.class);
                startActivity(intent);
            }
        });
        Sd2Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2Pai.class);
                startActivity(intent);
            }
        });
        Sd2Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2Ips.class);
                startActivity(intent);
            }
        });
        Sd2Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd2Ipa.class);
                startActivity(intent);
            }
        });

        Sd3Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Matematika.class);
                startActivity(intent);
            }
        });
        Sd3Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Pkn.class);
                startActivity(intent);
            }
        });
        Sd3Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Pjok.class);
                startActivity(intent);
            }
        });
        Sd3Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Pai.class);
                startActivity(intent);
            }
        });
        Sd3Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Ips.class);
                startActivity(intent);
            }
        });
        Sd3Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3Ipa.class);
                startActivity(intent);
            }
        });
        Sd3BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd3BhsIndo.class);
                startActivity(intent);
            }
        });
        Sd3BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd3BhsInggris.class);
                startActivity(intent);
            }
        });


        Sd4Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Pkn.class);
                startActivity(intent);
            }
        });
        Sd4Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Pjok.class);
                startActivity(intent);
            }
        });
        Sd4Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Pai.class);
                startActivity(intent);
            }
        });
        Sd4Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Matematika.class);
                startActivity(intent);
            }
        });
        Sd4Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Ips.class);
                startActivity(intent);
            }
        });
        Sd4Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4Ipa.class);
                startActivity(intent);
            }
        });
        Sd4BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd4BhsIndo.class);
                startActivity(intent);
            }
        });
        Sd4BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd4BhsInggris.class);
                startActivity(intent);
            }
        });

        Sd5Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Pkn.class);
                startActivity(intent);
            }
        });
        Sd5Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Pjok.class);
                startActivity(intent);
            }
        });
        Sd5Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Pai.class);
                startActivity(intent);
            }
        });
        Sd5Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Matematika.class);
                startActivity(intent);
            }
        });
        Sd5Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Ips.class);
                startActivity(intent);
            }
        });
        Sd5Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5Ipa.class);
                startActivity(intent);
            }
        });
        Sd5BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd5BhsIndo.class);
                startActivity(intent);
            }
        });
        Sd5BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd5BhsInggris.class);
                startActivity(intent);
            }
        });

        Sd6Pkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6Pkn.class);
                startActivity(intent);
            }
        });
        Sd6Pjok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6Pjok.class);
                startActivity(intent);
            }
        });
        Sd6Pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6Pai.class);
                startActivity(intent);
            }
        });
        Sd6Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6Matematika.class);
                startActivity(intent);
            }
        });
        Sd6Ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6Ips.class);
                startActivity(intent);
            }
        });
        Sd6Ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(v.getContext(), com.example.bismillah.Sd6Ipa.class);
                startActivity(intent);
            }
        });
        Sd6BhsIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.bismillah.Sd6BhsIndo.class);
                startActivity(intent);
            }
        });
        Sd6BhsInggriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Sd6BhsInggris.class);
                startActivity(intent);
            }
        });







        slb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSlb[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.VISIBLE);
                    statusSlb[0] = false;
                }else {
                    statusSlb[0] = true;
                }
            }
        });
        Bdefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusDefault[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.VISIBLE);
                    statusDefault[0] = false;
                }else {
                    statusDefault[0] = true;
                }
            }
        });
        paud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusPaud[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.VISIBLE);
                    statusPaud[0] = false;
                }else {
                    statusPaud[0] = true;
                }
            }
        });
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSd[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.VISIBLE);
                    statusSd[0] = false;
                }else {
                    statusSd[0] = true;
                }
            }
        });
        smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSmp[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.VISIBLE);
                    statusSmp[0] = false;
                }else {
                    statusSmp[0] = true;
                }
            }
        });
        sma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSma[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSmk.setVisibility(View.INVISIBLE);
                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.VISIBLE);
                    statusSma[0] = false;
                }else {
                    statusSma[0] = true;
                }
            }
        });
        smk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusSmk[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutSd.setVisibility(View.INVISIBLE);
                    linearLayoutSlb.setVisibility(View.INVISIBLE);
                    linearLayoutDefault.setVisibility(View.INVISIBLE);
                    linearLayoutPaud.setVisibility(View.INVISIBLE);
                    linearLayoutSmp.setVisibility(View.INVISIBLE);
                    linearLayoutSma.setVisibility(View.INVISIBLE);
                    linearLayoutSmk.setVisibility(View.VISIBLE);
                    statusSmk[0] = false;
                }else {
                    statusSmk[0] = true;
                }
            }
        });
        KelasSlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSlb[0] == true) {
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSlb.setVisibility(View.VISIBLE);
                    kelasSlb[0] = false;
                }else {
                    kelasSlb[0] = true;
                }
            }
        });
        KelasDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasDefault[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasDefault.setVisibility(View.VISIBLE);
                    kelasDefault[0] = false;
                }else {
                    kelasDefault[0] = true;
                }
            }
        });
        KelasPaud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud1.setVisibility(View.VISIBLE);
                    kelasPaud1[0] = false;
                }else {
                    kelasPaud1[0] = true;
                }
            }
        });
        KelasPaud2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud2.setVisibility(View.VISIBLE);
                    kelasPaud2[0] = false;
                }else {
                    kelasPaud2[0] = true;
                }
            }
        });
        KelasPaud3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasPaud3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasPaud3.setVisibility(View.VISIBLE);
                    kelasPaud3[0] = false;
                }else {
                    kelasPaud3[0] = true;
                }
            }
        });
        KelasSmpVII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpVII.setVisibility(View.VISIBLE);
                    kelasSmp1[0] = false;
                }else {
                    kelasSmp1[0] = true;
                }
            }
        });
        KelasSmpVIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpVIII.setVisibility(View.VISIBLE);
                    kelasSmp2[0] = false;
                }else {
                    kelasSmp2[0] = true;
                }
            }
        });
        KelasSmpIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmp3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmpIX.setVisibility(View.VISIBLE);
                    kelasSmp3[0] = false;
                }else {
                    kelasSmp3[0] = true;
                }
            }
        });
        KelasSmaX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaX.setVisibility(View.VISIBLE);
                    kelasSma1[0] = false;
                }else {
                    kelasSma1[0] = true;
                }
            }
        });
        KelasSmaXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaXI.setVisibility(View.VISIBLE);
                    kelasSma2[0] = false;
                }else {
                    kelasSma2[0] = true;
                }
            }
        });
        KelasSmaXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSma3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmaXII.setVisibility(View.VISIBLE);
                    kelasSma3[0] = false;
                }else {
                    kelasSma3[0] = true;
                }
            }
        });
        KelasSmkX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkX.setVisibility(View.VISIBLE);
                    kelasSmk1[0] = false;
                }else {
                    kelasSmk1[0] = true;
                }
            }
        });
        KelasSmkXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkXI.setVisibility(View.VISIBLE);
                    kelasSmk2[0] = false;
                }else {
                    kelasSmk2[0] = true;
                }
            }
        });
        KelasSmkXII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSmk3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSmkXII.setVisibility(View.VISIBLE);
                    kelasSmk3[0] = false;
                }else {
                    kelasSmk3[0] = true;
                }
            }
        });
        KelasSd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd1[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd1.setVisibility(View.VISIBLE);
                    kelasSd1[0] = false;
                }else {
                    kelasSd1[0] = true;
                }
            }
        });
        KelasSd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd2[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd2.setVisibility(View.VISIBLE);
                    kelasSd2[0] = false;
                }else {
                    kelasSd2[0] = true;
                }
            }
        });
        KelasSd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd3[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd3.setVisibility(View.VISIBLE);
                    kelasSd3[0] = false;
                }else {
                    kelasSd3[0] = true;
                }
            }
        });
        KelasSd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd4[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd4.setVisibility(View.VISIBLE);
                    kelasSd4[0] = false;
                }else {
                    kelasSd4[0] = true;
                }
            }
        });
        KelasSd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd5[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd6.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd5.setVisibility(View.VISIBLE);
                    kelasSd5[0] = false;
                }else {
                    kelasSd5[0] = true;
                }
            }
        });
        KelasSd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelasSd6[0] == true) {
                    linearLayoutKelasSlb.setVisibility(View.INVISIBLE);
                    linearLayoutKelasDefault.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasPaud3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd1.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd2.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd3.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd4.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSd5.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpVIII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmpIX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmaXII.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkX.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXI.setVisibility(View.INVISIBLE);
                    linearLayoutKelasSmkXII.setVisibility(View.INVISIBLE);

                    linearLayoutKelasSd6.setVisibility(View.VISIBLE);
                    kelasSd6[0] = false;
                }else {

                    kelasSd1[0] = true;
                }
            }
        });



    }
}
