package com.example.pryct;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usuarioEditText = findViewById(R.id.Usuario);
        final EditText contraseñaEditText = findViewById(R.id.Contraseña);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = usuarioEditText.getText().toString();
                String contraseña = contraseñaEditText.getText().toString();

                if (usuario.equals("stheven") && contraseña.equals("1234")) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("usuario", "stheven");
                    startActivity(intent);
                } else if (usuario.equals("Lucia") && contraseña.equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("usuario", "Lucia");
                    startActivity(intent);
                }
            }
        });
    }
}