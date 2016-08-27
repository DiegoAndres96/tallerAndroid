package com.example.diego.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ingresa;
    EditText ingresa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresa = (EditText) findViewById(R.id.editText);
        ingresa2 = (EditText) findViewById(R.id.editText2);
    }

    public void pasar(View v){
        String palabra = ingresa.getText().toString();
        String palabra2 = ingresa2.getText().toString();

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        intent.putExtra("clave1",palabra);
        intent.putExtra("clave2", palabra2);

        startActivity(intent);
    }

    public void mostrarToast(View v){
        Toast.makeText(getApplicationContext(),"Mostrando TOAST", Toast.LENGTH_SHORT).show();
    }
}
