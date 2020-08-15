package com.example.amst6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amst6.entidades.Datos;
import com.example.amst6.entidades.Libros;

import java.util.ArrayList;
import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.RecyclerHolder> {
    private List<Libros> items;
    private List<Libros> originalItems;

    public PersonaAdapter(List<Libros> items) {
        this.items = items;
        this.originalItems = new ArrayList<>();
        originalItems.addAll(items);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final Libros item = items.get(position);
        holder.imgItem.setImageResource(item.getURL());
        holder.lbTitulo.setText(item.getTitulo());
        holder.lbAutor.setText(item.getAutor());
        holder.lbEditorial.setText(item.getEditorial());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView lbTitulo;
        private TextView lbAutor;
        private TextView lbEditorial;

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);

            imgItem = itemView.findViewById(R.id.imgItem);
            lbTitulo = itemView.findViewById(R.id.lbTitulo);
            lbAutor = itemView.findViewById(R.id.lbAutor);
            lbEditorial= itemView.findViewById(R.id.lbEditorial);
        }
    }

    public interface RecyclerItemClick {
        void itemClick(Libros item);
    }
}
