import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Predicate que verifica si un número es par
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        // Usar el metodo test()
            //true
        System.out.println(esPar.test(2));
            //false
        System.out.println(esPar.test(3));

        // Function que recibe un String y devuelve su longitud
        Function<String, Integer> longitud = texto -> texto.length();

        //usar aply
        System.out.println(longitud.apply("hola"));
        System.out.println(longitud.apply("Prueba"));

        // Consumer que imprime el número
        Consumer<Integer> numeroConsola = numero -> System.out.println(numero);

        //usar accept
        numeroConsola.accept(8);
        numeroConsola.accept(12);

        // Supplier que devuelve un número aleatorio
        Supplier<Double> numeroRamdom = () -> Math.random();

        //usar get
        System.out.println(numeroRamdom.get());
        System.out.println(numeroRamdom.get());


        List<String> textos = new ArrayList<>();
        textos.add("aa");
        textos.add("juan");
        textos.add("perro");
        textos.add("auto");

        // Ordenar por longitud (de menor a mayor)
        textos.sort((a,b) -> a.length() - b.length());
        System.out.println(textos);


        // Variantes Primitivas
        ToIntFunction<String> longitudPrimitiva = texto -> texto.length();
        IntPredicate esParPrimitivo = numero -> numero % 2 ==0;
        int largo = longitud.apply("Hola");
        boolean resultado = esPar.test(10);
        //Ejercicio 2.1 (Creación y Extracción)
        long conteo = Stream.of(2,5,3,3,6,2,4).distinct().skip(1).limit(3).count();
        //Ejercicio 2.2 (Filtrado y Procesamiento Intermedio)
        long numeros = Stream.of(2,5,3,7,1,4).filter(s->s>3).peek(n-> System.out.println(n)).count();


        //Ejercicio 3.1 (Transformación con Map)
        Stream.of("Juan", "Maria", "Ana").map(s->s.toLowerCase()).forEach(s-> System.out.println(s));
        //Ejercicio 3.2 (Map a tipos primitivos)
        Stream.of("Juan", "Maria", "Ana").mapToInt(s->s.length()).sum();
        //Ejercicio 3.3 (Aplanamiento con flatMap)
        List<List<String>> datos = Arrays.asList(
                Arrays.asList("Juan","Maria"),
                Arrays.asList("Ana","Pedro"),
                Arrays.asList("Lucia","jose")
        );
        long cantidad = datos.stream().flatMap(l->l.stream()).filter(nombre->nombre.length()>4).count();

        //Ejercicio 3.4 (Ordenación)
        //orden alfabetico
        Stream.of("Juan", "Maria", "Analia").sorted().forEach(s-> System.out.println(s));

        //orden longitud
        Stream.of("Juan", "Maria", "Analia").sorted((a,b)->a.length()-b.length()).forEach(s-> System.out.println(s));

        //Ejercicio 4.1 (Comprobaciones lógicas)
        System.out.println("Prueba anyMatch, allMatch, noneMatch");
        System.out.println(Stream.of(2, 5, 7, 3, 6, 2, 3).anyMatch(n -> n > 5));
        System.out.println(Stream.of(2, 5, 7, 3, 6, 2, 3).allMatch(n -> n > 5));
        System.out.println(Stream.of(2, 5, 7, 3, 6, 2, 3).noneMatch(n -> n > 5));

        //Ejercicio 4.2 (Búsqueda y Clase Optional)
       Optional<Integer> numPar = Stream.of(2, 5, 7, 3, 6, 2, 3).filter(n->n %2==0).findFirst();
       if (numPar.isPresent()){
           System.out.println("Primer numero par "+numPar.get());
       }else {
           System.out.println("No hay numeros pares");
       }

       //Ejercicio 4.3 (Reducción)
        Optional<Integer> suma = Stream.of(2, 5, 7, 3, 6, 2, 3).reduce((a,b)-> a + b);
        if (suma.isPresent()){
            System.out.println("El resultado es " + suma.get());
        }else {
            System.out.println("No hay numeros para sumar");
        }

        //Ejercicio 4.4 (Reducción a Colección)
        Stream.of(2,5,3,3,6,2,4).distinct().collect(Collectors.toList());

        List<Persona> personas = List.of(new Persona(1,"Juan"), new Persona(2,"Pedro"), new Persona(3, "Ana"));
        Map<Integer, String>mapa= personas.stream().collect(Collectors.toMap(p->p.getDni(),p->p.getNombre()));
    }
}