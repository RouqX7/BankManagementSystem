package com.example.bankmanagementsystem.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

import com.example.bankmanagementsystem.R;

import com.github.javafaker.Faker;


public class ApplicationFormP3 extends AppCompatActivity {
    CheckBox savingsAccount,fixedAccount,currentAccount,recurringDepositAccount, atmCard,mobileBanking,internetBanking,emailAlerts,
    chequeBook,eStatement, declaration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form_p3);

        savingsAccount = findViewById(R.id.checkbSavingsAcc);
        fixedAccount = findViewById(R.id.checkbFixedAcc);
        currentAccount = findViewById(R.id.checkbCurrentAcc);
        recurringDepositAccount = findViewById(R.id.checkbRecurringDepositAcc);

    }
}