import java.util.*;

public class Main {
    public static void main(String[] args) {
       //array de 5 elementos
        int array[]=new int[5];
        //Asigna valores a cada posición usando el índice correspondiente.
       array[0]=1;
       array[1]=2;
       array[2]=5;
       array[3]=3;
       array[4]=4;
    //Actualiza el valor del tercer elemento
       array[3]=55;
    //luego recupera el último elemento utilizando el atributo length para calcular su índice.
       int indice= array.length - 1;
        System.out.println(array[indice]);

        // arreglo de tipo String con nombres desordenados.
        String nombres[]= {"Lucas", "Ana", "Pedro", "Juan", "Maria"};
        // metodo estático Arrays.sort()
        Arrays.sort(nombres);

        //metodo Arrays.binarySearch()
        String nombreBuscado = "Ana";
        int posicion = Arrays.binarySearch(nombres,nombreBuscado);

        //ArrayList de tipo String
        ArrayList<String> lista = new ArrayList<>();
        //metodo add()
        lista.add("a");
        lista.add("b");
        lista.add("c");

        lista.set(2, "nuevo");

        //get() para recuperar el primer valor
        String obtenerNombre = lista.get(0);
        System.out.println(obtenerNombre);
        //remove() para eliminar el último.
        lista.remove(1);


        //fábrica List.of()
        List<String> listaInmutable = List.of("a","b","c");
        // crear una lista mutable
        LinkedList<String> listaMutable = new LinkedList<>(listaInmutable);
        // inserciones en el medio de la lista
        listaMutable.add(2,"g");


        //Instancia un HashSet de tipo Integer
        HashSet<Integer> hash = new HashSet<>();
        //Utiliza el metodo add() para intentar insertar el mismo número tres veces
        hash.add(1);
        hash.add(1);
        hash.add(1);
        hash.add(4);
        //verifica usando el metodo size() que solo se almacenó una vez.
        System.out.println(hash.size());

        //Comprueba si un número existe usando contains()
        boolean contiene = hash.contains(3);
        if (contiene){
            System.out.println("Contiene el numero");
        }else {
            System.out.println("no contiene el numero");
        }

        //elimínalo usando remove().
        hash.remove(4);

        //Crea una colección ArrayDeque.
        ArrayDeque<String> cola= new ArrayDeque<>();
        // métodos addFirst() para agregar al inicio
        cola.addFirst("a");
        cola.addFirst("f");
        //addLast() para agregar al final
        cola.addLast("b");

        //recupera y elimina los elementos de los extremos utilizando removeFirst() y removeLast()
        String firts = cola.removeFirst();
        String last = cola.removeLast();
        System.out.println("El primero es " + firts + " .El ultimo es "+ last);

        //HashMap que asocie usuario (tipo Integer) con sus nombres (tipo String)
        HashMap<Integer,String> usuarios = new HashMap<>();
        //Utiliza el metodo put() para agregar
        usuarios.put(1,"Juan");
        usuarios.put(2,"Raul");
        usuarios.put(3,"Maxi");
        System.out.println("Usuarios; "+usuarios);

        //Recupera un nombre pasando su identificador al metodo get()
        String nombre = usuarios.get(2);
        System.out.println(nombre);
        //actualiza un nombre existente empleando el metodo replace()
        usuarios.replace(3, "Ana");
        // utiliza remove() pasando la clave para eliminar un registro.
        usuarios.remove(1);

        //instancia un TreeMap
        TreeMap<Integer,String> personas = new TreeMap<>();
        ////Utiliza el metodo put() para agregar
        personas.put(1,"raul");
        personas.put(2,"jorge");
        personas.put(3, "oscar");

        //Utiliza el metodo keySet() para obtener todas las claves y recórrelas.
        for (Integer clave: personas.keySet()){
            System.out.println("ID: "+clave+" - Nombre: "+personas.get(clave));
        }

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("juan",49));
        empleados.add(new Empleado("jorge",38));
        empleados.add(new Empleado("Ana", 34));

        // Ordenar usando compareTo()
        Collections.sort(empleados);

        System.out.println("Empleados Ordenados");

        for (Empleado e : empleados) {
            System.out.println("nombre: "+e.getNombre() + " - edad: "+e.getEdad());
        }

        // Ordenar por nombre usando Comparator
        Collections.sort(empleados, new ComparadorNombre());

        System.out.println("Ordenados por nombre:");
        for (Empleado e : empleados) {
            System.out.println("nombre: "+e.getNombre() + " - edad: "+e.getEdad());
        }
    }

}