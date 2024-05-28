package co.uniquindio.proyecto.modelProducto;


public class FabricaPanDulce {
    
public static PanDulce crearPanDulce(PanDulceBuilder builder, String nombre, String iD, double precio) {
        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);
        return (PanDulce) builder.build(); 
    }

}
