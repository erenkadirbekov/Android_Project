package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.usernameEditText);
        EditText password = findViewById(R.id.passwordEditText);

        Button btnSubmit = findViewById(R.id.buttonSubmit);
        Button btnRegister = findViewById(R.id.buttonRegister);
    }

    public void onClickRegister(View view) {
        Intent registerIntent = new Intent(this, RegisterActivity.class);

        startActivity(registerIntent);
    }


}
