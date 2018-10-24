package com.example.mirza.barbershop;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.R.attr.data;

public class Booking extends AppCompatActivity {



    EditText nam, addr, phn, ti,da, sty,typ;
    Button btn;

    NotificationCompat.Builder build;
    NotificationManager manager;


DatabaseReference database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);



        nam= (EditText) findViewById(R.id.name1);
addr       = (EditText) findViewById(R.id.address1);
        phn= (EditText) findViewById(R.id.phone1);
        ti= (EditText) findViewById(R.id.time1);
        da= (EditText) findViewById(R.id.date1);
        sty= (EditText) findViewById(R.id.style1);
        typ= (EditText)findViewById(R.id.tno1);

        btn= (Button)findViewById(R.id.cb);


        database= FirebaseDatabase.getInstance().getReference("bookings");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


addorder();


                Intent i = new Intent(Booking.this, OrderReview.class);
                startActivity(i);


                build= (NotificationCompat.Builder) new NotificationCompat.Builder(Booking.this)
                        .setSmallIcon(R.drawable.chang)
                        .setLargeIcon(BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.chang ))
                        .setContentTitle("Booking Comfirm")
                        .setContentText("Check the details");
                manager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(1,build.build());

            }
        });








            }
    private void addorder() {
        String name = nam.getText().toString().trim();
        String add = addr.getText().toString().trim();
        String ph = phn.getText().toString().trim();
        String t = ti.getText().toString().trim();
        String d=da.getText().toString().trim();
        String st= sty.getText().toString().trim();
        String tn= typ.getText().toString().trim();


        if (!TextUtils.isEmpty(name)) {

            String id = database.push().getKey();
            Booking1 or = new Booking1(name, add, ph, t,d,st,tn );
            database.child(id).setValue(or);
            Toast.makeText(this, "you should be on time ", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "Do this again ", Toast.LENGTH_SHORT).show();

        }


    }
}

