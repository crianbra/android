package com.example.dptoredes.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        TextView user= (TextView)(findViewById(R.id.txt_user));
        user.setText((String)getIntent().getExtras().get("usuario"));

        TextView pass= (TextView)(findViewById(R.id.txt_pass));
        pass.setText((String)getIntent().getExtras().get("password"));
    }
}
