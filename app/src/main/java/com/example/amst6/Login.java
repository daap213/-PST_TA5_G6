package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    //Cambie el intent al main ya que el de LoginUsuario me daba problemas
    public void continuar(View view) {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }


}