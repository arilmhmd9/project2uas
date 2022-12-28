package com.example.project2uas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setTitle("Learning English");
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

    public void PindahkeSaranMasukan(View v) {
        Intent i = new Intent(MainActivity.this, SaranMasukanActivity.class);
        startActivity(i);
        finish();
    }
    public void PindahkeGuideActivity(View v) {
        Intent i = new Intent(MainActivity.this, GuideActivityAwal.class);
        startActivity(i);
        finish();
    }

    public void PindahkeGuideActivity2(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Putar Video Tutorial ?").setCancelable(false).setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent a = new Intent(MainActivity.this, GuideActivity.class);
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

    public void Keluar (View view){
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Keluar dari Aplikasi ?").setCancelable(false).
                setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        MainActivity.this.finish();
                    }
                }).
                setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                }).show();
    }
}