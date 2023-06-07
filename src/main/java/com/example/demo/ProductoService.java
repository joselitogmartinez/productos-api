package com.example.demo;

import java.util.List;

public interface ProductoService {
    public List<ProductosEntity> Listar();
    
    public ProductosEntity Buscar(long id);
    
    public void Crear(ProductosEntity crearProducto);
    
    public ProductosEntity Actualizar(ProductosEntity actualizarProducto);
    
    public void Borrar(long id);
}
