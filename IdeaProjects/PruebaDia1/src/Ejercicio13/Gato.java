package Ejercicio13;

public class Gato extends Animal{
    String hairColor;
    Gato(String name, int age, String hairColor) {
        super(name, age);
        this.hairColor = hairColor;
    }
    public void giveData(){
        //System.out.println(name);
        //System.out.println(age);
        System.out.println(hairColor);
        getAge();
        getName();
    }

}

