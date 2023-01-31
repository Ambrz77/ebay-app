package com.example.alireza.onlineshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static int X = 0, Y = 0;
    static newAdmin[] admin = new newAdmin[100];
    static newUser[] user = new newUser[100];
    static NewItem[] items = new NewItem[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button SignInbtn = (Button) findViewById(R.id.SignIn);
        Button SignUpbtn = (Button) findViewById(R.id.SignUp);
        final TextView error = (TextView) findViewById(R.id.Error);


        admin[0] = new newAdmin("admin", "admin", "Alireza", "Barzi", 20);
        error.setText(" ");

        SignUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewIntent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(NewIntent);
            }
        });
        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText UserText_SignIn = (EditText) findViewById(R.id.UsernameTxt_SignIn);
                EditText PassText_SignIn = (EditText) findViewById(R.id.PasswordTxt_SignIn);
                boolean UserMode = false;
                boolean AdminMode = false;
                int i = 0;
                if (UserText_SignIn.getText().toString().equals(admin[0].getUsername()) && PassText_SignIn.getText().toString().equals(admin[0].getPassword())) {
                    Intent NewIntent = new Intent(getApplicationContext(), AdminActivity.class);
                    startActivity(NewIntent);
                    error.setText(" ");
                    AdminMode = true;
                }
                /*Toast toast=Toast.makeText(getApplicationContext(),"my toast is " + user[0].getUsername() + " : " + user[0].getPassword(),Toast.LENGTH_SHORT);
                toast.setMargin(50,50);
                toast.show();*/
                if (!AdminMode)
                    for (i = 0; i < X; i++) {
                        if (UserText_SignIn.getText().toString().equals(user[i].getUsername()) && PassText_SignIn.getText().toString().equals(user[i].getPassword())) {
                            Intent NewIntent = new Intent(getApplicationContext(), UserActivity.class);
                            startActivity(NewIntent);
                            error.setText(" ");
                            UserMode = true;
                            break;
                        }
                    }
                if (!UserMode && !AdminMode)
                    error.setText("Wrong Username or Password!");


            }
        });

    }
}
