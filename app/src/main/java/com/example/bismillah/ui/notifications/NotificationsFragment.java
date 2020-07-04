package com.example.bismillah.ui.notifications;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.bismillah.riwayat_konten;

import com.example.bismillah.R;

public class NotificationsFragment extends Fragment {
    Button riwayat_kontent, riwayat_aktifitas,main,main1,main2,main3,main4,main5;
    TextView v_konten,v_aktifitas;
    LinearLayout konten_riwayat, konten_aktifitas;



    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);
        riwayat_kontent = v.findViewById(R.id.button_riwayat);
        riwayat_aktifitas = v.findViewById(R.id.button_riwayat1);
        v_konten = v.findViewById(R.id.textView_konten);
        v_aktifitas = v.findViewById(R.id.textView_konten);
        konten_riwayat = v.findViewById(R.id.klik_riwayat_konten);
        konten_aktifitas = v.findViewById(R.id.klik_riwayat_aktifitas);
        final boolean status_riwayat_konten[] = {true};
        final boolean status_riwayat_aktifitas[] = {true};

        main = v.findViewById(R.id.main);
        main1 = v.findViewById(R.id.main1);
        main2 = v.findViewById(R.id.main2);
        main3 = v.findViewById(R.id.main3);
        main4 = v.findViewById(R.id.main4);
        main5 = v.findViewById(R.id.main5);


        riwayat_kontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_konten.setText("Riwayat Akses Konten Anda");
                if (status_riwayat_konten[0] == true) {
                    konten_riwayat.setVisibility(View.VISIBLE);
                    konten_aktifitas.setVisibility(View.INVISIBLE);
                    status_riwayat_konten [0] = false;
                }else {
                    status_riwayat_konten [0] = true;
                }

            }
        });
        riwayat_aktifitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_aktifitas.setText("Riwayat Akifitas Anda");
                if (status_riwayat_aktifitas[0] == true) {
                    konten_riwayat.setVisibility(View.INVISIBLE);
                    konten_aktifitas.setVisibility(View.VISIBLE);
                    status_riwayat_aktifitas [0] = false;
                }else {
                    status_riwayat_aktifitas [0] = true;
                }
            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });
        main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });
        main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });
        main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });
        main4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });
        main5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),riwayat_konten.class );
                startActivity(intent);

            }
        });

        return v;
    }

}
