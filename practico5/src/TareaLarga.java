public class TareaLarga extends Thread {


    @Override
    public void run(){
        try {
            System.out.println("Hilo iniciado");
            for (int i=1; i <= 5; i++){
                System.out.println("...");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("hilo interrumpido");
        }
    }
}
