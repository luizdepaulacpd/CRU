package com.example.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String nome="banco.db";
    private static final int version=1;

    public Conexao(@Nullable Context context) {
        super(context, nome,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table  Pessoa(id integer primary key autoincrement," +
                "nome varchar(50), cpf varchar(50) , telefone varchar (50) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
