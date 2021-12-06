package com.fisei.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1° paso crear variables para referenciar
    private EditText et_01;
    private EditText et_02;
    private TextView tv_01;
    private Button btn_01;
    private Button btn_restar;
    private Button btn_multiplicar;
    private Button btn_potencia;
    private Button btn_factorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //referencia interfaz del usuario con el codigo de java

        //2° obtener las referencias de los controles visuales
        et_01 = this.findViewById(R.id.etValor1);
        et_02 = findViewById(R.id.etValor2);//convertir a editext

        tv_01 = findViewById(R.id.tvResultado);

        btn_01 = findViewById(R.id.btnAceptar);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);

        btn_restar = findViewById(R.id.btn_restar);

        //crear el manejador para el evento click
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = et_01.getText().toString();
                String valor2 = et_02.getText().toString();

                int x = Integer.parseInt(valor1);
                int y = Integer.parseInt(valor2);

                // int resultado = x + y;
                long resultado = Utilidades.multiplicar(x, y);
                tv_01.setText(String.valueOf(resultado));
            }
        });

        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo
                String valor1 = et_01.getText().toString();
                String valor2 = et_02.getText().toString();

                int x = Integer.parseInt(valor1);
                int y = Integer.parseInt(valor2);

                // int resultado = x + y;
                long resultado = Utilidades.restar(x, y);
                tv_01.setText(String.valueOf(resultado));
            }
        });

        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1 = et_01.getText().toString();
                String valor2 = et_02.getText().toString();

                int x = Integer.parseInt(valor1);
                int y = Integer.parseInt(valor2);

                // int resultado = x + y;
                long resultado = Utilidades.sumar(x, y);
                tv_01.setText(String.valueOf(resultado));
            }
        });

    }


    //3° paso: Crear un metodo

    public void Potencia(View view) {
        String valor1 = et_01.getText().toString();
        String valor2 = et_02.getText().toString();

        int x = Integer.parseInt(valor1);
        int y = Integer.parseInt(valor2);

        // int resultado = x + y;
        long resultado = Utilidades.potencia(x, y);
        tv_01.setText(String.valueOf(resultado));
    }
    public void Factorial(View view) {
        String valor1 = et_01.getText().toString();
        int x = Integer.parseInt(valor1);
        // int resultado = x + y;
        long resultado = Utilidades.factorial(x);
        tv_01.setText(String.valueOf(resultado));
    }

    public void ClicMostrarActivity(View view) {
        //mostar una actividad
        Intent intent = new Intent(this, TerceraActivity.class);
        this.startActivity(intent);
    }

    }
