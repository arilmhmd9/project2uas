package com.example.project2uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class SaranMasukanActivity extends AppCompatActivity {

    SQLHelper dbHelper;
    private EditText ed_masukan;
    private EditText ed_nama;
    protected Cursor cursor;
    private int id=-1;
    protected ListAdapter adapter;
    protected ListView numberlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saran_masukan);
        //getSupportActionBar().setTitle("Kritik dan Saran");
        ed_masukan=(EditText) findViewById(R.id.editText_masukan);
        ed_nama=(EditText) findViewById(R.id.editText_name);
        numberlist=(ListView) findViewById(R.id.ListView01);
        dbHelper=new SQLHelper(this);
        numberlist.setSelected(true);
        numberlist.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SQLiteDatabase db = dbHelper.getReadableDatabase();
                cursor = db.rawQuery("SELECT * FROM data",null);
                cursor.moveToPosition(i);
                ed_masukan.setText(cursor.getString(1));
                ed_nama.setText(cursor.getString(2));
                id=cursor.getInt(0);

            }

        });
        view();
    }
    private void addData(String nomor,String nama) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        try{
            db.execSQL("INSERT INTO "+ SQLHelper.TABLE +"("+
                    SQLHelper.masukan+","+SQLHelper.name+")"+
                    " VALUES('"+nomor+"','"+nama+"')");
            ed_masukan.setText("");
            ed_nama.setText("");
        }
        catch(Exception e){
            ed_masukan.setText(e.toString());
        }
    }

    public void but_inClick(View v){
        if (ed_masukan.getText().length() == 0) {
            Toast.makeText(this, "JANGAN KOSONG YA!", Toast.LENGTH_LONG).show();
            return;
        }

        addData(ed_masukan.getText().toString(),ed_nama.getText().toString());
        view();
        Toast.makeText(getBaseContext(), "Data Telah Disimpan", Toast.LENGTH_SHORT).show();
    }

    public void but_DelClick(View v){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        try{
            if(id!=-1){
                db.execSQL("DELETE FROM "+ SQLHelper.TABLE +" where nomor='" +
                        ed_masukan.getText().toString()+ "'");
                view();
                Toast.makeText(getBaseContext(), "Data Telah Dihapus", Toast.LENGTH_SHORT).show();
            }
            ed_masukan.setText("");
            ed_nama.setText("");
        }
        catch(Exception e){
            ed_masukan.setText(e.toString());
        }
    }

    public void but_EditClick(View v){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        try{
            if(id!=-1){
                db.execSQL("UPDATE data set nomor='"+
                        ed_masukan.getText().toString()+"',nama='"+ed_nama.getText().toString()+
                        "' where _id="+id);
                view();
                Toast.makeText(getBaseContext(), "Data Telah Di ubah", Toast.LENGTH_SHORT).show();
            }
            ed_masukan.setText("");
            ed_nama.setText("");
        }
        catch(Exception e){
            ed_nama.setText(e.toString());
        }
    }

    private void view(){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        try{
            cursor = db.rawQuery("SELECT * FROM data",null);
            adapter = new SimpleCursorAdapter(this, R.layout.view2, cursor,
                    new String[] {"nomor","nama"}, new int[] {R.id.masukan,R.id.name});

            numberlist.setAdapter(adapter);}
        catch(Exception e)
        {
            ed_masukan.setText(e.toString());
        }
    }

    public void kembali(View v) {
        Intent i = new Intent(SaranMasukanActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}