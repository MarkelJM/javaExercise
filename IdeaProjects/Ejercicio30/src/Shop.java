import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Shop {
    public static void main(String[] args) {

        Map<String , Integer> dicInventory = new HashMap<String, Integer>();

        Product patatas = new Product("patatas", "123456", 750);
        Product manzanas = new Product("manzanas", "234567", 50);
        Product aceite = new Product("aceite", "345678", 800);
        Product uvas = new Product("uvas", "456789", 2000);
        Product zanahoria = new Product("zanahoria", "567891", 1500);

    }

    public static void addProduct(Product producto, Map<String, Integer> diccionarry){
        if (!(hasProduct(producto, diccionarry))){
            diccionarry.put(producto.id, producto.stock);
        } else {
            System.out.println("el producto ya existe, actualiza el stock, pero no debes crear el mismo producto con dos id");
        }

    }

    public static void removeProduct(Product producto, Map<String, Integer> diccionarry){
        diccionarry.remove(producto.id);

    }

    public  static  boolean hasProduct(Product product,Map<String, Integer> diccionarry ){
        if(diccionarry.containsKey(product.id)){
            return  true;
        } else {
            return false;
        }

    }




}
