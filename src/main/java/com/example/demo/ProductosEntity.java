package com.example.demo;

public class ProductosEntity {
    private long Id;
    public String Nombre;
    private String Marca;
    private String Descripcion;
    private String Precio;

    public ProductosEntity(long id, String nombre, String marca, String descripcion, String precio){
        super();
        this.Id = id;
        this.Nombre = nombre;
        this.Marca= marca;
        this.Descripcion = descripcion;
        this.Precio = precio;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        this.Precio = precio;
    }
}
