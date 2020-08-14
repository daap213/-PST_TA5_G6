package com.example.amst6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DeveloperuBD extends SQLiteOpenHelper {
    private static final String Nombre_BD= "Developeru.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_DATOS="" +
            " CREATE TABLE DATOS (" +
            "IDDATOS TEXT PRIMARY KEY," +
            " USUARIO TETX, " +
            "CONTRASEÑA TEXT, " +
            "CORREO TEXT, " +
            "CELULAR TEXT, " +
            "FAVORITO TEXT)";

    private static final String TABLA_LIBROS= " CREATE TABLE LIBROS (" +
            "IDLIBRO INTEGER PRIMARY KEY," +
            "IDDATOS TEXT,"+
            "TITULO TEXT, " +
            "AUTOR TEXT, " +
            "EDITORIAL TEXT, " +
            "DESCRIPCION TEXT, " +
            "CATEGORRIA TEXT, " +
            "URL TEXT)";

    public DeveloperuBD(Context context, String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
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
            bd.execSQL("INSERT INTO DATOS VALUES('"+id+"','"+usuario+"','"+contraseña+"','"+correo+"','"+celular+"','"+nuPelicula+"')");
            bd.close();
        }
    }
    public void agredarPeliculas(Integer i,String idDat, String titulo, String autor, String editorial, String descripcion,String categoria, int URL){
        SQLiteDatabase bd= getWritableDatabase();
        if(bd!= null){
            bd.execSQL("INSERT INTO LIBROS VALUES('"+i+"','"+idDat+"','"+titulo+"','"+autor+"','"+editorial+"','"+descripcion+"','"+categoria+"','"+URL+"')");
            bd.close();
        }
    }
}
