/*
Ejercicio 31: Filtrar y Transformar
Supongamos que tienes una lista de objetos Persona con atributos como nombre, edad y ciudad.
Escribe un programa que use Streams para realizar las siguientes operaciones:
1. Filtra las personas que tienen una edad mayor a 25.
2. Transforma el resultado para obtener una lista de cadenas que contienen el nombre y la
ciudad de cada persona
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWork {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
       // List<String> listFilteredData = new ArrayList<>();

        int filterAge = 25;

        Person person1 = new Person("Markel", 31, "Burgos");
        listPerson.add(person1);
        Person person2 = new Person("Maite", 32, "Burgos");
        listPerson.add(person2);
        Person person3 = new Person("lai", 13, "Burgos");
        listPerson.add(person3);
        Person person4 = new Person("Oscar", 31, "Valencia");
        listPerson.add(person4);
        Person person5 = new Person("Aitor", 31, "Burgos");
        listPerson.add(person5);
        Person person6 = new Person("Idoia", 26, "Vitoria");
        listPerson.add(person6);




        //Stream<Person> streamDeLista = listPerson.stream();
        //Stream streamBuilder = listPerson.stream().filter(person ->person.getAge() > filterAge).map(person ->person.getName() + " - " +person.getCity()).collect(Collectors.toList());
        List<String> streamBuilder = listPerson.stream().filter(person ->person.getAge() < filterAge).map(person ->person.getName() + " - " +person.getCity()).collect(Collectors.toList());
        System.out.println(streamBuilder);



    }


}
