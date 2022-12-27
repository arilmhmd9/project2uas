package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PindahkeHomeActivity(View v) {
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);
        finish();
    }

    public void PindahkeDaftarAnggota(View v) {
        Intent i = new Intent(MainActivity.this, DaftarAnggotaActivity.class);
        startActivity(i);
        finish();
    }
}