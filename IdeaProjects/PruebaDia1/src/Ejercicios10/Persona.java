package Ejercicios10;
/*
Se requiere un programa que modele el concepto de una persona. Una persona posee nombre,
apellido, número de documento de identidad y año de nacimiento. La clase debe tener un
constructor que inicialice los valores de sus respectivos atributos.
La clase debe incluir los siguientes métodos:
1. Definir un método que imprima por pantalla los valores de los atributos del objeto.
2. En el método main se deben crear dos personas y mostrar los valores de sus
atributos por pantalla.
 */
public class Persona {

        private String name;
        private String apellido;
        private String dni;
        private int año;

        Persona(String name, String apellido, String dni, int año){
            this.name = name;
            this.apellido = apellido;
            this.dni = dni;
            this.año = año;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }
        public String getSurname() {
            System.out.println(apellido);
            return apellido;
        }
        public String getDNI() {
            System.out.println(dni);
            return dni;
        }
        public int getYear() {
            System.out.println(año);
            return  año;

        }



}

