package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Pais;

import java.util.List;

public class ListaPaisesAdapter extends RecyclerView.Adapter<ListaPaisesAdapter.PaisViewHolder> {

    private final List<Pais> pais;
    private final Context context;

    public ListaPaisesAdapter(List<Pais> pais, Context context){
        this.context = context;
        this.pais = pais;
    }

    @Override
    public ListaPaisesAdapter.PaisViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.item_pais, parent, false);
        return new PaisViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(ListaPaisesAdapter.PaisViewHolder holder, int position) {
        holder.Nomepais.setText((CharSequence) pais.get(position));
    }

    @Override
    public int getItemCount() {
        return pais.size();
    }

    class PaisViewHolder extends RecyclerView.ViewHolder {

        private final TextView Nomepais;
        private final TextView descricao;

        public PaisViewHolder(View itemView) {
            super(itemView);
            Nomepais = itemView.findViewById(R.id.item_pais_titulo);
            descricao = itemView.findViewById(R.id.item_pais_descricao);
        }

    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
