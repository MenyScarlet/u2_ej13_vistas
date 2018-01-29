package com.example.didact.u2_ej13_vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Crear las variables de las vistas que vamos a identificar.

    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificamos las vistas
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

    } //FIN OnCreate

    public void ClickIcono1(View view){
        tv1.setText("Has clicado el icono 1");

    }
    public void ClickIcono2 (View view){
        tv1.setText("Has clicado el icono 2");
    }
    public void ClickIcono3 (View view){
    tv1.setText("Has clicado el icono 3");

    }
    public void ClickIcono4 (View view){
        String etiquetaSeleccionada = tv1.getText().toString();
        tv2.setText(etiquetaSeleccionada);
    }


} //FIN MainActivity