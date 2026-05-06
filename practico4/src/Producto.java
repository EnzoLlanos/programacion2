public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio del producto debe ser mayor a cero. Precio recibido: $" + precio);
        }

        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Producto creado: " + nombre + " - $" + precio);
    }

    public double getPrecio() {
        return precio;
    }
}
