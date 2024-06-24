package com.example.team5app;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username, password;
    Button btnlogin;
    String keynama, keypass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.button4);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = findViewById(R.id.inputUsername);
                password = findViewById(R.id.inputPassword);
                btnlogin = findViewById(R.id.button4);

                keynama = username.getText().toString();
                keypass = password.getText().toString();

                //username diisi dengan pengguna dan password dengan masuk
                if (keynama.equals("pengguna") && keypass.equals("masuk")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),
                            "LOGIN BERHASIL", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, Pindah.class);
                    startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage
                            ("Username atau password salah").setNegativeButton
                            ("ulangi", null).create().show();

                    username.setText("");
                    password.setText("");
                }

            }
        });
    }
}