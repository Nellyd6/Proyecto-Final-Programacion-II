package co.uniquindio.proyecto.modelDecorador;

import co.uniquindio.proyecto.modelProducto.Producto;

public abstract class DecoradorProducto extends Producto{
    
    protected Producto productoDecorado;

    public DecoradorProducto(Producto productoDecorado) {
        this.productoDecorado = productoDecorado;
    }

    @Override
    public String descripcion(){
        return productoDecorado.descripcion();
    }


}
