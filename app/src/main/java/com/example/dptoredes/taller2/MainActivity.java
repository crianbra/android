package com.example.dptoredes.taller2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mensaje", "creando");
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d (tag,"Si llamo a la funcion");
                Intent intent01 = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent01);

            }
        });/*OPCION PARA LLAMAR OTRA ACTIVIDAD*/
    }

    public void AbrirAcerca() {
        Log.d (tag,"Si llamo a la funcion");
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
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
