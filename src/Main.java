import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//_______________________Корзина с продуктами_____________________________________________________________
        Product banan = new Product("Банан", 100.50, 1.5);
        Product orange = new Product("Апельсин", 120, 4);
        Product pineapple = new Product("Ананас", 200, 5);
        Product banan2 = new Product("Банан", 100.50, 1.4);

//        Set<Product> basket = new HashSet<>();

        Basket.basket.add(banan);
        Basket.basket.add(orange);
        Basket.basket.add(pineapple);


//        System.out.println(Basket.basket.toString());
//        Basket.addProduct(banan2);
//        System.out.println(Basket.basket.toString());
        Basket.basket.remove(pineapple);
        orange.setBuy(true);
//        System.out.println(Basket.basket.toString());

        List<Product> salat2 = new ArrayList<>();
        salat2.add(orange);
        salat2.add(pineapple);
        List<Product> salat3 = new ArrayList<>();
        salat3.add(banan);
        salat3.add(orange);
//_______________________Книга рецептов_____________________________________________________________

        Recipe salat = new Recipe("Салатище", Set.copyOf(Basket.basket));
        Recipe salat10 = new Recipe<>("Салатик", Set.copyOf(salat2));
        Recipe salat11 = new Recipe<>("Другой салат", Set.copyOf(salat3));
        Recipe salat12 = new Recipe<>("Другой салат2", Set.copyOf(salat2));
//        System.out.println(salat);

        BookRecipe.getBookRecipe().add(salat);
        BookRecipe.getBookRecipe().add(salat10);
        BookRecipe.getBookRecipe().add(salat11);

        System.out.println(BookRecipe.getBookRecipe());
        BookRecipe.addBookRecipe(salat11);
        System.out.println(BookRecipe.getBookRecipe());
//_______________________Рандом_____________________________________________________________

        Random.addRandom();

//_______________________Таблица умножения_____________________________________________________________

        MultiplicationTable task1 = new MultiplicationTable();

        Set<MultiplicationTable> task15 = new HashSet<>();
        while (task15.size() < 15) {
            task15.add(new MultiplicationTable());
        }
        for (MultiplicationTable task : task15) {
            System.out.println(task);
        }

//_______________________Паспорт_____________________________________________________________
        Passport person1 = new Passport("9209 123587", "Иван", "Иванов", "Иванович");
        Passport person2 = new Passport("7245 235469", "Петров", "Петр", "Петрович");
        Passport person3 = new Passport("5482 236547", "Сидоров", "Дмитрий");
        Passport person4 = new Passport("5482 236547", "Сидоров", "Дмитрий", "Иванович");

        PassportDataBase.addPerson(person1);
        PassportDataBase.addPerson(person2);
        PassportDataBase.addPerson(person3);
        PassportDataBase.addPerson(person4);


        System.out.println(PassportDataBase.getPassports());
        PassportDataBase.printInfoPerson("9209 123587");


    }


}

