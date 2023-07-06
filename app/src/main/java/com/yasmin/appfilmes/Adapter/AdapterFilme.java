package com.yasmin.appfilmes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.yasmin.appfilmes.Model.Filme;
import com.yasmin.appfilmes.R;

import java.util.List;

public class AdapterFilme extends RecyclerView.Adapter<AdapterFilme.FilmeViewHolder> {

    private Context context;
    private List<Filme> filmeList;

    public AdapterFilme(Context context,List<Filme> filmeList) {
        this.context = context;
        this.filmeList = filmeList;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        itemLista = layoutInflater.inflate(R.layout.filme_item,parent,false);
        return new FilmeViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {

        Glide.with(context).load(filmeList.get(position).getCapa()).into(holder.capa);
        holder.titulo.setText(filmeList.get(position).getTitulo());
    }

    @Override
    public int getItemCount() {
        return filmeList.size();
    }

    public class FilmeViewHolder extends RecyclerView.ViewHolder{

        private ImageView capa;
        private TextView titulo;
        private TextView descricao;
        private TextView elenco;

        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);

            capa = itemView.findViewById(R.id.capaFilme);
            titulo = itemView.findViewById(R.id.tituloFilme);
            descricao = itemView.findViewById(R.id.dt_descricaoFilme);
            elenco = itemView.findViewById(R.id.dt_elenco);
        }
    }


}

