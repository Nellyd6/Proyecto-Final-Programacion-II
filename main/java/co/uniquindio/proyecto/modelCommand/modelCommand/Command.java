package co.uniquindio.proyecto.modelCommand.modelCommand;


    /**
 * Interfaz Command que define un contrato para la ejecución de comandos.
 * Esta interfaz forma parte del patrón de diseño Command.
 */
public interface Command {

    /**
     * Método que ejecuta el comando.
     * Cada clase que implemente esta interfaz deberá proporcionar su propia
     * implementación del método execute para realizar una acción específica.
     */
    public void execute();
}


