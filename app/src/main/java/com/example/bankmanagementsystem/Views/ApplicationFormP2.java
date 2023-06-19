package com.example.bankmanagementsystem.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.bankmanagementsystem.Models.Customer;
import com.example.bankmanagementsystem.R;
import com.google.android.material.button.MaterialButton;

public class ApplicationFormP2 extends AppCompatActivity {
    Spinner religionSpinner, categorySpinner, incomeSpinner, eqSpinner, occupationSpinner;
    CheckBox yesSeniorCheckB,noSeniorCheckB, existingYesCheckB,existingNoCheckB;
    EditText panNumber;

    MaterialButton nextBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form_p2);
         religionSpinner = findViewById(R.id.religionSpinner);
         categorySpinner = findViewById(R.id.categorySpinner);
         incomeSpinner = findViewById(R.id.incomeSpinner);
         eqSpinner = findViewById(R.id.eqSpinner);
         occupationSpinner = findViewById(R.id.emailAddressEditText);
         yesSeniorCheckB = findViewById(R.id.yesSeniorCheckBox);
         noSeniorCheckB = findViewById(R.id.noSeniorCheckBox);
         panNumber = findViewById(R.id.panNumber);
         existingYesCheckB = findViewById(R.id.yesCheck);
         existingNoCheckB = findViewById(R.id.noCheckExistingAcc);
         nextBtn = findViewById(R.id.nextBtn);

         nextBtn.setOnClickListener( (v) -> startActivity(new Intent(ApplicationFormP2.this,ApplicationFormP3.class)));
         nextBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String religion = religionSpinner.getSelectedItem().toString();
                 String category = categorySpinner.getSelectedItem().toString();
                 String income = incomeSpinner.getSelectedItem().toString();
                 String educationQ = eqSpinner.getSelectedItem().toString();
                 String occupation = occupationSpinner.getSelectedItem().toString();
                 String isSeniorCitizen = yesSeniorCheckB.getText().toString();
                 String isNotSeniorCitizen = noSeniorCheckB.getText().toString();
                 //String panNumber = panNu;
                 String existingAccountYes = existingYesCheckB.getText().toString();
                 String existingAccountNo = existingNoCheckB.getText().toString();

                 Customer customer = new Customer();
                 customer.setReligion(religion);
                 customer.setCategory(category);
                 customer.setIncome(income);
                 customer.setEducationQual(educationQ);
                 customer.setOccupation(occupation);
                 customer.setSeniorYes(isSeniorCitizen);
                 customer.setSeniorNo(isNotSeniorCitizen);
                 customer.setExistingYes(existingAccountYes);
                 customer.setExistingNo(existingAccountNo);
             }
         });

         String[] religionItems = getResources().getStringArray(R.array.Religion);
         String[] categoryItems = getResources().getStringArray(R.array.Category);
         String[] incomeItems = getResources().getStringArray(R.array.Income);
         String[] educationQItems = getResources().getStringArray(R.array.EducationalQualification);
         String[] occupationItem = getResources().getStringArray(R.array.Occupation);



        ArrayAdapter<String> religionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, religionItems);
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categoryItems);
        ArrayAdapter<String> incomeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, incomeItems);
        ArrayAdapter<String> educationQAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, educationQItems);
        ArrayAdapter<String> occupationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, occupationItem);


        religionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        incomeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        educationQAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        occupationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        religionSpinner.setAdapter(religionAdapter);
        categorySpinner.setAdapter(categoryAdapter);
        incomeSpinner.setAdapter(incomeAdapter);
        eqSpinner.setAdapter(educationQAdapter);
        occupationSpinner.setAdapter(occupationAdapter);









    }



}