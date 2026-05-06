/**
 * La clase SistemaGestor representa un sistema básico de gestión.
 * Se encarga de manejar configuraciones generales del sistema.
 */
public class SistemaGestor {


    // Constante que define el máximo de conexiones permitidas
    public static final int MAX_CONEXIONES = 10;
    /*
     * Explicación:
     * - static: indica que esta variable pertenece a la clase SistemaGestor
     *   y no a un objeto en particular. Es decir, todas las instancias comparten
     *   el mismo valor.
     *
     * - final: significa que el valor no puede cambiar una vez asignado.
     *   MAX_CONEXIONES siempre será 10 durante toda la ejecución del programa.
     */


    public void mostrar_conexiones(){
        // Variable local para mostrar el valor
        System.out.println("Maximo de conexiones" + MAX_CONEXIONES);
        return;
    }
}
