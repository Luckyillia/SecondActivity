package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameText = findViewById(R.id.name);
        TextView surnameText = findViewById(R.id.surname);
        TextView adresText = findViewById(R.id.adres);
        TextView emailText = findViewById(R.id.email);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String adres = getIntent().getStringExtra("adres");
        String email = getIntent().getStringExtra("email");
        if(name != null){
            nameText.setText("Imie: "+name);
            surnameText.setText("Nazwisko: "+surname);
            adresText.setText("Adres: "+adres);
            emailText.setText("Email: "+email);
        }


        Button but = findViewById(R.id.secondActivity);
        but.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        });

    }
}
