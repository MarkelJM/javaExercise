public class Book {

    String title;
    String author;
    int publishedYear;
    double price;
    Book(String title, String author, int publishedYear, double price){
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public  String modifyTitle(String name){
        this.title = name;
        return  title;
    }

    public  String modifyAuthor(String name){
        this.author = name;
        return  author;
    }

    public  int modifyPublicationYear(int year){
        this.publishedYear = year;
        return  publishedYear;
    }

    public  double modifyPrice(double amount){
        this.price = amount;
        return  price;
    }

    public void showData(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publishedYear);
        System.out.println(price);

    }
}
