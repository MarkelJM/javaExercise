public class Product {

    String name;
    String id;
    int stock;
    Product(String name, String id, int stock){
        this.name = name;
        this.id = id;
        this.stock = stock;
    }

    public void showStock(){
        System.out.println(stock);
    }
    public int soldItem(int amount){
        return (this.stock - amount);
    }

    public int addItem(int amount){
        return (this.stock + amount);
    }


}
