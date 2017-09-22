package com.mistcorp.lab3_313;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        button = (Button)findViewById(R.id.button20);
    }

    public void onClick(View view){
       // button.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        button.setBackgroundDrawable(getResources().getDrawable(R.drawable.outline_background2));
    }
}
