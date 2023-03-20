package com.example.appgrupo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appgrupo2.databinding.ItemListaBinding;

import java.util.List;

public class ImagenAdapter extends RecyclerView.Adapter<ImagenAdapter.ViewHolder> {

    private List<Imagen> lista;

    private Context context;

    public ImagenAdapter(List<Imagen> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemListaBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String cantidadimg = " fotos";
        final Imagen itemImagen = lista.get(position);
        holder.binding.txttitle.setText(itemImagen.getNombre());
        holder.binding.txtdescr.setText(itemImagen.getUbicación());
        holder.binding.imgvista.setImageResource(itemImagen.getImagen());
        if(itemImagen.getFotos()=="1") cantidadimg =" foto";
        holder.binding.txtcantidad.setText(itemImagen.getFotos()+cantidadimg);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemListaBinding binding;
        public ViewHolder(@NonNull ItemListaBinding itemBinding) {
            super(itemBinding.getRoot());
            binding =itemBinding;
        }
    }
}
