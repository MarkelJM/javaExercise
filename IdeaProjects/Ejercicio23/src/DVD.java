public class DVD implements ItemBiblioteca {

    String title;
    String director;
    int duracion;

    boolean disponible = true;


    DVD(String title, String director, int duracion){
        this.title = title;
        this.director = director;
        this.duracion = duracion;
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
