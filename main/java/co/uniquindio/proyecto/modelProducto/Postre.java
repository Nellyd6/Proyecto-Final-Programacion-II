package co.uniquindio.proyecto.modelProducto;


public class Postre extends Producto {

    public Postre() {
        // Llama al constructor de la superclase para inicializar los atributos heredados
        super();
    }


    @Override
    public String descripcion() {
        return "Descripción del postre";
    }

}
