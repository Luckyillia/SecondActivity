package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText name = findViewById(R.id.name);
        EditText surname = findViewById(R.id.surname);
        EditText adres = findViewById(R.id.adres);
        EditText email = findViewById(R.id.email);

        Button but = findViewById(R.id.navigateBack);
        but.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            intent.putExtra("name", name.getText().toString());
            intent.putExtra("surname", surname.getText().toString());
            intent.putExtra("adres", adres.getText().toString());
            intent.putExtra("email", email.getText().toString());
            startActivity(intent);
        });
    }
}