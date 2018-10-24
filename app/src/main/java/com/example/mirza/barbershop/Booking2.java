package com.example.mirza.barbershop;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mirza on 5/9/2018.
 */

public class Booking2 extends ArrayAdapter<Booking1> {


    private Activity context;
    private List<Booking1>orderlist;

    public Booking2(Activity context, List<Booking1> orderlist){

        super(context, R.layout.listviewl, orderlist);
        this.context=context;
        this.orderlist=orderlist;

    }

    @NonNull
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {


        LayoutInflater layout= context.getLayoutInflater();

        View listview= layout.inflate(R.layout.listviewl, null, true);


        TextView txtv= (TextView) listview.findViewById(R.id.textv2);
        TextView txtv1= (TextView) listview.findViewById(R.id.textv3);
        TextView txtv2= (TextView) listview.findViewById(R.id.textv4);
        TextView txtv3= (TextView) listview.findViewById(R.id.textv5);

        Booking1 order1= orderlist.get(i);

        txtv.setText(order1.getName());
        txtv1.setText(order1.getPh());
        txtv2.setText(order1.getT());
        txtv3.setText(order1.getD());

        return listview;






    }
}


