package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.amst6.entidades.Menu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Login_Usuario extends AppCompatActivity {
    private DeveloperuBD datos;
    BaseDatos bd;
    private EditText usu;
    private EditText contr;
    private Boolean acceso=Boolean.FALSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usu= (EditText) findViewById(R.id.usu);
        contr= (EditText) findViewById(R.id.contr);
        bd= new BaseDatos();
        bd.basedatos(getApplicationContext());
    }
    public void ingresarM(View view) {
        String usuario= usu.getText().toString();
        String contrasea= contr.getText().toString();
        ArrayList<String> datos = new ArrayList<>();
        datos.add("rjtorres");
        datos.add("bcali");
        datos.add("jareva");

        if (datos.contains(usuario) && datos.contains(contrasea)){
            acceso=Boolean.TRUE;
        }
        //Cambie el intent
        if(acceso){
            Intent i = new Intent(this, Menu.class);
            i.putExtra("dato",usuario);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"El Usuario o Contraseña que ingreso no son válidos",Toast.LENGTH_LONG).show();
        }
    }
}