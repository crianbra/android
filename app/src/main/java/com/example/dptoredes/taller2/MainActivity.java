package com.example.dptoredes.taller2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mensaje", "creando");
        setContentView(R.layout.activity_main);

        /*final Button button = (Button) findViewById(R.id.btn_ingreso);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d (tag,"Si llamo a la funcion");
                Intent intent01 = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent01);

            }
        });*//*OPCION PARA LLAMAR OTRA ACTIVIDAD*/

        final Button button = (Button) findViewById(R.id.btn_ingreso);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirAcerca();

            }
        });

    }

    public void AbrirAcerca() {
        Log.d (tag,"Si llamo a la funcion");
        //Intent intent = new Intent(this, AcercaDe.class);
        //startActivity(intent);

        TextView u = (TextView) (findViewById(R.id.user));
        TextView p = (TextView) (findViewById(R.id.pass));

        Intent i01 = new Intent(this, AcercaDe.class);
        String data [] = new String [2];
        i01.putExtra("usuario", ""+u.getText());
        i01.putExtra("password",""+p.getText());
        startActivity(i01);



    }

    @Override
    protected void onStart() {
        Log.d("mensaje", "start");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("mensaje", "pause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d("mensaje", "restart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("mensaje", "destroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d("mensaje", "resume");
        super.onResume();
    }




}
