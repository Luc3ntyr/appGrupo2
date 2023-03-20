package com.example.appgrupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.appgrupo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnacceder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String namae = binding.txtname.getText().toString().trim();
        String wordd = binding.txtpass.getText().toString().trim();
        String mssg = "Contrasea incorrecta!";
        if(namae.equals("Grupo2") && wordd.equals("SYS123")){
            startActivity(new Intent(getApplicationContext(),FormularioActivity.class));
        }else{
            if(namae != "Grupo2") mssg="Nombre de usuario incorrecto!";
            Toast.makeText(this, mssg,Toast.LENGTH_LONG).show();
        }
    }

}