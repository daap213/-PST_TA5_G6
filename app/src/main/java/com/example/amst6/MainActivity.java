package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    BaseDatos bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bd= new BaseDatos();
        bd.basedatos(getApplicationContext());
    }

    public void entrar(View view){
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}
