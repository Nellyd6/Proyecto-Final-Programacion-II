package co.uniquindio.proyecto.modelCliente;

public interface ClienteBuilder {

    void nombre(String nombre);
    void telefono(String telefono);
    void id(String id);
    void correo(String correo);
    void direccion(String direccion);

    Cliente build();
}

