package com.lgastelu.examen.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.lgastelu.examen.R;
import com.lgastelu.examen.repositories.UserRepository;

public class RegisterUserActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText usernameInput;
    private EditText emailInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        nameInput =(EditText)findViewById(R.id.text_name);
        usernameInput =(EditText)findViewById(R.id.text_username);
        emailInput =(EditText)findViewById(R.id.text_email);
        passwordInput =(EditText)findViewById(R.id.text_password);

    }

    public void callRegister(View view){
        String name=nameInput.getText().toString();
        String username=usernameInput.getText().toString();
        String email=emailInput.getText().toString();
        String password=passwordInput.getText().toString();

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "You must complete these fields", Toast.LENGTH_SHORT).show();
            return;
        }

        UserRepository.create(name, username, email, password);

        finish();

    }
}
