package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
public class DaftarAnggotaActivity extends AppCompatActivity {

    ArrayList<Anggota>allData= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_anggota);

        allData.add(new Anggota("Muhamad Syahril Suhandi","432007006190125",R.drawable.aril1));

        ListView listView=(ListView) findViewById(R.id.listView);
        AnggotaAdapter adapter=new AnggotaAdapter(this,R.layout.item_row_list,allData);
        listView.setAdapter(adapter);
    }
    public void PindahkeHome(View v) {
        Intent i = new Intent(DaftarAnggotaActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}