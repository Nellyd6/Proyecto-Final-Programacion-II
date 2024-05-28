package co.uniquindio.proyecto.modelProducto;



public class FabricaPostre {
    
public static Postre crearGalleta(PostreBuilder builder, String nombre, String iD, double precio) {
        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);
        return (Postre) builder.build(); 
    }

}
