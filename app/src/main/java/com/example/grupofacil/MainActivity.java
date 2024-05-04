package com.example.grupofacil;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculo vistas
        Button addButton = findViewById(R.id.addButton);
        ScrollView scrollView = findViewById(R.id.scrollView);
        final LinearLayout linearLayout = findViewById(R.id.linearLayout);

        // Paso 3: Agregar un botón nuevo al presionar el botón "Agregar botón"
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un nuevo botón
                Button newButton = new Button(getApplicationContext());
                newButton.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));
                newButton.setText("Button");

                // Agregar el nuevo botón al LinearLayout dentro del ScrollView
                linearLayout.addView(newButton);

                // Scroll hacia abajo para mostrar el nuevo botón
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        });
    }

}