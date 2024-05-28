package co.uniquindio.proyecto.util;

public class AssertionUtil {
    public static void assertion(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
