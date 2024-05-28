package co.uniquindio.proyecto.modelProducto;

import java.time.LocalDate;
import java.util.ArrayList;

public class FabricaPastel {
    
public static Pastel crearPastel(PastelBuilder builder, String nombre, String iD, double precio) {
        builder.nombre(nombre);
        builder.iD(iD);
        builder.precio(precio);
        return (Pastel) builder.build(); 
    }

}
