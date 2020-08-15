package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        Intent i = new Intent(this, home.class);
        i.putExtra("dato",et.getText().toString());
        startActivity(i);
    }
}
