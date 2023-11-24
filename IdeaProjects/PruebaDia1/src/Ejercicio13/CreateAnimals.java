package Ejercicio13;

public class CreateAnimals {
    public static void main(String[] args) {
        Gato myCat = new Gato("Michi", 5, "Brown");
        Perro myDog = new Perro("Lai", 13, "White and Black");

        //show data
        myCat.giveData();
        myDog.giveData();
    }

}
