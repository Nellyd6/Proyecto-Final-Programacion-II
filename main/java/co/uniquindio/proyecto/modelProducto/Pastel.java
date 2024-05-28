package co.uniquindio.proyecto.modelProducto;

public class Pastel extends Producto {
    
    public Pastel() {
        // Llama al constructor de la superclase para inicializar los atributos heredados
        super();
    }

     
    @Override
    public String descripcion() {
        return "Descripción del postre";
    }

}
