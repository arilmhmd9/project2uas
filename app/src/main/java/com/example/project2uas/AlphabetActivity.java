package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
    }
    public void PindahkeHome(View v) {
        Intent i = new Intent(AlphabetActivity.this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}