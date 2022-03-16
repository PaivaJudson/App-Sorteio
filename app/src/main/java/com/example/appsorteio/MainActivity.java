package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearValor(View view){
        texto = findViewById(R.id.txt_resultado);
        Random gerador = new Random();
        int numero = gerador.nextInt(11);
        texto.setText("Número: "+numero);
    }
}