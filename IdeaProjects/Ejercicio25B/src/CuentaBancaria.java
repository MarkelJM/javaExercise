public class CuentaBancaria {
    double saldo;
    CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    CuentaBancaria(int saldo){
        this.saldo = (int)saldo;
    }



    public  double retirarSaldo(double amount) throws IllegalArgumentException, ArithmeticException{
        if(amount < 0 || amount > this.saldo){
            throw new IllegalArgumentException(("negativo o mayor que el saldo"));
        }

        return (this.saldo - amount);
    }

    public  double ingresarSaldo(double amount) throws IllegalArgumentException, ArithmeticException{
        if(amount < 0){
            throw new IllegalArgumentException(("negativo"));
        }
        return (this.saldo + amount);
    }
}
