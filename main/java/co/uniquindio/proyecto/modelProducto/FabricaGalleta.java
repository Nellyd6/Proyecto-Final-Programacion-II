package co.uniquindio.proyecto.modelProducto;


public class FabricaGalleta {
    
public static Galleta crearGalleta(GalletaBuilder builder, String nombre, String iD, double precio) {
        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);
        return (Galleta) builder.build(); 
    }

}
