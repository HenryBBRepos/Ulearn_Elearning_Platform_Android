package com.example.ulearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void ToLogin(View view)
    {
        Intent intent = new Intent(CreateAccount.this, Login.class);
        startActivity(intent);

    }

    public void ToVerifyPhoneNumber(View view)
    {
        Intent intent = new Intent(CreateAccount.this, VerifyPhoneNumber.class);
        startActivity(intent);

    }

}
