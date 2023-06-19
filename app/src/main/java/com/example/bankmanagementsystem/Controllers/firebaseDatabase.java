package com.example.bankmanagementsystem.Controllers;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.example.bankmanagementsystem.Models.Customer;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class firebaseDatabase {
    private FirebaseFirestore db;

    public firebaseDatabase(){
        db = FirebaseFirestore.getInstance();
    }
    CollectionReference customerRef = db.collection("Customer");

    public void createCustomer(Customer customer){

        db.collection("customers")
                        .add(customer)
                        .addOnSuccessListener(documentReference -> {
                         String customerId = documentReference.getId();
                         Log.d(TAG,"Customer added with ID: " + customerId);
                        })
                        .addOnFailureListener(e -> {
                         Log.e(TAG,"Error adding customer",e);
                        });
           }

   }

