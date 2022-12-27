package com.example.project2uas;

import static java.security.AccessController.getContext;

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

public class FruitAdapter extends ArrayAdapter <Fruit> {

    ArrayList<Fruit> allData;
    MediaPlayer media;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> object) {
        super(context, textViewResourceId, object);
        this.allData=(ArrayList<Fruit>) object;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View v=convertView;
        if (v==null){
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=li.inflate(R.layout.item_row_list2, null);
        }

        Fruit fruit = allData.get(position);
        if (fruit!=null){

            TextView textnama = (TextView)v.findViewById(R.id.item_nama2);
            ImageView imgfruit = (ImageView)v.findViewById(R.id.img_item_foto2);
            Button btnsuara = (Button)v.findViewById(R.id.btn_suara2);

            textnama.setText(fruit.nama);
            imgfruit.setImageResource(fruit.gambar);

            final Integer filesuara=fruit.suara;
            btnsuara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (media!=null&&media.isPlaying()){
                        media.stop();
                        media.release();

                    }
                    media=MediaPlayer.create(getContext(),filesuara);
                    media.setLooping(false);
                    media.start();
                }
            });
        }
        return v;
    }
}

