package com.example.amst6.entidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amst6.Categorias;
import com.example.amst6.R;
import com.example.amst6.home;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void opciones(View view) {

        switch (view.getId()) {
            case R.id.btnLi:
                Intent i = new Intent(this, home.class);
                startActivity(i);
                break;
            case R.id.btnMis:
                Intent i2 = new Intent(this, home.class);//Cambiar
                startActivity(i2);
                break;
            case R.id.btnCat:
                Intent i3 = new Intent(this, Categorias.class);
                startActivity(i3);
                break;
            case R.id.btnPer:
                Intent i4 = new Intent(this, home.class);//Cambiar
                startActivity(i4);
                break;
        }
    }
}