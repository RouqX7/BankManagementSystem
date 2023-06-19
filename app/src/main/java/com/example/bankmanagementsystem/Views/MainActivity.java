package com.example.bankmanagementsystem.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.bankmanagementsystem.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText cardNoText, pinText;
    MaterialButton signInBtn,clearBtn,signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardNoText = findViewById(R.id.cardSignIn);
        pinText = findViewById(R.id.pinSignIn);
        signInBtn = findViewById(R.id.signInBtn);
        clearBtn = findViewById(R.id.clearBtn);
        signUpBtn = findViewById(R.id.signupBtn);

        signUpBtn.setOnClickListener((v) -> startActivity(new Intent(MainActivity.this,ApplicationFormP1.class)));

    }
}