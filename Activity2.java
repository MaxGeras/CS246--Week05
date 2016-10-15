package com.example.maxlena.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText text = (EditText) findViewById(R.id.editText);
        Bundle bond;
        bond = getIntent().getExtras();
        text.setText(bond.getString("message"));
    }
}
