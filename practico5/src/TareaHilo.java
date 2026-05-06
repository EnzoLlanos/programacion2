public class TareaHilo extends Thread{


    public TareaHilo(String nombre) {
        super(nombre);
    }
    @Override
    public void run(){
        for (int i = 1; i <=5; i++){
            System.out.println(getName() + " - numero: "+i);

            Thread hilo = Thread.currentThread();
            System.out.println("Hilo: " + hilo.getName() + " | Prioridad: " + hilo.getPriority() + " | Numero: "+ i);

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(getName() + " fue interrumpido");
            }
        }
    }
}
