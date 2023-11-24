public class Person {
    String name = "No name";
    String surname  = "No surname";
    String gender = "No gender";
    int age = 18;
    Person(String name, String surname, String gender, int age){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;

    }

    Person(){

    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }

    public String modifyName(String newName){

        String name = newName;
        return name;
    }
    public String modifySurname(String newSurname){

        String surname = newSurname;
        return surname;
    }public String modifyGender(String newGender){

        String gender = newGender;
        return gender;
    }public int modifyName(int newAge){

        int age = newAge;
        return age;
    }
    public void showData(){
        System.out.println(this.name);
        System.out.println(this.surname);

        System.out.println(this.gender);

        System.out.println(this.age);

    }

}
