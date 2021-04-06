package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    private EditText editFullName;
    private EditText editEmailAddress;
    private EditText editDateOfBirth;
    private EditText editAge;
    //private EditText Spinner;
    private EditText editPassword;
    private String[] Gender = { "Male", "Female"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editFullName=findViewById(R.id.editFullName);
        editEmailAddress=findViewById(R.id.editEmailAddress);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        spin=findViewById(R.id.spinner);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Gender);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        editDateOfBirth=findViewById(R.id.editDateOfBirth);
        editAge=findViewById(R.id.editAge);
        editPassword=findViewById(R.id.editPassword);


    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        //Toast.makeText(getApplicationContext(),Gender[position] , Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void btn_OnClick(View view) {

        Intent intent = new Intent(this, MainActivity2.class);

        String data= editFullName.getText().toString();
        intent.putExtra("Full Name",data);

        String data1=editEmailAddress.getText().toString();
        intent.putExtra("Email Address",data1);

        String data2=Gender.toString();
        intent.putExtra("Gender",data2);

        String data3=editDateOfBirth.getText().toString();
        intent.putExtra("Data OF Birth ",data3);


        String data4=editAge.getText().toString();
        intent.putExtra("Age ",data4);

        String data5=editPassword.getText().toString();
        intent.putExtra("Password ",data5);

        startActivity(intent);

    }
}