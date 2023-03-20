package com.example.appgrupo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.appgrupo2.databinding.ActivityListaBinding;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private ActivityListaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Imagen> lista =new ArrayList<>();

        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo1,"Juan Pérez","Miraflores: Av. Larco 1234, Miraflores,Lima","5"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo2,"Ana López","San Borja: Calle 17 Mz. A Lt. 3, San Borja, Lima","3"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo3,"Carlos García","La Victoria: Jr. Gamarra 789, La Victoria, Lima","1"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo4,"María Fernández","San Isidro: Av. Javier Prado Este 456, San Isidro, Lima","0"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo5,"Luis Torres","Ate: Av. Nicolás Ayllón 2345, Ate, Lima","4"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo6,"Sofía Díaz","Villa el Salvador: Av. Revolución 6789, Villa el Salvador, Lima","4"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo7,"Diego González","Magdalena del Mar: Av. Brasil 4321, Magdalena del Mar, Lima","4"
        ));
        lista.add(new Imagen(
                lista.size() +1, R.drawable.aniamigo8,"Laura Romero","Chorrillos: Av. Huaylas 987, Chorrillos, Lima","4"
        ));
        binding.rvlistaimagenes.setLayoutManager(new LinearLayoutManager(
                ListaActivity.this
        ));
        ImagenAdapter adapter = new ImagenAdapter(lista, ListaActivity.this);
        binding.rvlistaimagenes.setAdapter(adapter);
    }
}