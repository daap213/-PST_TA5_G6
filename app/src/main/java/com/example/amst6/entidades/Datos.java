package com.example.amst6.entidades;

import java.io.Serializable;

public class Datos implements Serializable {
    private String id;
    private String usuario;
    private String contraseña;
    private String correo;
    private String celular;
    private String nuPelicula;

    public Datos(String id, String usuario, String contraseña, String correo, String celular, String nuPelicula) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.celular = celular;
        this.nuPelicula = nuPelicula;
    }
    public Datos(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNuPelicula() {
        return nuPelicula;
    }

    public void setNuPelicula(String nuPelicula) {
        this.nuPelicula = nuPelicula;
    }
}
