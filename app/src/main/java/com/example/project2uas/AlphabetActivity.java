package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import java.util.ArrayList;

public class AlphabetActivity extends AppCompatActivity {

    ArrayList<Alphabet> allData= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        //getSupportActionBar().setTitle("Mengeja Huruf Dalam Bahasa Inggris");

        allData.add(new Alphabet("A",R.drawable.aa,R.raw.anjing));
        allData.add(new Alphabet("B",R.drawable.bb,R.raw.anjing));
        allData.add(new Alphabet("C",R.drawable.cc,R.raw.anjing));
        allData.add(new Alphabet("D",R.drawable.dd,R.raw.anjing));
        allData.add(new Alphabet("E",R.drawable.ee,R.raw.anjing));
        allData.add(new Alphabet("F",R.drawable.ff,R.raw.anjing));
        allData.add(new Alphabet("G",R.drawable.gg,R.raw.anjing));
        allData.add(new Alphabet("H",R.drawable.hh,R.raw.anjing));
        allData.add(new Alphabet("I",R.drawable.ii,R.raw.anjing));
        allData.add(new Alphabet("J",R.drawable.jj,R.raw.anjing));
        allData.add(new Alphabet("K",R.drawable.kk,R.raw.anjing));
        allData.add(new Alphabet("L",R.drawable.ll,R.raw.anjing));
        allData.add(new Alphabet("M",R.drawable.mm,R.raw.anjing));
        allData.add(new Alphabet("N",R.drawable.nn,R.raw.anjing));
        allData.add(new Alphabet("O",R.drawable.oo,R.raw.anjing));
        allData.add(new Alphabet("P",R.drawable.pp,R.raw.anjing));
        allData.add(new Alphabet("Q",R.drawable.qq,R.raw.anjing));
        allData.add(new Alphabet("R",R.drawable.rr,R.raw.anjing));
        allData.add(new Alphabet("S",R.drawable.ss,R.raw.anjing));
        allData.add(new Alphabet("T",R.drawable.tt,R.raw.anjing));
        allData.add(new Alphabet("U",R.drawable.uu,R.raw.anjing));
        allData.add(new Alphabet("V",R.drawable.vv,R.raw.anjing));
        allData.add(new Alphabet("W",R.drawable.ww,R.raw.anjing));
        allData.add(new Alphabet("X",R.drawable.xx,R.raw.anjing));
        allData.add(new Alphabet("Y",R.drawable.yy,R.raw.anjing));
        allData.add(new Alphabet("Z",R.drawable.zz,R.raw.anjing));

        ListView listView=(ListView) findViewById(R.id.listView);
        AlphabetAdapter adapter=new AlphabetAdapter(this,R.layout.item_row_list3,allData);
        listView.setAdapter(adapter);
    }
    public void PindahkeHome(View v) {
        Intent i = new Intent(AlphabetActivity.this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}