public class Product {
    private String title;
    private double price;
    private boolean isAlcohol;
    private String isAlcohol1;

    public Product(String title, double price, boolean isAlcohol) {
        this.title = title;
        this.price = price;
        if (!isAlcohol){
            isAlcohol1 = "Yes";
        }else {
            isAlcohol1 = "No";
        }

    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        if (!alcohol){
            isAlcohol1 = "Yes";
        }else {
            isAlcohol1 = "No";
        }
    }

    @Override
    public String toString() {
        return "\n\nTitle: " + title +
                "\nprice: " + price + " som" +
                "\nAlcohol: " + isAlcohol1;
    }
}
