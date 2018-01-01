package com.example.rahul.putgetextra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rahul on 1/1/2018.
 */

public class Welcome extends AppCompatActivity {
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.welcome);
      String s = getIntent().getStringExtra("name");
        ArrayList<String> al=new ArrayList<String>();
        AutoCompleteTextView tv=findViewById(R.id.tv);
        al.add(s);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,al);
        tv.setAdapter(ad);
        tv.setThreshold(1);

    }
    public void back(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void viewSpin(View v)
    {
        Intent i=new Intent(this,SpinnerTest.class);
        startActivity(i);
    }

}
