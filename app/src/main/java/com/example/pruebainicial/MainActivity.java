package com.example.pruebainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campoTexto1, campoTexto2;
    private Button botonRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restarNumeros();
    }

    public void restarNumeros() {
        campoTexto1 = (EditText) findViewById(R.id.editText1);
        campoTexto2 = (EditText) findViewById(R.id.editText2);
        botonRestar = (Button) findViewById(R.id.btnResta);

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = campoTexto1.getText().toString();
                String numero2 = campoTexto2.getText().toString();
                int a = Integer.parseInt(numero1);
                int b = Integer.parseInt(numero2);
                int resta = a-b;
                Toast.makeText(getApplicationContext(), String.valueOf(resta),Toast.LENGTH_LONG).show();
            }
        });
    }
}