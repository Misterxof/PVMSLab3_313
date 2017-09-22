package com.mistcorp.lab3_313;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        startActivity(intent);
    }

    public void onClick3(View view){
        Intent intent = new Intent(MainActivity.this, Activity4.class);
        startActivity(intent);
    }

    public void onClick4(View view){
        this.finish();
    }
}
