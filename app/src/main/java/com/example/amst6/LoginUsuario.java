package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUsuario extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);

    }
    public void ingresar(View view) {
        String usuario=((EditText)findViewById(R.id.usu)).getText().toString();
        String contraseña=((EditText)findViewById(R.id.contr)).getText().toString();

        if(usuario != "asd" && contraseña != "asd"){
            Toast.makeText(getApplicationContext(),"El Usuario o Contraseña que ingreso no son válidos",Toast.LENGTH_LONG).show();

        }
        else {
            Intent i = new Intent(this, Login.class );
            startActivity(i);
        }
    }

}