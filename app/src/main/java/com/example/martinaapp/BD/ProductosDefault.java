package com.example.martinaapp.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ProductosDefault extends DBHelper{
    private Context context;

    public ProductosDefault(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public void insertaProductos(){
        DBProductos dbProducto = new DBProductos(context);
        Productos productos= new Productos();
        //Primer registro
        productos.setNombre("Canasta pequeña");
        productos.setDescripcion("Arreglo frutal con 8 fresas aproximadamente, masmelos, vino pequeño y girasoles");
        productos.setVlr_unitario(25000);
        dbProducto.insertarProductos(productos);
        //Segundo registro
        productos.setNombre("Mug");
        productos.setDescripcion("Pocillo con 6 fresas aproximadamente, masmelo y flores");
        productos.setVlr_unitario(13000);
        dbProducto.insertarProductos(productos);
        //Tercer registro
        productos.setNombre("Carretilla");
        productos.setDescripcion("Carretilla con 20 fresas aproximadamente, masmelos, vino mediano y rosas");
        productos.setVlr_unitario(60000);
        dbProducto.insertarProductos(productos);

    }


}
