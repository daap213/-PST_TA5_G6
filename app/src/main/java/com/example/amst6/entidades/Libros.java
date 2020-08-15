package com.example.amst6.entidades;

import java.io.Serializable;

public class Libros implements Serializable {
    private String idpel;
    private String titulo;
    private String autor;
    private String editorial;
    private String descripcion;
    private String categoria;
    private int URL;

    public Libros(String idpel, String titulo, String autor, String editorial, String descripcion, String categoria, int URL) {
        this.idpel = idpel;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.URL = URL;
    }
    public Libros(){

    }

    public String getIdpel() {
        return idpel;
    }

    public void setIdpel(String idpel) {
        this.idpel = idpel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getURL() {
        return URL;
    }

    public void setURL(int URL) {
        this.URL = URL;
    }
}
