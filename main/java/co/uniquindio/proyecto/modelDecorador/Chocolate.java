package co.uniquindio.proyecto.modelDecorador;

import co.uniquindio.proyecto.modelProducto.Producto;

public class Chocolate extends DecoradorProducto{

    public Chocolate(Producto productoDecorado){
        super(productoDecorado);
    }
    
    
    @Override
    public String descripcion(){
        return productoDecorado.descripcion() + ", Chocolate";
    }
    
}
