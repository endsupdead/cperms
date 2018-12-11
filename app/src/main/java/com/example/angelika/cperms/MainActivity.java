package com.example.angelika.cperms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.btnlogin);
        username=(EditText)findViewById(R.id.txtuser);
        password=(EditText)findViewById(R.id.txtpass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();

            }
        });

    }
    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("user")&& pass.equals("user"))
        {
            Intent intent=new Intent (this, Student.class);
            startActivity (intent);
            Toast.makeText(this,"Welcome User",Toast.LENGTH_LONG).show();
        }
        if(user.equals("aaa")&& pass.equals("aaa"))
        {
            Intent intent=new Intent (this, Admin.class);
            startActivity (intent);
            Toast.makeText(this,"Welcome Admin",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"username and password incorrect",Toast.LENGTH_LONG).show();
        }
    }
}
