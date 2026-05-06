
public class Main {
    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        //LLamada con 3 argumentos
        reporte.var_args("Seccion 1","Seccion 2","Seccion 3");
        //Llamada sin argumentos
        reporte.var_args();

        Documento doc1 = new Factura();
        Documento doc2 = new Recibo();

        doc1.procesar();
        doc2.procesar();


    }

    public static void enviarAImpresion(Exportable documentoExportable){

    }
}