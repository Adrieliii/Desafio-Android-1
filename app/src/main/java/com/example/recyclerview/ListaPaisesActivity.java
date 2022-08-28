package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.ListaPaisesAdapter;
import com.example.recyclerview.dao.PaisDAO;
import com.example.recyclerview.model.Pais;

import java.util.List;

public class ListaPaisesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
    }

    private void configuraLista() {
        RecyclerView listaDePaises = findViewById(R.id.lista_paises_recyclerview);
        final List<Pais> pais = new PaisDAO().lista();
        listaDePaises.setAdapter(new ListaPaisesAdapter(pais, this));
        listaDePaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // não entendi como substituir esse comando no Recyclerview
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Pais pacoteClicado = pais.get(posicao);
                vaiParaResumoPacote(pacoteClicado);
            }
        });
    }


    //@Override
   // public void onNoteClick(int position) {
    //    get(position);
      //  Intent intent = new Intent(this, DetalhePaisActivity.class);
     //   startActivity(intent); (aqui tentei uma tentativa para a funcionalidade do setOnItemClickListener)
    //}
}