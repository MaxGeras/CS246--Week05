package com.example.maxlena.scripturereference;

import android.app.Activity;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickedButton(View v)
    {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);

        String str = editText1.getText().toString().substring(0,1).toUpperCase() +
                editText1.getText().toString().substring(1)
                + " " + editText2.getText().toString() + ":"
                + editText3.getText().toString();

        Intent intent = new Intent(MainActivity.this,Activity2.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }
}