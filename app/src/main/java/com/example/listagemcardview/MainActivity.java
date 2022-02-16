package com.example.listagemcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.listagemcardview.adapter.Adapter;
import com.example.listagemcardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadPostagens();

        recyclerView = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(postagems);

        //configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    private void loadPostagens() {
        Postagem postagem = new Postagem("Tiago Almeida", "16:45 15/02/2021", "viagem loca", R.drawable.imagem1);
        postagems.add(postagem);

         postagem = new Postagem("Tiago Almeida", "16:45 15/02/2021", "viagem loca", R.drawable.imagem2);
        postagems.add(postagem);

         postagem = new Postagem("Tiago Almeida", "16:45 15/02/2021", "viagem loca", R.drawable.imagem3);
        postagems.add(postagem);

         postagem = new Postagem("Tiago Almeida", "16:45 15/02/2021", "viagem loca", R.drawable.imagem4);
        postagems.add(postagem);

         postagem = new Postagem("Tiago Almeida", "16:45 15/02/2021", "viagem loca", R.drawable.imagem2);
        postagems.add(postagem);
    }
}