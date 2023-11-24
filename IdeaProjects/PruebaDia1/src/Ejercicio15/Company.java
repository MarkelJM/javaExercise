package Ejercicio15;
/*
Ejercicio 15: Sistema de Gestión de Empleados
Crea un sistema de gestión de empleados utilizando herencia en Java. Define una clase base
llamada Empleado con los siguientes atributos: nombre, edad y salario. Implementa un
constructor y métodos de acceso para estos atributos.
Luego, crea dos clases derivadas: EmpleadoTiempoCompleto y EmpleadoTiempoParcial. La
clase EmpleadoTiempoCompleto debe incluir un atributo adicional para representar el cargo
(por ejemplo, "Desarrollador" o "Gerente"). La clase EmpleadoTiempoParcial debe incluir un
atributo para representar las horas trabajadas por semana.
Ambas clases derivadas deben heredar de la clase base Empleado. Implementa métodos
específicos en cada clase derivada para calcular el salario total de un empleado. Para
EmpleadoTiempoCompleto, el salario total se calcula sumando el salario base más un bono
(por ejemplo, 10% del salario base). Para EmpleadoTiempoParcial, el salario total se calcula
multiplicando las horas trabajadas por una tarifa por hora.
En el programa principal, crea instancias de ambas clases, establece valores para sus atributos
y muestra la información detallada de cada empleado, incluyendo su salario total
 */
public class Company {
    public static void main(String[] args) {
        FullTimeEmployee director = new FullTimeEmployee("Markel", 31, 39000, "Director");
        PartTimeEmployee ettEmployee = new PartTimeEmployee("Paco", 31, 10.3, 40);

        double directorSalary = director.calculateSalary() * director.salary;
        System.out.println(directorSalary);
        System.out.println(director.jobPosition);
        System.out.println(director.name);
        System.out.println(director.age);


        System.out.println(ettEmployee.age);
        System.out.println(ettEmployee.name);
        System.out.println(ettEmployee.salary);

    }
}
