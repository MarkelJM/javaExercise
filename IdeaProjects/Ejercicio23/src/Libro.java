public class Libro implements ItemBiblioteca {

    String title;
    String author;
    int numberPages;

    boolean disponible = true;

    Libro(String title, String author, int numberPages){
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }

    @Override
    public void prestar() {
        if (this.disponible) {
            this.disponible = false;
        } else   {
            System.out.println("No está disponile");;
        }
    }

    @Override
    public void devolver() {
        if (!this.disponible) {
            this.disponible = true;
        } else   {
            System.out.println("El libro no se puede devolver, ya que ya está disponible");
        }
    }

    @Override
    public void estadoItem() {
        System.out.println(disponible);
    }
}
