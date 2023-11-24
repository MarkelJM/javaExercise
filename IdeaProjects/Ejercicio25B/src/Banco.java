/*
Ejercicio 25: Sistema de Manejo de Cuentas Bancarias
Crea un programa que simule un sistema de cuentas bancarias. Cada cuenta bancaria tiene un
saldo inicial y permite realizar operaciones como depósitos y retiros. Sin embargo, debes
manejar adecuadamente las excepciones que puedan surgir durante estas operaciones.
Crea una clase CuentaBancaria con los siguientes atributos:
• saldo (double) para almacenar el saldo de la cuenta.
• Implementa un método en la clase CuentaBancaria llamado realizarDeposito que acepte
un parámetro monto (double) y aumente el saldo de la cuenta en esa cantidad. Si el
monto es negativo, lanza una excepción IllegalArgumentException con el mensaje "No
se permiten depósitos negativos".
• Implementa otro método llamado realizarRetiro que acepte un parámetro monto
(double) y disminuya el saldo de la cuenta en esa cantidad. Si el monto es negativo o
mayor que el saldo actual, lanza una excepción IllegalArgumentException con el mensaje
correspondiente.
• En el programa principal, crea una instancia de CuentaBancaria, solicita al usuario que
realice un depósito y un retiro, y muestra el saldo resultante después de cada operación.
Maneja las excepciones de manera adecuada para garantizar que el programa no se
bloquee debido a entradas incorrectas del usuario
 */

public class Banco {
    public static void main(String[] args) {
        try{
            CuentaBancaria cuentaBancaria1 = new CuentaBancaria(25639.5);
            cuentaBancaria1.retirarSaldo(600.9);
            cuentaBancaria1.ingresarSaldo(95.6);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
