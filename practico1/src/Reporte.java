public class Reporte {


    public Reporte(){}
    public void generarEncabezado(){
        System.out.println("Encabezado");
    }
    public String obtenerCuerpo(){
        String texto = "Cuerpo";
        return texto;
    }

    public void var_args(String... secciones){

        if (secciones.length==0){
            System.out.println("No se paso ningun argumento");
            return;
        }

        System.out.println("creando reporte");

        for (String seccion: secciones){
            System.out.println("- " + seccion);
        }
    }
}
