package com.firstapp.mpdam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed2=findViewById(R.id.ed2);
        Intent i=getIntent();
        String valeur = i.getStringExtra("valeur");
        ed2.setText(valeur);
    }


}