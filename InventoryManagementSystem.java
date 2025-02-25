import java.util.Scanner;
import java.util.ArrayList;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Steel Rebar", 0, 10000, 5));
        products.add(new Product("Granite", 1, 2700, 7));
        products.add(new Product("Topsoil", 3, 5120, 6));
        products.add(new Product("Excavator", 4, 16, 40000));
        products.add(new Product("Hard Hat", 5, 128, 5));
        products.add(new Product("Hardpoint", 6, 18, 10000));
        products.add(new Product("H8 Pencil", 7, 65536, 2));
        products.add(new Product("Eraser Cap", 8, 32769, 1));
        products.add(new Product("Peanut", 9, 43046721, 1));
        products.add(new Product());
        printStocks(products);
    }
    public static void printStocks(ArrayList<Product> p) {
        System.out.println("\nInventory:");
        for (Product i : p) {
            System.out.println(i.id + ": " + i.name + " | " + i.quantity + " units | $" + i.price + "/unit");
        }
    }
    public static void restock(ArrayList<Product> p) {

    }
}