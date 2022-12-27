package com.example.project2uas;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AnggotaAdapter extends ArrayAdapter <Anggota> {

    ArrayList<Anggota> allData;

    public AnggotaAdapter(Context context, int textViewResourceId, List<Anggota> object) {
        super(context, textViewResourceId, object);
        this.allData=(ArrayList<Anggota>) object;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View v=convertView;
        if (v==null){
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=li.inflate(R.layout.item_row_list, null);
        }

        Anggota anggota = allData.get(position);
        if (anggota!=null){
            TextView textNama = (TextView)v.findViewById(R.id.item_nama);
            TextView textNpm = (TextView)v.findViewById(R.id.txt_npm);
            ImageView imgAnggota = (ImageView)v.findViewById(R.id.img_item_foto);


            textNama.setText(anggota.nama);
            imgAnggota.setImageResource(anggota.gambar);
            textNpm.setText(anggota.npm);

        }
        return v;
    }
}
