package com.example.tema5controlesbsicos;

import static android.graphics.Typeface.ITALIC;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity1);

        TextView tvContenido = findViewById(R.id.tvContenido);

        /*
         * -------------------------
         * EJEMPLO 5.1.1 – TEXTO DESDE XML
         * -------------------------
         * No hagas NADA aquí.
         * El texto aparece directamente porque está en el XML:
         *
         * android:text="Texto construido desde el XML"
         *
         * Para mostrar este ejemplo, deja TODOS los bloques siguientes comentados.
         */


        /*
         * -------------------------
         * EJEMPLO 5.1.2 – TEXTO DESDE JAVA (italic, azul, 20sp)
         * -------------------------
         */
        tvContenido.setText("Texto construido desde Java\nTamaño 20dp, Italic y color Blue.");
        tvContenido.setTextColor(Color.RED);
        tvContenido.setTypeface(null, ITALIC);
        tvContenido.setTextSize(20);


        /*
         * -------------------------
         * EJEMPLO 5.1.3 – XML + append desde Java
         * -------------------------
         */
//        tvContenido.append("\nTexto añadido con append desde Java.");
//        tvContenido.setTextColor(Color.RED); // opcional


        /*
         * -------------------------
         * EJEMPLO 5.1.4 – FUENTE DESCARGADA
         * -------------------------
         */
//        Typeface typeface = ResourcesCompat.getFont(this, R.font.pacifico_regular);
//        tvContenido.setTypeface(typeface);
//        tvContenido.setText("TEXTO ESCRITO CON FUENTE PACIFICO");
//        tvContenido.setTextColor(Color.BLUE);
//        tvContenido.setTextSize(20);
    }
}


