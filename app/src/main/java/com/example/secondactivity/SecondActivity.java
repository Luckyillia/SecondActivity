package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
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

        TextView text = findViewById(R.id.text);
        String massage = getIntent().getStringExtra("massage");
        text.setText(massage);

        Button but = findViewById(R.id.navigateBack);
        but.setOnClickListener(v->{
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            intent.putExtra("massage", "witaj z secondactivity");
            startActivity(intent);
        });
    }
}