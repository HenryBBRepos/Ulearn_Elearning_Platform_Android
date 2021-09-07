package com.example.ulearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void ToBooks(View view)
    {
        Intent intent = new Intent(Videos.this, Ebook.class);
        startActivity(intent);

    }
    public void ToPurchase(View view)
    {
        Intent intent = new Intent(Videos.this, PurchaseDetails.class);
        startActivity(intent);

    }
}
