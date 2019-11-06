package com.lgastelu.examen.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lgastelu.examen.R;

public class LoginActivity extends AppCompatActivity {

    private Button registerBtn;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn=(Button)findViewById(R.id.btn_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameText=(EditText)findViewById(R.id.txt_username);
                EditText passwordText=(EditText)findViewById(R.id.txt_password);

            }
        });

        registerBtn =(Button)findViewById(R.id.btn_register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRegisterForm();
            }
        });

    }

    private void callRegisterForm(){
        startActivityForResult(new Intent(this, RegisterUserActivity.class), 100);
    }
}
