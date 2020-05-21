package com.example.tareasemana5_daniel_quintana_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Aplicacion2 extends AppCompatActivity {

    TextView usuarioRecibido;
    Bundle datoActividadUno;

    String resultado1;
    String resultado2;
    String resultado3;
    String resultado4;
    String resultado5;


    CheckBox regaeton, salsa, pollofrito, ensalada, gatos, perros;
    RadioButton negro,blanco, bmw, peugeot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacion2);

        //mostrar usuario que inició sesión
        usuarioRecibido = findViewById(R.id.txtUsuarioA2);
        datoActividadUno = getIntent().getExtras();
        String recibir = datoActividadUno.getString("datoEnviado");
        usuarioRecibido.setText(recibir);
    }

    public void Guardar(View v){

        //Asignar a las variables los objetos de Palette;
        regaeton = findViewById(R.id.cb1);
        salsa = findViewById(R.id.cb2);
         pollofrito = findViewById(R.id.cb3);
         ensalada = findViewById(R.id.cb4);
        gatos = findViewById(R.id.cb5);
        perros = findViewById(R.id.cb6);
        negro = findViewById(R.id.rb1);
        blanco = findViewById(R.id.rb2);
        bmw = findViewById(R.id.rb3);
        peugeot = findViewById(R.id.rb4);



        //mostrar resultados de las opciones selecionadas



        if(regaeton.isChecked()==true){
            resultado1 = regaeton.getText().toString();

        }else {
            resultado1 = salsa.getText().toString();
        }



                if(pollofrito.isChecked()==true) {
                    resultado2 = pollofrito.getText().toString();
                }else {
                    resultado2 = ensalada.getText().toString();
                }

                        if (gatos.isChecked() == true) {
                            resultado3 = gatos.getText().toString();
                        } else {
                                resultado3 = perros.getText().toString();
                            }



        if(blanco.isChecked()==true){
            resultado4 = blanco.getText().toString();
        }else{
                resultado4 = negro.getText().toString();
            }



                if(bmw.isChecked()==true){
                    resultado5 = bmw.getText().toString();
                }else{
                    resultado5 = peugeot.getText().toString();
                }

                Intent intentEnvioApp3R1 = new Intent(Aplicacion2.this,Aplicacion3.class);
                intentEnvioApp3R1.putExtra("dato1","Resultado: " + resultado1 );
                intentEnvioApp3R1.putExtra("dato2","Resultado: " + resultado2 );
                intentEnvioApp3R1.putExtra("dato3","Resultado: " + resultado3 );
                intentEnvioApp3R1.putExtra("dato4","Resultado: " + resultado4);
                intentEnvioApp3R1.putExtra("dato5","Resultado: " + resultado5 );

            startActivity(intentEnvioApp3R1);







    }

}

