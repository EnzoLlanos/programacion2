public class CuentaBancaria {
    private double saldo;
    private int numeroCuenta;


    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        if (deposito<=0){
            System.out.println("Error, el monto no puede ser menor o igual a 0");
            return;
        }
        this.saldo += deposito;
        System.out.println("Dinero depositado, usted deposito: " + deposito);

    }
}
