package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductoServicioImpl implements ProductoService{
    public static AtomicLong sequence =new AtomicLong();
    private static List<ProductosEntity> Lista =new ArrayList<ProductosEntity>(){{
        add(new ProductosEntity(sequence.incrementAndGet(),"audifonos,","sony","bluetooth","100"));
        add(new ProductosEntity(sequence.incrementAndGet(),"audifonos","apple", "inalambricos","500"));
    }};

    @Override
    public List<ProductosEntity> Listar() {
        return Lista;
    }

    @Override
    public ProductosEntity Buscar(long id) {
        for(ProductosEntity busqueda: Lista){
            if(busqueda.getId()==id)
                return busqueda;
        }
        return null;
    }

    @Override
    public void Crear(ProductosEntity nuevoproducto) {
        nuevoproducto.setId(sequence.incrementAndGet());
        Lista.add(nuevoproducto);
    }

    @Override
    public ProductosEntity Actualizar(ProductosEntity actualizarproducto) {
        for(ProductosEntity actualizar: Lista){
            if(actualizar.getId()== actualizarproducto.getId()){
                actualizar.setNombre(actualizarproducto.getNombre());
                actualizar.setMarca(actualizarproducto.getMarca());
                actualizar.setDescripcion(actualizarproducto.getDescripcion());
                actualizar.setPrecio(actualizarproducto.getPrecio());
                return actualizar;
            }
        }
        return null;
    }

    @Override
    public void Borrar(long id) {
        for(ProductosEntity borrar: Lista){
            if(borrar.getId()==id){
                Lista.remove(borrar);
            }
        }
    }
}
