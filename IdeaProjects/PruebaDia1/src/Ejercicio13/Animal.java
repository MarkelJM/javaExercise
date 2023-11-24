package Ejercicio13;

/*
Ejercicio 13: Sistema de Gestión de Animales
Crea un sistema de gestión de animales utilizando herencia en Java. Define una clase base
llamada Animal con los siguientes atributos: nombre y edad. Implementa un constructor y
métodos de acceso para estos atributos.
Lureego, crea dos clases derivadas: Perro y Gato. Ambas clases deben heredar de la clase base
Animal. La clase Perro debe incluir un atributo adicional para representar la raza del perro, y la
clase Gato debe incluir un atributo para representar el color del pelaje.
En el programa principal, crea instancias de ambas clases, establece valores para sus atributos
y muestra la información básica de cada animal, incluyendo su nombre, edad y características
específicas de la especie
 */
public class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        System.out.println(name);
        return name;
    }
    public int getAge(){
        System.out.println(age);
        return age;
    }

}

