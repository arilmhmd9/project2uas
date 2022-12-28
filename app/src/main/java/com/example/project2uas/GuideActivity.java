package com.example.project2uas;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class GuideActivity extends AppCompatActivity {

    VideoView videoView;
    //deklarasi objek

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        //getSupportActionBar().setTitle("Tutorial");
        //getSupportActionBar().setSubtitle("Copyright ArilMhmd");

        videoView = (VideoView) findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.contoh));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoView.start();
        //memulai video
    }
    public void kembali(View v) {
        Intent i = new Intent(GuideActivity.this, GuideActivityAwal.class);
        startActivity(i);
        finish();
    }
}
