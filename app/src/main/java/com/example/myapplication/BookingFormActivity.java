package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BookingFormActivity extends AppCompatActivity {


    Button cnf,b2;
    EditText name, email, phn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_form);

        name = findViewById(R.id.editTextTextPersonName9);
        email = findViewById(R.id.editTextTextPersonName10);
        phn = findViewById(R.id.editTextPhone2);
        cnf = findViewById(R.id.button2);

        cnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String custname = name.getText().toString();
                String custemail = email.getText().toString();
                Database db = new Database(getApplicationContext(), "BandBajaBarat", null, 1);
                if (custname.length() == 0 || custemail.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please Fill All Details", Toast.LENGTH_SHORT).show();
                } else {
                    if (phn.length() < 10 || phn.length() > 10) {
                        Toast.makeText(getApplicationContext(), "Enter Valid Phone Number", Toast.LENGTH_SHORT).show();
                    } else {
                        startActivity(new Intent(BookingFormActivity.this, ConfirmedActivity.class));
                    }

                }
            }
        });
    }
}