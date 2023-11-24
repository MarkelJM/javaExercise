/*
Ejercicio 27: Ordenar Lista de Objetos:
Crea una clase Persona con campos como nombre, edad, etc. Crea un programa que tenga una
lista de objetos de tipo Persona y ordene la lista según algún criterio (por ejemplo, por edad).
 */

import java.util.*;

public class Family {
    public static void main(String[] args) {
        List<Person> listFamily = new ArrayList<>();

        Person persona1 = new Person("Markel", "Juaristi", "Mendarozketa", 31, 1992);
        listFamily.add(persona1);
        Person persona2 = new Person("Maite", "del Corte", "Sanz", 32, 1991);
        listFamily.add(persona2);
        Person persona3 = new Person("Lai", "del Corte", "Juaristi", 13, 2010);
        listFamily.add(persona3);
        Person persona4 = new Person("Aitor", "Juaristi", "Mendarozketa", 31, 1992);
        listFamily.add(persona4);
        Person persona5 = new Person("Xabi", "Juaristi", "Mendarozketa", 34, 1989);
        listFamily.add(persona5);
        //opcion1
        //Collections.sort(listFamily, Comparator.comparing(Person::getAge));

        //opcion2
        listFamily.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        listFamily.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));




        for(Person person: listFamily){
            System.out.println(person.getAge());;
        }

    }


}
