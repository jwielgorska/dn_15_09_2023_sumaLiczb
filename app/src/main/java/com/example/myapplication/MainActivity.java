package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void suma(View view) {
        EditText a=findViewById(R.id.liczba1);//to są obiekt
       EditText b=findViewById(R.id.liczba2);//to są obiekty
       TextView zapisz=findViewById(R.id.wynik);
       float liczbaA=Float.parseFloat(a.getText().toString());
       float liczbaB=Float.parseFloat(b.getText().toString());
        float w=liczbaA+liczbaB;
       zapisz.setText(Float.toString(w));
   }


}