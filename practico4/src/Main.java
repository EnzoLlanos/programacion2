import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1.1 (Bloques try/catch y captura de información)
        String cadena = "abc";
        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("Convercion excitosa " + numero);
        }catch (NumberFormatException e){
            System.out.println("Error " + e.getMessage());
        }

        //Ejercicio 1.2 (El bloque finally)
        int numerador = 10;
        int denominador = 0;
        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Error "+ e.getMessage());
        }finally {
            System.out.println("Limpieza final");
        }


        //Ejercicio 2.2 (Uso de mensajes claros y captura específica)
        try {
            registrarUsuario2("Juan",-5);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        //Ejercicio 3.1 (Excepción Checked Personalizada)
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        try {
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        try {
            cuenta.retirar(1000);
        }catch (SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }

        //Ejercicio 3.2 (Excepción Unchecked Personalizada)
            Producto producto1 = new Producto("Cerea", 100);
        try {
            Producto producto2 = new Producto("Leche", -120);
        }catch (ProductoInvalidoException e){
            System.out.println("Error: " + e.getMessage());
        }

        //Ejercicio 4.1 (Manejo de archivos con try-with-resources)
        String nombreArchivo = "personas.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null){
                System.out.println("Linea: " + numeroLinea + ": " + linea);
                numeroLinea++;
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass().getName());
        }



    }

    //Ejercicio 1.3 (Uso de multi-catch)
    public static void procesarNumero(String cadena){
        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("Convercion excitosa " + cadena);

            int resultado = 100/numero;
            System.out.println("100/" + numero);
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException | ArithmeticException e){
            System.out.println("Error en el calculo o convercion");
            System.out.println("Error: " + e.getMessage());

        }
    }

    //Ejercicio 2.1 (Validar entradas y Fallar Rápido / Fail-fast)

    public static void registrarUsuario(String nombre, int edad){
        if (nombre == null){
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        if (nombre.isBlank()){
            throw  new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if (edad<0){
            throw new IllegalArgumentException("La edad no puede ser menor a 0");
        }
    }

    //Ejercicio 2.2 (Uso de mensajes claros y captura específica)
    public static void registrarUsuario2(String nombre, int edad){
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar en blanco");
        }
        if (edad<0){
            throw new IllegalArgumentException("La edad no puede ser menor a 0");
        }
    }


}