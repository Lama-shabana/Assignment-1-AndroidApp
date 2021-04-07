package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {
    private EditText editFullName;
    private EditText editEmailAddress;
    private EditText editDateOfBirth;
    private EditText editAge;
    private EditText editPassword;
    Spinner spinner;
    //String SpinnerValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editFullName = findViewById(R.id.editFullName);
        editEmailAddress = findViewById(R.id.editEmailAddress);

          spinner = findViewById(R.id.spinner);
          spinner();
        editDateOfBirth = findViewById(R.id.editDateOfBirth);
        editAge = findViewById(R.id.editAge);
        editPassword = findViewById(R.id.editPassword);


    }




    public void btn_OnClick(View view) {

        Intent intent = new Intent(this, MainActivity2.class);

        String data= editFullName.getText().toString();
        intent.putExtra("Full Name",data);

        String data1=editEmailAddress.getText().toString();
        intent.putExtra("Email Address",data1);


        String data2= spinner.getSelectedItem().toString();
        intent.putExtra("gender",data2);



        String data3=editDateOfBirth.getText().toString();
        intent.putExtra("Data OF Birth ",data3);


        String data4=editAge.getText().toString();
        intent.putExtra("Age ",data4);

        String data5=editPassword.getText().toString();
        intent.putExtra("Password ",data5);


        startActivity(intent);

    }


  private void spinner() {

      ArrayList<String> gender = new ArrayList<>();
       gender.add("Male");
       gender.add("Female");
      ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
              android.R.layout.simple_spinner_item, gender);
      spinner.setAdapter(adapter);

  }
}

