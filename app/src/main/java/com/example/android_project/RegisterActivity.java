package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.registerButton);
    }

    public void onClickLogin(View view) {
        Intent loginIntent = new Intent(this, LoginActivity.class);

        startActivity(loginIntent);
    }

    public void onClickRegister(View view) {
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("eyeTrainer.db", MODE_PRIVATE, null);

    }
}
