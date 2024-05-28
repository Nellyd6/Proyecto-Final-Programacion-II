package co.uniquindio.proyecto.modelDecorador;

import co.uniquindio.proyecto.modelProducto.Producto;

public class Macadamia extends DecoradorProducto{

     public Macadamia(Producto productoDecorado){
        super(productoDecorado);
    }
    
    @Override
    public String descripcion(){
        return productoDecorado.descripcion() + ", Macadamia";
    }
    
    
}
