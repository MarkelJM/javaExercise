package Ejercicio20;

public class Team {


    int MAXNumberOfTeam = 3;
    int MinNumberOfTeam = 2;
    String name;
    String universityName;
    String language;

    int teamSize;

    Programmer[] arrayTeam = new Programmer[3];

    Team(String name, String universityName, String language, int teamSize){

    }

    public boolean  aceptNewMember(Programmer member){
        if (arrayTeam.length > MAXNumberOfTeam ){
            return false;
        } else {
            return true;
        }
    }

    private int positionInList(Programmer[] arrayProgrammer){
        System.out.println(arrayTeam.length + "arrayTeam");
        System.out.println((arrayProgrammer.length + "arrayProgrammer"));
        return arrayProgrammer.length;
    }

    public Programmer[] addMember(Programmer member){
        if(aceptNewMember(member)){
            int pos = positionInList(arrayTeam);
            arrayTeam[pos -1] = member;
            return arrayTeam;
        } else{
            System.out.println("Lamento comunicarte que el equipo" + name + "está lleno o no disponible");
            return  arrayTeam;
        }
    }
}
