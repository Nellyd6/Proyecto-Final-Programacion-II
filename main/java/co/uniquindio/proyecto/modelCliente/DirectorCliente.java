package co.uniquindio.proyecto.modelCliente;


public class DirectorCliente {
    
private ClienteBuilder builder;

    public DirectorCliente(ClienteBuilder builder) {
        this.builder = builder;
    }

    public Cliente construirCliente(String nombre, String telefono, String id, String correo, String direccion) {
        builder.nombre(nombre);
        builder.telefono(telefono);
        builder.id(id);
        builder.correo(correo);
        builder.direccion(direccion);
        return builder.build();
    }

}
