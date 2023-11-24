package Ejercicio17;

public class User implements Autenticable{
    int MAXLENGTH = 20;
    char AT = '@';
    String userName;

    User(String userName){
        this.userName = userName;
    }

    @Override
    public boolean lengthMax(String name) {
        if(name.length() <= MAXLENGTH){
            return true;
        } else {
            return  false;
        }
    }



    @Override
    public boolean hasAtSymbol(String cadena) {
        boolean valor = false;
        for(int i= 0; i <= cadena.length(); i++){
            if(cadena.charAt(i) == AT){
                valor = true;
                break;
            } else{
                valor = false;
            }

        }
        return valor;

    }



}
