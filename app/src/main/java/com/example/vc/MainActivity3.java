package com.example.vc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        Button knopka3=(Button) findViewById(R.id.knopka3);
        knopka3.setOnClickListener(this);

}

    @Override
    public void onClick(View view) {
            Intent knopka3=new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(knopka3);
    }
    }