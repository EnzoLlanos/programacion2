
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1.1 (Extendiendo la clase Thread)
        TareaHilo hilo1 = new TareaHilo("hilo1");
        TareaHilo hilo2 = new TareaHilo("hilo2");
        TareaHilo hilo3 = new TareaHilo("hilo3");

        hilo1.setName("Hilo-Bajo");
        hilo2.setName("Hilo-Alto");
        hilo3.setName("Hilo-medio");

        hilo1.setPriority(1);
        hilo2.setPriority(10);
        hilo3.setPriority(5);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.out.println("Empiezan a ejecutarse");

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Terminan de ejecutarse");


        //Ejercicio 1.2 (Implementando la interfaz Runnable)
        TareaRunnable tarea_1 = new TareaRunnable("Tarea 1");
        TareaRunnable tarea_22 = new TareaRunnable("Tarea 22");
        TareaRunnable tarea_333 = new TareaRunnable("Tarea 333");

        Thread primerHilo = new Thread(tarea_1, "Primer Hilo");
        Thread segundoHilo = new Thread(tarea_22, "Segundo Hilo");
        Thread tercerHilo = new Thread(tarea_333, "Tercer Hilo");

        primerHilo.start();
        segundoHilo.start();
        tercerHilo.start();
        System.out.println("Empiezan a ejecutarse");

        try {
            primerHilo.join();
            segundoHilo.join();
            tercerHilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Terminan de ejecutarse");


        //Ejercicio 2.1 (Simulando una anomalía)
        Contador contador = new Contador();

        Thread hilo33 = new Thread(()-> {
            for (int i = 0; i< 100000; i++){
                contador.incrementar();
            }
        });

        Thread hilo555 = new Thread(()-> {
            for (int i = 0; i< 100000; i++){
                contador.incrementar();
            }
        });

        hilo33.start();
        hilo555.start();


        try {
            hilo33.join();
            hilo555.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("valor final: " + contador.getValor());

        //Ejercicio 4.2 (Espera e Interrupción)
        TareaLarga hilo = new TareaLarga();
        hilo.start();

        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TareaLarga hilointerumpido = new TareaLarga();
        hilointerumpido.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilointerumpido.interrupt();


    }

}