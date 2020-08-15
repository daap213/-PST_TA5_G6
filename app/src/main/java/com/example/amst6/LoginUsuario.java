package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LoginUsuario extends AppCompatActivity {
    private DeveloperuBD datos;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);

    }
    public void ingresar(View view) {
        String usuario=((EditText)findViewById(R.id.usu)).getText().toString();
        String contraseña=((EditText)findViewById(R.id.contr)).getText().toString();
        Boolean acceso=Boolean.FALSE;
        ArrayList<String> datos = null;
        datos.add("rjtorres");
        datos.add("bcali");
        datos.add("jareva");

        if (datos.contains(usuario) && datos.contains(contraseña)){
            acceso=Boolean.TRUE;
        }

        if(acceso){
            Intent i = new Intent(this, Login.class );
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"El Usuario o Contraseña que ingreso no son válidos",Toast.LENGTH_LONG).show();
        }
    }
}