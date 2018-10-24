package com.example.mirza.barbershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,  btn1;
    Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.bt2);
        Button btn1=(Button)findViewById(R.id.bt3);
        Button book=(Button)findViewById(R.id.Book);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        Intent i= new Intent(MainActivity.this,hairstyle.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(),"Hair Styles",Toast.LENGTH_SHORT).show();
    }
});
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Beard.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Beard Styles",Toast.LENGTH_SHORT).show();

            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Booking.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Bookings",Toast.LENGTH_SHORT).show();


            }
        });

    }
}
