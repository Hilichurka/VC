package com.example.vc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);

        Button reg=(Button) findViewById(R.id.reg);
        reg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent reg=new Intent(MainActivity4.this, MainActivity3.class);
        startActivity(reg);
    }
}