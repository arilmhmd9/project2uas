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

public class AlphabetAdapter extends ArrayAdapter <Alphabet>{
    ArrayList<Alphabet> allData;
    MediaPlayer media;

    public AlphabetAdapter(Context context, int textViewResourceId, List<Alphabet> object) {
        super(context, textViewResourceId, object);
        this.allData=(ArrayList<Alphabet>) object;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View v=convertView;
        if (v==null){
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=li.inflate(R.layout.item_row_list3, null);
        }

        Alphabet alphabet = allData.get(position);
        if (alphabet!=null){

            TextView texthuruf = (TextView)v.findViewById(R.id.item_nama3);
            ImageView imgAlphabet = (ImageView)v.findViewById(R.id.img_item_foto3);
            Button btnsuara = (Button)v.findViewById(R.id.btn_suara3);

            texthuruf.setText(alphabet.huruf);
            imgAlphabet.setImageResource(alphabet.gambar);

            final Integer filesuara=alphabet.suara;
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

