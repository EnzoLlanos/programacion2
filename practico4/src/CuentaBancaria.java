public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria (double saldo){
        this.saldo = saldo;
    }

    public void retirar(double monto)throws SaldoInsuficienteException{
        if (monto>saldo){
            throw new SaldoInsuficienteException( "Saldo insuficiente. Saldo actual: $" + saldo + ", Monto solicitado: $" + monto);
        }
        saldo-=monto;
        System.out.println("Retiro exitoso de $" + monto);
    }

    public double getSaldo() {
        return saldo;
    }
}
