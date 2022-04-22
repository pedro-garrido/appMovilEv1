package com.example.eval1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class turismo extends AppCompatActivity {

    ImageButton fork, plain, send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);

        //inicializar botones
        fork = findViewById(R.id.btn_fork);
        plain = findViewById(R.id.btn_plain);
        send = findViewById(R.id.btn_send);

        fork.setOnClickListener(v -> {
            Toast.makeText(this, "Fork", Toast.LENGTH_SHORT).show();
        });
        plain.setOnClickListener(v -> {
            Toast.makeText(this, "Plain", Toast.LENGTH_SHORT).show();
        });
        send.setOnClickListener(v -> {
            Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
        });

    }
}