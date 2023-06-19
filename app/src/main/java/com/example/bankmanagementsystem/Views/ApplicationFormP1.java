package com.example.bankmanagementsystem.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.bankmanagementsystem.Controllers.firebaseDatabase;
import com.example.bankmanagementsystem.Models.Customer;
import com.example.bankmanagementsystem.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ApplicationFormP1 extends AppCompatActivity {

    EditText dateOfBirthEditText, nameEditText,fatherNameText, emailAddressEditText, addressEditText, cityEditText, pinCodeEditText;
    MaterialButton nextBtn;
    CheckBox maleCheckBox, femaleCheckBox, marriedCheckBox,singleCheckBox,otherCheckBox;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    firebaseDatabase db = new firebaseDatabase();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appplication_form_p1);
        nextBtn = findViewById(R.id.nextBtn);

        DatabaseReference customersRef = database.getReference().child("Customer");
        nameEditText = findViewById(R.id.editTextTextPersonName);
        fatherNameText = findViewById(R.id.fatherNameText);
        dateOfBirthEditText = findViewById(R.id.dobText);
        maleCheckBox = findViewById(R.id.maleCheckBox);
        femaleCheckBox = findViewById(R.id.femaleCheckBox);
        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        marriedCheckBox = findViewById(R.id.yesSeniorCheckBox);
        singleCheckBox = findViewById(R.id.noSeniorCheckBox);
        otherCheckBox = findViewById(R.id.otherCheckBox);
        addressEditText = findViewById(R.id.panNumber);
        cityEditText = findViewById(R.id.cityText);
        pinCodeEditText = findViewById(R.id.pinCodeText);


        nextBtn.setOnClickListener((v) -> startActivity(new Intent(ApplicationFormP1.this,ApplicationFormP2.class)) );
        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = nameEditText.getText().toString();
                String fathersName = fatherNameText.getText().toString();
                String dob = dateOfBirthEditText.getText().toString();
                String male = maleCheckBox.getText().toString();
                String female = femaleCheckBox.getText().toString();
                String emailAddress = emailAddressEditText.getText().toString();
                String married = marriedCheckBox.getText().toString();
                String single = singleCheckBox.getText().toString();
                String other = otherCheckBox.getText().toString();
                String address = addressEditText.getText().toString();
                String city = cityEditText.getText().toString();
                String pinCode = pinCodeEditText.getText().toString();

                Customer customer = new Customer();
                customer.setName(name);
                customer.setFathersName(fathersName);
                customer.setDob(dob);
                customer.setMale(male);
                customer.setFemale(female);
                customer.setEmailAddress(emailAddress);
                customer.setMarried(married);
                customer.setSingle(single);
                customer.setOther(other);
                customer.setAddress(address);
                customer.setCity(city);
                customer.setPinCode(pinCode);
            }
        });
        dateOfBirthEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        }
        private void showDatePickerDialog() {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    // Update the EditText with the selected date
                    String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                    dateOfBirthEditText.setText(selectedDate);
                }
            }, 2000, 0, 1); // Set the initial date as desired

            datePickerDialog.show();
    }
}