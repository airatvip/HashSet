import java.util.Objects;

public class Product {

    private String name;

    private double price;

    private double weight;

    private boolean buy = false;


    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Product(String name) {
        this.name = name;
        this.price = 0;
        this.weight = 0;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукты: " + "\n" +
                (buy == true ? "● " : "○ ") +
                name + "\n" +
                "Цена - " + price + "\n" +
                "Вес - " + weight + "\n"
                ;

    }
}
