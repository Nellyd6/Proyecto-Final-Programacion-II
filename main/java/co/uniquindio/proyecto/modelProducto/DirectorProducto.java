package co.uniquindio.proyecto.modelProducto;


public class DirectorProducto {
    
    private ProductoBuilder builder;

    public DirectorProducto(ProductoBuilder builder) {
    this.builder = builder;
    }

    public Producto construirProducto(String nombre,String iD,double precio){

        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);

        return builder.build();
}
}

