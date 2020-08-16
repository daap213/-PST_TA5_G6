package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.amst6.entidades.Menu;

public class MainActivity extends AppCompatActivity {
    BaseDatos bd;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et= (EditText) findViewById(R.id.UsuarioCont);

        bd= new BaseDatos();
        bd.basedatos(getApplicationContext());
    }

    public void entrar(View view){
        //Cambie el intent
        Intent i = new Intent(this, Menu.class);
        i.putExtra("dato",et.getText().toString());
        startActivity(i);
    }
}
