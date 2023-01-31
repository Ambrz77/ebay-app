package com.example.alireza.onlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Button SignOutBtn = (Button) findViewById(R.id.SignOut);
        Button PreviousBtn = (Button) findViewById(R.id.Previous);
        Button NextBtn = (Button) findViewById(R.id.Next);
        Button MinusBtn = (Button) findViewById(R.id.Minus);
        Button PlusBtn = (Button) findViewById(R.id.Plus);
        TextView Welcome = (TextView) findViewById(R.id.textView);
        Welcome.setText("Welcome to the store " + MainActivity.user[0].getName() + " " + MainActivity.user[0].getFamilyName() + "! :)");
        SignOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(NewIntent);
            }
        });
    }
}
