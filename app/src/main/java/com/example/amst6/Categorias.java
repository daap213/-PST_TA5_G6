package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }
    public void botones(View view) {
        String cat ="";
        Intent i = new Intent(this, home.class );
        switch(view.getId()){
            case R.id.btn1:
                cat="Romantica";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
            case R.id.btn2:
                cat="Comedia";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
            case R.id.btn3:
                cat="Terror";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
            case R.id.btn4:
                cat="Juvenil";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
            case R.id.btn5:
                cat="Acción";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
            case R.id.btn6:
                cat="Misterio";
                i.putExtra("categoria",cat);
                startActivity(i);
                break;
        }
    }
}