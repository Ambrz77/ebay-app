package com.example.alireza.onlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminActivity extends AppCompatActivity {
    FoodItem[] food = new FoodItem[30];
    ElectronicalItem[] Electronical = new ElectronicalItem[30];
    SensitiveItem[] Sensitive = new SensitiveItem[30];
    OtherItems[] Other = new OtherItems[30];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Button SignOutBtn = (Button) findViewById(R.id.SignOut);
        Button PreviousBtn = (Button) findViewById(R.id.Previous);
        Button NextBtn = (Button) findViewById(R.id.Next);
        Button MinusBtn = (Button) findViewById(R.id.Minus);
        Button PlusBtn = (Button) findViewById(R.id.Plus);
        Button AddBtn = (Button) findViewById(R.id.AddProduct);
        TextView Welcome = (TextView) findViewById(R.id.textView);
        Welcome.setText("Welcome back to the store " + MainActivity.admin[0].getName() + " " + MainActivity.admin[0].getFamilyName() + "! :)");
        SignOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(NewIntent);
            }
        });

    }
}
