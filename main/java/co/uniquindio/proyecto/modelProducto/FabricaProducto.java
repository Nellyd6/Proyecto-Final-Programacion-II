package co.uniquindio.proyecto.modelProducto;


public class FabricaProducto {
    
    public static Producto crearProducto(ProductoBuilder builder, String nombre, String iD, double precio
        ) {
        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);

        return builder.build(); // Devuelve un objeto de tipo Producto
    }
}
