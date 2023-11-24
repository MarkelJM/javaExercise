public class Person {
    String name;
    String surname1;
    String surname2;
    int age;
    int birthYear;

    Person(String name, String  surname1, String surname2, int age, int birthYear){
        this.name = name;
        this.surname1= surname1;
        this.surname2= surname2;
        this.age = age;
        this.birthYear = birthYear;
    }

    public String getName(){
        return this.name;
    }

    public String getFirstSurname(){
        return  this.surname1;
    }

    public int getAge(){
        return this.age;
    }

}
