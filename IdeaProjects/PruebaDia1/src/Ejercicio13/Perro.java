package Ejercicio13;

public class Perro extends Animal{
    String raza;
    Perro(String name, int age, String raza) {
        super(name, age);
        this.raza = raza;
    }
    public void giveData(){
        //System.out.println(name);
        //System.out.println(age);
        System.out.println(raza);
        getAge();
        getName();
    }

}
