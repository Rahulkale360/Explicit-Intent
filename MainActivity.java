package com.example.rahul.putgetextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View v)
    {
        TextView et=findViewById(R.id.et);
        Intent i=new Intent(this,Welcome.class);
        i.putExtra("name","Welcome "+et.getText());
        startActivity(i);
    }



}
