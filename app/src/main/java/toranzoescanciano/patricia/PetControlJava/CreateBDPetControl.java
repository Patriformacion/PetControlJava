package toranzoescanciano.patricia.PetControlJava;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*Comentario de Triiis21*/
public class CreateBDPetControl extends SQLiteOpenHelper {
    //---Variables estáticas
    //Nombre de la BD
    public static final String NOMBRE_BD = "PetControl.sdb";
    //Versión de la BD
    public static final int VERSION = 1;
    //Nombre de la tabla (tantas como necesitemos)
    public static final String OWNERS = "Propietarios";
    public static final String PETS = "Mascotas";

    public static final String VISITS = "CitasMedicas";

    public static final String REMINDER = "Recordatorios";
    //Atributos o campos de la tabla
    private static final String CODIGO = "codigo";
    private static final String TITULO = "titulo";
    private static final String AUTOR = "autor";
    //private static final int NUM_PAGINAS = 0;

    /*
    //---Tabla Usuarios
    private static final String ID = "id";
    private static final String NOMBRE = "nombre";
    */

    //Constructor
    public CreateBDPetControl(Context context) {
        super(context, NOMBRE_BD, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Creamos la tabla Libros con las columnas: código, título y autor + num_paginas
        /*db.execSQL("CREATE TABLE if not exists Libros (codigo integer primary key autoincrement " +
                "not null, titulo text, autor text);");*/

        db.execSQL("CREATE TABLE if not exists " + OWNERS + "(" + CODIGO + " text primary key, " +
                TITULO + " text, " + AUTOR + " text);");


        /*db.execSQL("CREATE TABLE if not exists " + TABLA + "(" + CODIGO + " text primary key, " +
                TITULO + " text, " + AUTOR + " text, " + NUM_PAGINAS + " int);");*/

        /*
        db.execSQL("CREATE TABLE if not exists " + TABLA2 + "(" + ID + " integer primary key " +
                "autoincrement not null, " + NOMBRE + " text);");
         */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
