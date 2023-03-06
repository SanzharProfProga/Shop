public class Person implements Checkable {
    private String name;
    private byte age;
    private Basket basket;

    public Person(String name, byte age, Basket basket) {
        this.name = name;
        this.age = age;
        this.basket = basket;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void checkAge(Product [] products) {
        try {
            double totalAmount = 0.0;
            for (Product p : products) {
                if (!p.isAlcohol()) {
                    if (getAge() < 18) {
                        throw new CheckAge("You are not allowed to drink alcoholic beverages!!!");
                    }else {
                        totalAmount += p.getPrice();
                    }
                }else {
                    totalAmount += p.getPrice();
                }
            }
            System.out.println(totalAmount);
        }catch (CheckAge e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public String toString() {
        return "Person: " +
                "\nName: " + name +
                "\nAge: " + age +
                "\nBasket: " + basket;
    }
}
