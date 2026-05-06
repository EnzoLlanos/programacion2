public class TareaRunnable implements Runnable{
    private String nombreTarea;

    public TareaRunnable(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
    @Override
    public void run() {
        for (int i = 1; i<= 5; i++){
            System.out.println(nombreTarea + " --  Numero: " + i + " [" + Thread.currentThread().getName() + "]");

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(nombreTarea + "Fue Intrerrumpido");
            }
        }

    }

}
