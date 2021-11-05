package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        setTitle("Sign Up");
    }
    public void Accountcreated(View ac)
    {
        Snackbar.make(ac,"You have successfully created your account", Snackbar.LENGTH_SHORT).show();

    }
}