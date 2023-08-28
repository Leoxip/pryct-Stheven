package com.example.pryct;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String usuario = getIntent().getStringExtra("usuario");

        ImageButton imageButton = findViewById(R.id.imageButton);

        if ("stheven".equals(usuario)) {
            imageButton.setImageResource(R.drawable.avatarstheven); // Reemplaza con el nombre de tu imagen para Stheven
        } else if ("Lucia".equals(usuario)) {
            imageButton.setImageResource(R.drawable.avatarlucia); // Reemplaza con el nombre de tu imagen para Lucia
        }
    }
}