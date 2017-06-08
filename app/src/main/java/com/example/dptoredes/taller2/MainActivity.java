package com.example.dptoredes.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("mensaje", "creando");
        setContentView(R.layout.activity_main);
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
