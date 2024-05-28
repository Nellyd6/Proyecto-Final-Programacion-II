package co.uniquindio.proyecto.modelProducto;

public interface ProductoBuilder {

    void nombre(String nombre);
    void  iD( String iD) ;
    void  precio(double precio);
    

    Producto build();
}
