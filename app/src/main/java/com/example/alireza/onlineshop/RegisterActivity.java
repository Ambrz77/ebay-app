package com.example.alireza.onlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.alireza.onlineshop.MainActivity.X;
import static com.example.alireza.onlineshop.MainActivity.user;


public class RegisterActivity extends AppCompatActivity {
    //newUser[] user = MainActivity.user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button RegisterBtn = (Button) findViewById(R.id.Register);


        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView error = (TextView) findViewById(R.id.Error);
                error.setText("");
                EditText UserText_SignUp = (EditText) findViewById(R.id.UsernameTxt_SignUp);
                EditText PassText_SignUp = (EditText) findViewById(R.id.PasswordTxt_SignUp);
                if (UserText_SignUp.getText().toString().equals("") || PassText_SignUp.getText().toString().equals(""))
                    error.setText("Enter the required fields!");
                else {
                    EditText NameText_SignUp = (EditText) findViewById(R.id.NameTxt_SignUp);
                    EditText FamilyNameText_SignUp = (EditText) findViewById(R.id.FamilyNameTxt_SignUp);
                    EditText AgeText_SignUp = (EditText) findViewById(R.id.AgeTxt_SignUp);
                    user[X] = new newUser(UserText_SignUp.getText().toString(), PassText_SignUp.getText().toString(), NameText_SignUp.getText().toString(), FamilyNameText_SignUp.getText().toString(), Integer.parseInt(AgeText_SignUp.getText().toString()));
                    X++;
 /*                   Toast toast=Toast.makeText(getApplicationContext(),user[0].getName() + " : " + user[0].getPassword(),Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();*/
                    Intent NewIntent = new Intent(getApplicationContext(), UserActivity.class);
                    startActivity(NewIntent);
                    error.setText("");
                }
            }
        });
    }
}
