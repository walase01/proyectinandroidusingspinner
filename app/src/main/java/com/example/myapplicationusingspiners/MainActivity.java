package com.example.myapplicationusingspiners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conectar();
        String[] years = new String[42];
        int contador=0;
        for(int i=1980; i<=2021;i++){
            years[contador] = String.valueOf(i);
            contador++;
        }
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(this,R.layout.support_simple_spinner_dropdown_item,years);
        spr.setAdapter(adapter);
    }

    private void Conectar(){

        spr = findViewById(R.id.spinner);

    }
    public void seleccionar(View view){

        String selection = spr.getSelectedItem().toString();
        Toast.makeText(this,selection,Toast.LENGTH_LONG).show();
    }
}