package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class Controller {
    @Autowired
    ProductoService productoService;

    @GetMapping()
    public List<ProductosEntity> Listar(){
        List<ProductosEntity> Lista = productoService.Listar();
        return Lista;
    }

    @GetMapping("/{id}")
    public ProductosEntity Buscar(@PathVariable Long id){
    	ProductosEntity busqueda = productoService.Buscar(id);

        return busqueda;
    }

    @PostMapping("/{crear}")
    public void Crear(@RequestBody ProductosEntity productos){
    	productoService.Crear(productos);
    }

    @GetMapping("/{actualizar}")
    public ProductosEntity Actualizar(@RequestBody ProductosEntity productos){
    	ProductosEntity actualizar = productoService.Actualizar(productos);
        return actualizar;
    }

    @GetMapping("/{borrar}/{id}")
    public void Borrar(@PathVariable long id){
    	productoService.Borrar(id);
    }
}
