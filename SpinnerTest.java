package com.example.rahul.putgetextra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Rahul on 1/1/2018.
 */

public class SpinnerTest extends AppCompatActivity {
    public void onCreate(Bundle s)
    {
        super.onCreate(s);
        setContentView(R.layout.spinner);
    }
    public void home(View v)
    {
       // setContentView(R.layout.activity_main);
       Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
