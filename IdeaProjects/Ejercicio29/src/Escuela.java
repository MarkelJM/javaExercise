/*
Ejercicio 29: Ejercicio con Set
En una aplicación de gestión de estudiantes, se desea mantener un registro de los cursos en los
que están inscritos los estudiantes. Diseña una clase Estudiante con atributos como nombre,
número de estudiante, y un Set que almacene los nombres de los cursos en los que está inscrito
el estudiante. Implementa métodos para agregar un curso, eliminar un curso y mostrar la lista
de cursos de un estudiante específico. Asegúrate de manejar posibles duplicados de cursos para
un estudiante
 */

import java.util.Scanner;

public class Escuela {
    public static void main(String[] args) {

        Asignatura mate = new Asignatura("Matematicas");
        Asignatura fisica = new Asignatura("fisica");
        Asignatura quimica = new Asignatura("quimica");
        Asignatura biologia = new Asignatura("biologia");
        Asignatura bioquimica = new Asignatura("bioquimica");
        Asignatura algebra = new Asignatura("algebra");

        Student student1 = new Student("markel", "123456789");
        Student student2 = new Student("maite", "987654321");

        student1.addAsignatura(mate);
        student1.addAsignatura(fisica);
        student1.addAsignatura(algebra);
        student2.addAsignatura(mate);
        student2.addAsignatura(biologia);
        student2.addAsignatura(bioquimica);
        student1.addAsignatura(quimica);

        System.out.println(student2.name + "  asignaturas");
        student2.showAsignatura();
        System.out.println(student1.name + "  asignaturas");
        student1.showAsignatura();








    }
}
