package com.example.diego.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView texto1;
    TextView texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto1 = (TextView) findViewById(R.id.textView);
        texto2 = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();

        String extra1 = extras.getString("clave1");
        String extra2 = extras.getString("clave2");

        texto1.setText(extra1);
        texto2.setText(extra2);
    }

    public void volver(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
