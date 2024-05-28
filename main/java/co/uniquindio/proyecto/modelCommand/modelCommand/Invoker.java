package co.uniquindio.proyecto.modelCommand.modelCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Invoker que actúa como el invocador en el patrón de diseño Command.
 * Esta clase es responsable de almacenar y ejecutar comandos.
 */
public class Invoker {

    private List<Command> operaciones = new ArrayList<>();

    /**
     * Método para recibir una operación (comando) y almacenarla en la lista.
     *
     * @param command El comando a ser almacenado.
     */
    public void recibirOperacion(Command command) {
        operaciones.add(command);
    }

    /**
     * Método para ejecutar todas las operaciones (comandos) almacenadas.
     * Después de ejecutar los comandos, la lista de operaciones se limpia.
     */
    public void realizarOperaciones() {
        for (Command command : operaciones) {
            command.execute();
        }
        limpiarOperaciones();
    }

    /**
     * Método para limpiar la lista de operaciones (comandos) almacenadas.
     * Este método se llama después de ejecutar todas las operaciones.
     */
    public void limpiarOperaciones() {
        operaciones.clear();
    }
}
