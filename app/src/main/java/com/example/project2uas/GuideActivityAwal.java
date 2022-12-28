package com.example.project2uas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuideActivityAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_awal);
    }

    public void PindahkeGuideActivity2(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Putar Video Tutorial ?").setCancelable(false).setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent a = new Intent(GuideActivityAwal.this, GuideActivity.class);
                        startActivity(a);
                        finish();
                    }
                }).
                setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                }).show();
    }

    public void kembali(View v) {
        Intent i = new Intent(GuideActivityAwal.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}