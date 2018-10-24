package com.example.mirza.barbershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mirza on 5/5/2018.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    int [] hairImages;
            String[] hairNames;
    LayoutInflater xmlInf = null;


    public CustomAdapter(Context applicationContext, int[] hairImages, String[] hairNames) {

        this.context = applicationContext;
        this.hairNames = hairNames;
        this.hairImages = hairImages;
        xmlInf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return hairNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View hairitem= xmlInf.inflate(R.layout.hair_row, null);

        ImageView img= (ImageView) hairitem.findViewById(R.id.hr1);

        TextView txt= (TextView) hairitem.findViewById(R.id.s1);


        txt.setText(hairNames[position]);
        img.setImageResource(hairImages[position]);

        return  hairitem;
    }
}
