public class Biblioteca {

    ItemBiblioteca[] arrayBilblioteca= new ItemBiblioteca[8];


    int posicionBiblioteca = 0;

    public void estadoMaterial(){
        ItemBiblioteca[] material = this.arrayBilblioteca;
        for(ItemBiblioteca objeto: material){
            objeto.estadoItem();
        }
    }

    public void addArrayBilblioteca(ItemBiblioteca objeto) {
        this.arrayBilblioteca[posicionBiblioteca] = objeto;
        this.posicionBiblioteca++;


    }
}
