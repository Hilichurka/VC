package com.example.vc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        Button knopka=(Button) findViewById(R.id.knopka);
        knopka.setOnClickListener(this);

        Button knopka2=(Button) findViewById(R.id.knopka2);
        knopka2.setOnClickListener(this::OnClick2);

        ImageButton kotiki=(ImageButton) findViewById(R.id.kotiki);
        kotiki.setOnClickListener(this::OnClick3);
    }



    @Override
    public void onClick(View view) {
        Intent knopka=new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(knopka);
    }

    private void OnClick2(View view) {
        Intent knopka2=new Intent(MainActivity2.this, MainActivity.class);
        startActivity(knopka2);
    }

    private void OnClick3(View view) {
        Intent kotiki=new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(kotiki);
    }
}