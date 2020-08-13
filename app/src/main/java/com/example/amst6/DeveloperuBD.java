package com.example.amst6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DeveloperuBD extends SQLiteOpenHelper {
    private static final String Nombre_BD= "Developeru.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_DATOS="" +
            "CREATE TABLE DATOS (" +
            "IDDATOS TEXT PRIMARY KEY," +
            " USUARIO TETX, " +
            "CONTRASEÑA TEXT, " +
            "CORREO TEXT, " +
            "CELULAR TEXT, " +
            "FAVORITO TEXT)";

    private static final String TABLA_LIBROS= "CREATE TABLE PELICULAS (" +
            "IDLIBRO TEXT NOT NULL CONSTRAINT FK_ID_PELI REFERENCES DATOS(IDDATOS) ON DELETE CASCADE ON UPDATE CASCADE, " +
            "TITULO TEXT, " +
            "AUTOR TEXT, " +
            "EDITORIAL TEXT, " +
            "DESCRIPCION TEXT, " +
            "CATEGORRIA TEXT, " +
            "URL TEXT)";

    public DeveloperuBD(Context context, String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name="Developeru.bd", factory, version=1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_DATOS);
        sqLiteDatabase.execSQL(TABLA_LIBROS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLA_DATOS);
        sqLiteDatabase.execSQL(TABLA_DATOS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLA_LIBROS);
        sqLiteDatabase.execSQL(TABLA_LIBROS);
    }
    public void agredarDatos(String id, String usuario, String contraseña, String correo, String celular,String nuPelicula){
        SQLiteDatabase bd= getWritableDatabase();
        if(bd!= null){
            bd.execSQL("INSERT INTO DATE VALUES('"+id+"','"+usuario+"','"+contraseña+"','"+correo+"','"+celular+"','"+nuPelicula+"')");
            bd.close();
        }
    }
    public void agredarPeliculas(String idPel, String titulo, String autor, String editorial, String descripcion,String categoria, int URL){
        SQLiteDatabase bd= getWritableDatabase();
        if(bd!= null){
            bd.execSQL("INSERT INTO DATE VALUES('"+idPel+"','"+titulo+"','"+autor+"','"+editorial+"','"+descripcion+"','"+categoria+"','"+URL+"')");
            bd.close();
        }
    }
}
