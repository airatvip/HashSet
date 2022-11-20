import java.util.HashSet;
import java.util.Set;

public class Basket {
    static Set<Product> basket = new HashSet<>();

//    private String name;


    public Basket(Set<Product> basket) {
        this.basket = basket;
    }

    public void setBasket(Set<Product> basket) {
        this.basket = basket;
    }

    public Set<Product> getBasket() {
        return basket;
    }


    public static void addProduct(Product product) {
        if (product.getPrice() == 0 || product.getWeight()==0) {
            throw new RuntimeException("Заполните карточку товара");
        }
        else if (basket.contains(product)) {
            throw new RuntimeException("Такой товар есть в корзине");
        } else basket.add(product);
    }

}
