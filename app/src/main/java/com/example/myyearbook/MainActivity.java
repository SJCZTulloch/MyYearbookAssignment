package com.example.myyearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.maintext);
        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("I can speak 3 languages");
            }
            });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("What's Next?");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            class NextActivity {
            }

            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(),MyPlanAfterGraduation.class);
                startActivity(i);
            }
        })

    ;}
}