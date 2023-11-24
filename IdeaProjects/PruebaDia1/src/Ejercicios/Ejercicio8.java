package Ejercicios;
/*
Práctica 8: Elementos Duplicados
Crear un programa que, dado un array de números enteros, determine cuales son sus
elementos que se encuentran duplicados. Por ejemplo:
int [] arrayDePrueba = {1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5}
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int contadorB = 0;
        int [] arrayDePrueba = {1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5};
        int [] arrayDuplicados = new int[arrayDePrueba.length];

        for(int b=0; b< arrayDePrueba.length; b++){
            //contadorB++;
            for(int a= b+1; a < arrayDePrueba.length; a++){
                if(arrayDePrueba[b] == arrayDePrueba[a]){
                    arrayDuplicados[b] = arrayDePrueba[b];

                    /*
                    for(int revision: arrayDuplicados){
                        //System.out.println(arrayDuplicados[revision]);
                        if(revision == arrayDePrueba[b]){
                            continue;
                        } else   {
                            arrayDuplicados[i] = arrayDePrueba[i];
                            //System.out.println(arrayDuplicados[i]);

                        }
                    }
                    */

                }
            }
        }

        for(int duplicados = 0; duplicados < arrayDuplicados.length; duplicados++){
            if(arrayDuplicados[duplicados] != 0){
                System.out.println(arrayDuplicados[duplicados]);

            }
        }

    }
}
