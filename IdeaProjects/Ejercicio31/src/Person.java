public class Person {
    String name;
    int age;
    String city;
    Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public int getAge(){
        return this.age;
    }


}
