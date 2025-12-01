package com.example.tema5controlesbsicos;

import static android.graphics.Typeface.ITALIC;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity2);

        TextView tvContenido = findViewById(R.id.tvContenido);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.pacifico_regular);
        tvContenido.setTypeface(typeface);
        tvContenido.setText("TEXTO ESCRITO CON FUENTE PACIFICO");
        tvContenido.setTextColor(Color.BLUE);
        tvContenido.setTextSize(20);

        // -------------------------
        // Añadir animación
        // -------------------------
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotar1);
        tvContenido.startAnimation(anim);
    }
}

