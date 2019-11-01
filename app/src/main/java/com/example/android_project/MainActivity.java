package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        Intent loginIntent = new Intent(this, LoginActivity.class);
        Intent registerIntent = new Intent(this, RegisterActivity.class);
        switch (view.getId()) {
            case R.id.loginButton:
                startActivity(loginIntent);
                break;
            default:
                startActivity(registerIntent);
                break;
        }
    }
}
