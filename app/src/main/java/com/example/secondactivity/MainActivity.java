package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = findViewById(R.id.secondActivity);
        but.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("massage", "witaj z mainactivity");
            startActivity(intent);
        });

    }
}
