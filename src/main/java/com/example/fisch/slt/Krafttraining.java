package com.example.fisch.slt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Krafttraining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krafttraining);

       TextView textInArbeit = (TextView) findViewById(R.id.textViewKrafttraining);
        textInArbeit.setText("Aktivität Krafttraning in Arbeit");


    }
}
