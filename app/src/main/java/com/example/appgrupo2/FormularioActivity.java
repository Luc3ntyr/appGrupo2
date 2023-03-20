package com.example.appgrupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.appgrupo2.databinding.ActivityFormularioBinding;

public class FormularioActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private ActivityFormularioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        ArrayAdapter<CharSequence> arrayAdaptera = ArrayAdapter.createFromResource(
                this,R.array.servicio, android.R.layout.simple_spinner_item
        );
        arrayAdaptera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> arrayAdapterb = ArrayAdapter.createFromResource(
                this,R.array.mascota, android.R.layout.simple_spinner_item
        );
        arrayAdapterb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spMascota.setAdapter(arrayAdapterb);
        binding.spServicio.setAdapter(arrayAdaptera);
        binding.spMascota.setOnItemSelectedListener(this);
        binding.spServicio.setOnItemSelectedListener(this);
        binding.btnresena.setOnClickListener(this);
        binding.btnlistarReserva.setOnClickListener(this);
        binding.btnReservar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnresena:
                startActivity(new Intent(getApplicationContext(),FormularioActivity.class));
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}