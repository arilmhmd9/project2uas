package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void PindahkeMainActivity(View v) {
        Intent i = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
    public void PindahkeAlphabet(View v) {
        Intent i = new Intent(HomeActivity.this, AlphabetActivity.class);
        startActivity(i);
        finish();
    }
    public void PindahkeFruit(View v) {
        Intent i = new Intent(HomeActivity.this, FruitActivity.class);
        startActivity(i);
        finish();
    }
}