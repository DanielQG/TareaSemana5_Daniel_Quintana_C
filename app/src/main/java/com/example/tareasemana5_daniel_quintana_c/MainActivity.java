package com.example.tareasemana5_daniel_quintana_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.et1);
        contrasena = findViewById(R.id.et2);



    }

     public void ValudaryEnviar(View v){

        String usuarioM = "uisrael",contrasenaM = "uisrael.20";


        if (usuario.getText().toString().equals(usuarioM) && contrasena.getText().toString().equals(contrasenaM)){

            Intent intentEnvio = new Intent(MainActivity.this,Aplicacion2.class);
            intentEnvio.putExtra("datoEnviado","Bienvenido: " +usuario.getText().toString());
            Toast.makeText(getApplicationContext(),"Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
            startActivity(intentEnvio);

        }else{
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();
        }



    }
}
