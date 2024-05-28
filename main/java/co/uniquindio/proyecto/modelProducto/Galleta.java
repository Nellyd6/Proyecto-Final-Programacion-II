package co.uniquindio.proyecto.modelProducto;

public class Galleta extends Producto{
    
    

    public Galleta() {
        // Llama al constructor de la superclase para inicializar los atributos heredados
        super();
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.setPrecio(nuevoPrecio); // Usa el método setter de la superclase para actualizar el precio
    }

    @Override
    public String descripcion() {
        return "Descripción del postre";
    }

}
