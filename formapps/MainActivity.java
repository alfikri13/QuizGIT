package com.example.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.idInputnama);
        EditText inputEmail = (EditText) findViewById(R.id.id_Input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_Input_telepon);
        EditText inputPassword = (EditText) findViewById(R.id.id_Input_password);

        Button btnSave = (Button) findViewById(R.id.id_Input_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // kode untuk aksi klik button

                Log.d("--Nama--",inputName.getText().toString());
                Log.d("--Email--",inputEmail.getText().toString());
                Log.d("--Phone--",inputPhone.getText().toString());
                Log.d("--Password--",inputPassword.getText().toString());

            }
        });

    }
}