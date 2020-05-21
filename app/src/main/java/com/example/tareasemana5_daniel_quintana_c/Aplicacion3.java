package com.example.tareasemana5_daniel_quintana_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Aplicacion3 extends AppCompatActivity {

    TextView u1,u2,u3,u4,u5;
    Bundle  resultados1, resultados2,resultados3,resultados4,resultados5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacion3);

        u1 = findViewById(R.id.r1);
        u2 = findViewById(R.id.r2);
        u3 = findViewById(R.id.r3);
        u4 = findViewById(R.id.r4);
        u5 = findViewById(R.id.r5);

        resultados1 = getIntent().getExtras();
        resultados2 = getIntent().getExtras();
        resultados3 = getIntent().getExtras();
        resultados4 = getIntent().getExtras();
        resultados5 = getIntent().getExtras();

        String recibir1 = resultados1.getString("dato1");
        String recibir2 = resultados2.getString("dato2");
        String recibir3 = resultados3.getString("dato3");
        String recibir4 = resultados4.getString("dato4");
        String recibir5 = resultados5.getString("dato5");

        u1.setText(recibir1);
        u2.setText(recibir2);
        u3.setText(recibir3);
        u4.setText(recibir4);
        u5.setText(recibir5);
    }
}
