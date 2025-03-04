public class Product {
    String name;
    int id;
    int quantity;
    int price;
    public Product() {
        name = "Air";
        id = -1;
        quantity = -1;
        price = 0;
    }
    public Product(String n, int i) {
        name = n;
        id = i;
        quantity = -1;
        price = 0;
    }
    public Product(String n, int i, int q, int p) {
        name = n;
        id = i;
        quantity = q;
        price = p;
    }
}
