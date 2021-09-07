package com.example.ulearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


    public void ToMaths(View view)
    {
        Intent intent = new Intent(Learn.this, SubjectsPerformanceAndProgress.class);
        startActivity(intent);

    }

    public void ToSettings(View view)
    {
        Intent intent = new Intent(Learn.this, Settings.class);
        startActivity(intent);

    }
}
