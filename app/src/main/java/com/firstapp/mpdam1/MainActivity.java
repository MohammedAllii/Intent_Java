package com.firstapp.mpdam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
    EditText e1;
    private CharSequence DateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        e1=findViewById(R.id.ed1);



    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("valeur",e1.getText().toString());
        startActivity(i);
    }
    public void onClick2(View v) {
        Intent j=new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(j);
    }
    public void onClick3(View v) {
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra(CalendarContract.Events.TITLE, "Event Title");
        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, DateTime);
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, DateTime);
        intent.putExtra(CalendarContract.Events.ALL_DAY, true);
        intent.putExtra(CalendarContract.Events.DESCRIPTION, "Event Descripttion");
        intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Event Location");
        startActivity(Intent.createChooser(intent, "Add to calendar"));
    }
}