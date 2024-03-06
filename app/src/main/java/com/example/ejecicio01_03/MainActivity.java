package com.example.ejecicio01_03;

import static com.example.ejecicio01_03.R.id.cuadro1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.cuadro1);
        valor2 = findViewById(R.id.cuadro2);
        resultado = findViewById(R.id.respuesta);
    }

    //------------------------------------------------------------------//
    public void sumar(View view){
        int suma = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        resultado.setText(suma+"");
    }
    public void restar(View view){
        int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
        resultado.setText(resta+"");
    }
    public void multiplicar(View view){
        int multi = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
        resultado.setText(multi+"");
    }
    public void dividir(View view) {
        float num1 = Float.parseFloat(valor1.getText().toString());
        float num2 = Float.parseFloat(valor2.getText().toString());
        float division = num1 / num2;
        resultado.setText(String.valueOf(division));
    }

    //------------------------------------------------------------------//
    public void potencia(View view) {
        int base = Integer.parseInt(valor1.getText().toString());
        int exponente = Integer.parseInt(valor2.getText().toString());
        float potencia = calcularPotencia(base, exponente);
        resultado.setText(String.valueOf(potencia));
    }
    public static float calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
    public static float multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }

    //------------------------------------------------------------------//
    public void factorial(View view) {
        int num = Integer.parseInt(valor1.getText().toString());
        float fact = factorial(num);
        resultado.setText(String.valueOf(fact));
    }
    public static float factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (float) n * factorial(n - 1);
        }
    }

    //------------------------------------------------------------------//
    public void fibonacci(View view) {
        int num = Integer.parseInt(valor1.getText().toString());
        int fib = fibonacci(num);
        resultado.setText(String.valueOf(fib));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
