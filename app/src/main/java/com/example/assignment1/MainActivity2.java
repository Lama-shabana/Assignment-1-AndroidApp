package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        String data =intent.getStringExtra("Full Name");
        TextView txtData = findViewById(R.id.TxtDisplayData);
        txtData.setText(data);

        String data1= intent.getStringExtra("Email Address");
        TextView txtData1 = findViewById(R.id.txtDispalyData1);
        txtData1.setText(data1);

        String data2=intent.getStringExtra("gender");
        TextView txtData2 = findViewById(R.id.txtDispalyData2);
        txtData2.setText(data2);

        String data3=intent.getStringExtra("Data OF Birth ");
        TextView txtData3 = findViewById(R.id.txtDispalyData3);
        txtData3.setText(data3);

        String data4=intent.getStringExtra("Age ");
        TextView txtData4 = findViewById(R.id.txtDispalyData4);
        txtData4.setText(data4);

        String data5= intent.getStringExtra("Password ");
        TextView txtData5 = findViewById(R.id.txtDispalyData5);
        txtData5.setText(data5);

    }
}