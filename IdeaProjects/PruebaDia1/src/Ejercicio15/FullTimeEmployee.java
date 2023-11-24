package Ejercicio15;

public class FullTimeEmployee extends  Employe{

    String jobPosition;

    FullTimeEmployee(String name, int age, double salary, String jobPosition){
        super(name,age,salary);
        this.jobPosition = jobPosition;
    }

    public double calculateSalary(){
        double bono = 1.1;
        return  bono;
    }

    public void showData(){
        System.out.println(name);
        System.out.println(age);
        //System.out.println(calculateSalary());
        System.out.println(jobPosition);
    }
}
