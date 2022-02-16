package com.example.listagemcardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listagemcardview.R;
import com.example.listagemcardview.model.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Postagem> listaPostagens;

    public Adapter(List<Postagem> lista) {
        listaPostagens = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new MyViewHolder(itemCard);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = listaPostagens.get(position);
        holder.titleText.setText(postagem.getTitulo());
        holder.dataText.setText(postagem.getData());
        holder.imageView.setImageResource(postagem.getImageId());
        holder.descriptionText.setText(postagem.getDesc());
    }

    @Override
    public int getItemCount() {
        return listaPostagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView titleText, dataText, descriptionText;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.textTitle);
            dataText = itemView.findViewById(R.id.textData);
            descriptionText = itemView.findViewById(R.id.textDesc);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
