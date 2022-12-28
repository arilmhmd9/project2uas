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

        allData.add(new Anggota("Ana Sopia Mariana", "432007006190223",R.drawable.aana));
        allData.add(new Anggota("Ayuni Dita Herliani","432007006190208",R.drawable.ayu));
        allData.add(new Anggota("Elsa Alyanti", "432007006190082",R.drawable.elsa));
        allData.add(new Anggota("Hilman Nurmuhammad Iskandar", "432007006190272",R.drawable.hilman1));
        allData.add(new Anggota("Muhamad Syahril Suhandi","432007006190125",R.drawable.aril1));
        allData.add(new Anggota("Taopik Dimyati", "432007006190218",R.drawable.opik));
        allData.add(new Anggota("Wiranti", "432007006190176",R.drawable.wira));


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