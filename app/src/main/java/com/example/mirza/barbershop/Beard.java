package com.example.mirza.barbershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Beard extends AppCompatActivity {

    ListView list;
    int [] beardImages=new int[] {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13};
    String [] beardNames= new String[]{"bd(1)","bd(2)","bd(3)","bd(4)","bd(5)(5a)","bd(6)","bd(7)","bd(8)","bd(9)","bd(10)","bd(11)","bd(12)","bd(13)"};
    CustomAdapter1 ca1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beard);

        list=(ListView) findViewById(R.id.Lv);
        ca1= new CustomAdapter1(getApplicationContext(),beardImages,beardNames);
        list.setAdapter(ca1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),beardNames[position]+"",Toast.LENGTH_SHORT).show();



            }
        });
    }
}
