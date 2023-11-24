/*
Ejercicio 28: Gestión de Personas
1. Crea una clase llamada Persona con los siguientes atributos privados:
• nombre (String)
• apellido (String)
• genero (String)
• edad (int)
2. La clase debe tener un constructor que acepte todos los atributos y un constructor
predeterminado sin parámetros.
3. Proporciona métodos de acceso (getters y setters) para cada atributo.
4. En la clase Main, solicita al usuario ingresar los datos de varias personas (por ejemplo, 5
personas).
5. Crea una lista de objetos Persona y almacena en ella las personas ingresadas.
6. Implementa los siguientes métodos estáticos en la clase Main para realizar operaciones
sobre la lista de personas:
• retornarNombreGenero: Imprime el nombre, apellido y género de cada persona.
• retornarPromedioEdades: Calcula y muestra el promedio de las edades de todas las
personas.
• retornarPersonasMasculinas: Muestra la cantidad de personas de género masculino.
• retornarPersonasFemeninas: Muestra la cantidad de personas de género femenino
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPerson {
    public static void main(String[] args) {
        List<Person> listFamily = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            name.toLowerCase();
            String surname = sc.nextLine();
            surname.toLowerCase();

            String gender = sc.nextLine();
            gender.toLowerCase();

            int age = sc.nextInt();
            Person person = new Person(name, surname, gender, age);
            listFamily.add(person);
        }


    }

    public static void getData(Person person) {
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);


    }
    public  static  int getAverageAge(List<Person> list){
        int totalAge = 0;
        for(Person persona: list){
            totalAge = totalAge + getAge(persona);
        }

        int averageAge = totalAge / list.size();
        return averageAge;

    }
    public static int getAge(Person person){
        return person.age;
    }

    public  static  int amountMale(List<Person> list){
        int amountMales = 0;
        for(Person persona: list){
            if(persona.gender == "hombre");
            amountMales++;
        }
        return amountMales;
    }

    public  static  int amountFemale(List<Person> list){
        int amountFemales = 0;
        int totalPerson = list.size();
        int amountMales = amountMale(list);
        amountFemales = totalPerson - amountMales;

        return amountFemales;
    }
}
