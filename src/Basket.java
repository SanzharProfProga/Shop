import java.util.Arrays;

public class Basket  {
    private Product [] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Basket() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    private String product (){
        String str = "";
        for (Product p:products) {
            str += p.toString();
        }
        return str;
    }

    @Override
    public String toString() {
        return product();
    }
}
