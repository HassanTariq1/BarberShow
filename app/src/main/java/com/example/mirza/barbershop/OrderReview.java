package com.example.mirza.barbershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class OrderReview extends AppCompatActivity {

    ListView list;
    DatabaseReference data;
    List<Booking1> orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_review);





        data = FirebaseDatabase.getInstance().getReference("bookings");

        orderList = new ArrayList<>();


        list = (ListView) findViewById(R.id.listorder);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {











            }
        });




    }

    @Override
    protected void onStart() {
        super.onStart();

        data.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ordersnapo: dataSnapshot.getChildren()) {


                    Booking1 order= ordersnapo.getValue(Booking1.class);

                    orderList.add(order);

                }


                Booking2 adap= new Booking2(OrderReview. this, orderList);
                list.setAdapter(adap);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }


    }

