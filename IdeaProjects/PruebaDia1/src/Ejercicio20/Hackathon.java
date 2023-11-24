package Ejercicio20;

import java.util.Scanner;
public class Hackathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero de equipos");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            scanner.next();
        }
        int numberOfTeams = scanner.nextInt();

        Team[] grupos = createAllTeams(scanner, numberOfTeams);
        completeHachathon(scanner, grupos);

        scanner.close();
    }

    public static Team createTeam(Scanner scanner) {
        System.out.println("Introduce nombre de equipo");
        String nameTeam = scanner.nextLine();

        System.out.println("Introduce nombre de Universidad");
        String universityTeam = scanner.nextLine();

        System.out.println("Introduce lenguaje");
        String languageTeam = scanner.nextLine();

        System.out.println("Introduce número de miembros");
        int sizeTeam = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea restante

        Team oneTeam = new Team(nameTeam, universityTeam, languageTeam, sizeTeam);
        return oneTeam;
    }

    public static Team[] createAllTeams(Scanner scanner, int number) {
        Team[] equipos = new Team[number];
        for (int i = 0; i < number; i++) {
            equipos[i] = createTeam(scanner);
        }
        return equipos;
    }

    public static void completeHachathon(Scanner scanner, Team[] equipos) {
        for (int pos = 0; pos < equipos.length; pos++) {
            addMemberToTeam(scanner, equipos[pos]);
        }
    }

    public static Programmer createProgrammer(Scanner scanner) {
        System.out.println("Introduce nombre del programador");
        String nameProgrammer = scanner.nextLine();
        System.out.println("Introduce apellido del programador");
        String surnameProgrammer = scanner.nextLine();

        return new Programmer(nameProgrammer, surnameProgrammer);
    }

    public static void addMemberToTeam(Scanner scanner, Team equipo) {
        int number = 0;
        while (number <= equipo.teamSize) {
            Programmer member = createProgrammer(scanner);
            equipo.addMember(member);
            number++;
        }
    }
}


/*
Se requiere un constructor que inicialice los atributos del equipo. El equipo está conformado por
varios programadores, mínimo dos y máximo tres. Cada programador posee nombre y apellidos.
Se requieren además los siguientes métodos:
• Un método para determinar si el equipo está completo.
• Un método para añadir programadores al equipo. Si el equipo está lleno se
debe imprimir la excepción correspondiente.
• Un método para validar los atributos nombre y apellidos de un programador
para que reciban datos que sean solo texto. Si se reciben datos numéricos
se debe generar la excepción correspondiente. Además, no se permiten que
los campos String tengan una longitud igual o superior a 20 caracteres.
• En un método main se debe crear un equipo solicitando sus datos por
teclado y se validan los nombres y apellidos de los programadores
 */


/*
public class Hackathon {
    public static void main(String[] args) {

        System.out.println("Introduce un numero de equipos");
        Scanner teams = new Scanner(System.in);

        //array de teams
        int numberOfTeams = (teams.nextInt());

        Team[] grupos = createAllTeams(numberOfTeams);
        completeHachathon(grupos);




    }
    //Gneramos equipo
    public static Team createTeam(){

        System.out.println("Introduce nombre de equipo");
        Scanner nameGroup = new Scanner(System.in);
        String nameTeam = (nameGroup.nextLine());
        nameGroup.close();

        System.out.println("Introduce nombre de Universidad");
        Scanner universityGroup = new Scanner(System.in);
        String universityTeam = (universityGroup.nextLine());
        universityGroup.close();

        System.out.println("Introduce lenguaje");
        Scanner languageGroup = new Scanner(System.in);
        String languageTeam = (languageGroup.nextLine());
        languageGroup.close();

        System.out.println("Introduce número de miembros");
        Scanner sizeGroup = new Scanner(System.in);
        int sizeTeam = (sizeGroup.nextInt());
        sizeGroup.close();

        Team oneTeam = new Team(nameTeam, universityTeam, languageTeam, sizeTeam);
        return oneTeam;
    }

    //Generamos todos los equipos
    public static Team[] createAllTeams(int number){
        Team[] equipos = new Team[number];
        for(int i = 0; i <= number; i++){
            equipos[i] = createTeam();

        }
        return equipos;

    }

    public static void completeHachathon(Team[] equipos){
        for(int pos = 0;  pos<= equipos.length; pos++){
            addMemberToTeam(equipos[pos]);
        }

    }

    //Métodos crear participantes
    public static Programmer createProgrammer(){

        System.out.println("Introduce nombre programador");
        Scanner nombreProgrammer = new Scanner(System.in);
        System.out.println("Introduce apellido programador");
        Scanner apellidoProgrammer = new Scanner(System.in);
        boolean flag = true;
        Programmer oneMember = null;

        while (flag) {

            try {
                String nameProgrammer = (nombreProgrammer.nextLine());
                String surnameProgrammer = (apellidoProgrammer.nextLine());

                if (isNotNull(nameProgrammer) && isNotNull(apellidoProgrammer) && isLengthOk(surnameProgrammer) && isLengthOk(nameProgrammer)) {

                    oneMember = new Programmer(nameProgrammer, surnameProgrammer);
                    nombreProgrammer.close();
                    apellidoProgrammer.close();
                    flag = false;
                    return oneMember;


                }

            } catch (Exception e) {
                System.out.println("introduce nombre válido  ");

            }

        }
        return oneMember;


    }

    //agregamos miembros a equipos
    public static  Team addMemberToTeam( Team equipo){
        //donde equipos debemos instanciar el metodo estatico allTeams!!
        for(int person = 0; person<= equipo.teamSize; person++){
            Programmer member = createProgrammer();
            equipo.addMember(member);
        }

        return equipo;

    }

    //validadores
    public static boolean isLengthOk(String word){
       int wordLong = word.length();
       if (wordLong <= 20){
           return true;
       } else{
           return false;
       }
    }

    public static boolean isNotNull(Object valueField) {
        //primero comprueba si es null. si no es null comprueba si es de la clase String, si es String comprueba que no sea vacia
        if (valueField == null || (valueField.getClass().equals(String.class) && ((String) valueField).isEmpty())) {
            return false;
        }
        return true;
    }




}
*/