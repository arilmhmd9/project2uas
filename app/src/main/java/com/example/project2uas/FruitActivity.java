package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import java.util.ArrayList;

public class FruitActivity extends AppCompatActivity {

    ArrayList<Fruit>allData= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        //getSupportActionBar().setTitle("Mengeja Nama Buah Dalam Bahasa Inggris");


        allData.add(new Fruit("Apple",R.drawable.apple,R.raw.anjing));
        allData.add(new Fruit("Orange",R.drawable.jeruk,R.raw.anjing));
        allData.add(new Fruit("Pinapple",R.drawable.pinapple,R.raw.anjing));
        allData.add(new Fruit("WaterMelon",R.drawable.semangka,R.raw.anjing));
        allData.add(new Fruit("Grape",R.drawable.anggur,R.raw.anjing));
        allData.add(new Fruit("Melon",R.drawable.melon,R.raw.anjing));
        allData.add(new Fruit("Mango",R.drawable.mango,R.raw.anjing));
        allData.add(new Fruit("Banana",R.drawable.banana,R.raw.anjing));
        allData.add(new Fruit("Coconut",R.drawable.coconut,R.raw.anjing));
        allData.add(new Fruit("Papaya",R.drawable.papaya,R.raw.anjing));


        ListView listView=(ListView) findViewById(R.id.listView);
        FruitAdapter adapter=new FruitAdapter(this,R.layout.item_row_list2,allData);
        listView.setAdapter(adapter);
    }
    public void PindahkeHome(View v) {
        Intent i = new Intent(FruitActivity.this, HomeActivity.class);
        startActivity(i);
        finish();
    }
}