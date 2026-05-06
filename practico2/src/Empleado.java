public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Empleado otro) {
        // Orden por edad
        return Integer.compare(this.edad, otro.edad);
    }
}
