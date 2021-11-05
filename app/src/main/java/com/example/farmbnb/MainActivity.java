package com.example.farmbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   /* public boolean checkIfFieldsAreCorrect()
    {
        EditText pnme= findViewById(R.id.PersonName);
        String pname= pnme.getText().toString();
        EditText psd= findViewById(R.id.PersonPassword);
        String passwd= psd.getText().toString();
      //  EditText agee= findViewById(R.id.age);
      //  String personAge= agee.getText().toString();
       // int pAge=Integer.parseInt(personAge);


        if(!pname.equalsIgnoreCase("admin"))
        {

            Snackbar.make(pnme,"Username field is incorrect", Snackbar.LENGTH_SHORT)
                    .show();
            return false;
        }

        if(!passwd.equals("fx65dg."))
        {

            Snackbar.make(psd,"Password field is incorrect", Snackbar.LENGTH_SHORT)
                    .show();
            return false;
        }
        if(pAge<18)
        {

            Snackbar.make(agee,"You have to be 18 or older", Snackbar.LENGTH_SHORT)
                    .show();
            return false;
        }


       return true;


  */

    public void signUp(View signup)
    {
       // if(checkIfFieldsAreCorrect()) {
        //}


           Intent intent= new Intent(this, SignUp.class);
            startActivity(intent);





    }

}