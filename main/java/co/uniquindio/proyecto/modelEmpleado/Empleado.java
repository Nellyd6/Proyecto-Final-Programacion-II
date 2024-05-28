package co.uniquindio.proyecto.modelEmpleado;

public abstract class Empleado {

    String id;
    String nombre;
    String contraseña;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
