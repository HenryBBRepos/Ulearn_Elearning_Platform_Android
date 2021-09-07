package com.example.ulearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void ToLearn(View view)
    {
        Intent intent = new Intent(Login.this, Learn.class);
        startActivity(intent);

    }


    public void ToResetPassword(View view)
    {
        Intent intent = new Intent(Login.this, ForgotPassword.class);
        startActivity(intent);

    }


    public void ToCreateAccount(View view)
    {
        Intent intent = new Intent(Login.this, CreateAccount.class);
        startActivity(intent);

    }

}
