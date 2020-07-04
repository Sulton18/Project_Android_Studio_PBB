package com.example.bismillah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrasiActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private EditText ulangiPassword;
    private View progresView;
    private FirebaseAuth firebaseAuth;
    Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        progresView = findViewById(R.id.login_progress);
        regis = findViewById(R.id.regis);
        firebaseAuth = FirebaseAuth.getInstance();
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String ulangiPass = ulangiPassword.getText().toString().trim();
                if (TextUtils.isEmpty(user)){
                    Toast.makeText(getApplicationContext(),"masukka user",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(pass)){
                    Toast.makeText(getApplicationContext(),"masukkan password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(ulangiPass)){
                    Toast.makeText(getApplicationContext(),"masukkan confir password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pass.length()<6){
                    Toast.makeText(getApplicationContext(),"password too short",Toast.LENGTH_SHORT).show();
                }
                progresView.setVisibility(View.VISIBLE);
                if (pass.equals(ulangiPass)){
                    Toast.makeText(getApplicationContext(),"password tidak sama",Toast.LENGTH_SHORT).show();
                }
                firebaseAuth.createUserWithEmailAndPassword(user, pass)
                        .addOnCompleteListener(RegistrasiActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progresView.setVisibility(View.VISIBLE);
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                                    Toast.makeText(getApplicationContext(),"BERHASIL",Toast.LENGTH_SHORT).show();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(getApplicationContext(),"gagal",Toast.LENGTH_SHORT).show();
                                }

                                // ...
                            }
                        });


            }
        });


    }
}
