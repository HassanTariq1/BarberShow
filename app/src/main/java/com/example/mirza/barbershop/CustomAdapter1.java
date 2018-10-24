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

public class CustomAdapter1 extends BaseAdapter {

    Context context;
    int [] beardImages;
            String[] beardNames;
    LayoutInflater xmlInf = null;


    public CustomAdapter1(Context applicationContext, int[] beardImages, String[] beardNames) {

        this.context = applicationContext;
        this.beardNames = beardNames;
        this.beardImages =beardImages;
        xmlInf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return beardNames.length;
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

        View hairitem= xmlInf.inflate(R.layout.beard_row, null);

        ImageView img= (ImageView) hairitem.findViewById(R.id.hr1);

        TextView txt= (TextView) hairitem.findViewById(R.id.s1);


        txt.setText(beardNames[position]);
        img.setImageResource(beardImages[position]);

        return  hairitem;
    }
}
