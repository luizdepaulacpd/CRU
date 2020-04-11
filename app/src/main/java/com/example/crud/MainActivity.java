package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private PessoaDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        cpf= findViewById(R.id.editCpf);
        telefone= findViewById(R.id.editTelefone);
        dao=new PessoaDAO(this);


    }

    public void salvar (View view){

       Pessoa p = new Pessoa();
       p.setNome(nome.getText().toString());
       p.setCpf(cpf.getText().toString());
       p.setTelefone(telefone.getText().toString());
       long id= dao.inserir(p);

        Toast.makeText(this, "Pessoa Inserido com id:"+id, Toast.LENGTH_SHORT).show();



    }
}
