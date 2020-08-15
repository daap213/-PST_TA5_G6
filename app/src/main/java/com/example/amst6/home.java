package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.amst6.entidades.Datos;
import com.example.amst6.entidades.Libros;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private RecyclerView rvLista;
    private SearchView svSearch;
    private PersonaAdapter adapter;
    private List<Libros> items;
    DeveloperuBD sqlLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_datos);
        sqlLite = new DeveloperuBD(this);

        initViews();
        initValues();
    }

    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = mostrarDatos();
        adapter = new PersonaAdapter(items);
        rvLista.setAdapter(adapter);
    }

    public List<Libros> mostrarDatos() {
        List<Libros> itemLists = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = sqlLite.getReadableDatabase();
        Libros libro;
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM LIBROS", null);
        while (cursor.moveToNext()) {
            libro = new Libros();
            libro.setTitulo(cursor.getString(1));
            libro.setTitulo(cursor.getString(2));
            libro.setAutor(cursor.getString(3));
            libro.setEditorial(cursor.getString(4));
            libro.setDescripcion(cursor.getString(5));
            libro.setCategoria(cursor.getString(6));
            libro.setURL(cursor.getInt(7));
            itemLists.add(libro);
        }
        return itemLists;
    }


}