package com.example.mirza.barbershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class hairstyle extends AppCompatActivity {
    ListView list;
    int [] hairImages=new int[] {R.drawable.style7,R.drawable.style8,R.drawable.style9,R.drawable.short1,R.drawable.short2,R.drawable.short3,R.drawable.short4,R.drawable.short5,R.drawable.short6,R.drawable.style1,R.drawable.style2,R.drawable.style3,R.drawable.style4,R.drawable.style5,R.drawable.style6,};
String [] hairNames= new String[]{"hs(1)","hs(2)","hs(3)","hs(4)","hs(5)","hs(6)","hs(7)","hs(8)","hs(9)","hs(10)","hs(11)","hs(12)","hs(13)","hs(14)","hs(15)"};
   CustomAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairstyle);

        list=(ListView) findViewById(R.id.Lv);
        ca= new CustomAdapter(getApplicationContext(),hairImages,hairNames);
        list.setAdapter(ca);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),hairNames[position]+"",Toast.LENGTH_SHORT).show();


            }
        });


    }
}
