package co.uniquindio.proyecto.modelProducto;

public abstract class Producto {
    String nombre = "";
    String iD = "";
    double precio = 0;
    
    public abstract String descripcion();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getiD() {
        return iD;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

}
