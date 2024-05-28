package co.uniquindio.proyecto.modelDecorador;

import co.uniquindio.proyecto.modelProducto.Producto;

public class Vainilla extends DecoradorProducto{

    public Vainilla(Producto productoDecorado){
        super(productoDecorado);
    }
    
    @Override
    public String descripcion(){
        return productoDecorado.descripcion() + ", Vainilla";
    }
   
    
}
