package com.example.bismillah.ui.akun;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bismillah.LoginActivity;
import com.example.bismillah.R;
import com.example.bismillah.RegistrasiActivity;

public class AkunFragment extends Fragment {
    Button  login,regis;

    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View v = inflater.inflate(R.layout.fragment_akun, container, false);

        login = v.findViewById(R.id.Login);
        regis = v.findViewById(R.id.Registrasi);
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegistrasiActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });


        return v;

    }


}

