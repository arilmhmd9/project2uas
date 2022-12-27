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

        allData.add(new FruitAdapter("Anjing",R.drawable.anjing,R.raw.anjing));

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