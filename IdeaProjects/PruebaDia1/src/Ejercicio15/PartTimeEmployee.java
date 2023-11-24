package Ejercicio15;

public class PartTimeEmployee extends Employe{

    double workedHours;
    PartTimeEmployee(String name, int age, double salary, double workedHours){
        super(name,age,salary);
        this.workedHours = workedHours;
    }

    public double calculateSalary(){
        double earnMoney = salary * workedHours;
        return  earnMoney;
    }

    public void showData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(calculateSalary());
    }

}
