import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 26: Ejercicio de ArrayList
Crea un programa en Java que gestione una lista de nombres mediante un ArrayList. El programa
debe ofrecer las siguientes opciones:
1. Agregar un nombre a la lista.
2. Eliminar un nombre de la lista.
3. Imprimir la lista de nombres.
4. Buscar un nombre en la lista.
5. Salir del programa.
Implementa un menú que permita al usuario seleccionar una de las opciones mencionadas.
Asegúrate de manejar adecuadamente la entrada del usuario y de proporcionar mensajes claros
en cada operación. El programa debe continuar ejecutándose hasta que el usuario elija salir
 */
public class ArrayListPlatform {

    public static void main(String[] args) {
        //List<String> listName = new ArrayList<>(List.of("markel", "maite", "lai"));


        boolean flag = true;



        List<String> listName = new ArrayList<>(List.of("markel", "maite", "lai"));
        System.out.println("He creado una lista con valores, ahora haz lo que quieras");


        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Indica: add, show, remove, search o close");
            String comando = sc.nextLine();
            System.out.println("Añade un nombre");
            String cadena = sc.nextLine();
            switch (comando){
                case "add":
                    addname(cadena, listName);
                    //flag = false;

                    break;
                case "show":
                    showLista(listName);
                    //flag = false;
                    break;
                case "remove":
                    removeName(cadena, listName);
                    //flag = false;
                    break;

                case "search":
                    searchName(cadena,listName);
                    //flag = false;
                    break;

                case "close":
                    flag = false;
                    sc.close();
                    System.out.println("prorama cerrado");
                    break;
                default:
                    System.out.println("añade un comando correcto");
                    flag = false;
                    break;




            }





        }






    }

    public static  List<String> addname(String name, List<String> lista){
        System.out.println("add" + name);

        lista.add(name);
        return lista;

    }
    public static  List<String> removeName(String name, List<String> lista){
        System.out.println("remove" + name);
        lista.remove(name);
        return lista;

    }
    public static  void showLista( List<String> lista){
        System.out.println(lista);
        for(int i= 0; i <= lista.size(); i++){
            System.out.println("showLista");
            System.out.println(lista.get(i));
        }


    }

    public static  void searchName(String name, List<String> lista){
        if(lista.contains(name)){

            System.out.println("yes, there is" + name);

        } else {
            System.out.println("falso");
        }
    }

}
