package com.example.amritanjali.autocomplet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView a;
    String [] color={"red","Blue","black","orange","Green","Yellow"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(AutoCompleteTextView) findViewById(R.id.a);


        ArrayAdapter<String> b=new ArrayAdapter<String>(MainActivity.this,android.R.layout.select_dialog_item,color);
        a.setThreshold(1);
        a.setAdapter(b);

    }
}
