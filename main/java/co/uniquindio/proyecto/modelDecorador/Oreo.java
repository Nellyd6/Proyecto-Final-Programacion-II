package co.uniquindio.proyecto.modelDecorador;

import co.uniquindio.proyecto.modelProducto.Producto;

public class Oreo extends DecoradorProducto {

        public Oreo(Producto productoDecorado){
        super(productoDecorado);
    }
    
    @Override
    public String descripcion(){
        return productoDecorado.descripcion() + ", Oreo";
    }
   
    
}
