package com.example.ulearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Chapters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapters);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void ToTests(View view)
    {
        Intent intent = new Intent(Chapters.this, Tests.class);
        startActivity(intent);

    }

    public void ToSubjectTopic(View view)
    {
        Intent intent = new Intent(Chapters.this, SubjectTopics.class);
        startActivity(intent);

    }
}
