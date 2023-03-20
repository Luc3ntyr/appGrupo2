package com.example.appgrupo2;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Imagen implements Parcelable {
    private Integer id;
    private Integer imagen;
    private String nombre;
    private String ubicación;
    private String fotos;

    public Imagen(Integer id, Integer imagen, String nombre, String ubicación, String fotos) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.ubicación = ubicación;
        this.fotos = fotos;
    }

    protected Imagen(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        if (in.readByte() == 0) {
            imagen = null;
        } else {
            imagen = in.readInt();
        }
        nombre = in.readString();
        ubicación = in.readString();
        fotos = in.readString();
    }

    public static final Creator<Imagen> CREATOR = new Creator<Imagen>() {
        @Override
        public Imagen createFromParcel(Parcel in) {
            return new Imagen(in);
        }

        @Override
        public Imagen[] newArray(int size) {
            return new Imagen[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        if (id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(id);
        }
        if (imagen == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(imagen);
        }
        parcel.writeString(nombre);
        parcel.writeString(ubicación);
        parcel.writeString(fotos);
    }
}
