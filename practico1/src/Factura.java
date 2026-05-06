public class Factura extends Documento implements Exportable, Auditable{

    @Override
    public void procesar(){
        System.out.println("Procesando Factura...");
    }

    public void procesar (boolean esUrgente){

    }

    @Override
    public void exportar(){}
    @Override
    public void registrarAuditoria(){}



}
