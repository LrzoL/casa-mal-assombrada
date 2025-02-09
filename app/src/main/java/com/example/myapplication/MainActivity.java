package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagesBttns();
    }

    protected void imagesBttns() {
        ImageButton principal = (ImageButton) findViewById(R.id.telaIncialImageBttn);

        ImageButton.setOnClickListener(new View.OnClickListener() {
     
            Intent i = new Intent(this, OptionsInitalScren.class);
            principal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                startActivity(i);
                }
            });
        })
    }
}