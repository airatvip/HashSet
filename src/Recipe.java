import java.util.*;

public class Recipe <T extends Product> {

    private String nameRecipe;
    private Set<Product> recipe = new HashSet<>();
    private double totalCost;

    public Recipe(String nameRecipe, Set<Product> recipe) {
        this.nameRecipe = nameRecipe;
        this.recipe = recipe;
        this.totalCost = calcTotalCost();
        }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getRecipe() {
        return recipe;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double calcTotalCost () {
        double totalCost = 0.0;
        for (Product product : recipe) {
            totalCost = totalCost + product.getPrice() * product.getWeight() ;
        } return totalCost;
            
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe<?> recipe1 = (Recipe<?>) o;
        return Objects.equals(nameRecipe, recipe1.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return "Рецепт: "  + "\n" +
                "Название рецепта - " + nameRecipe + "\n" +
                "Продукты - " + recipe + "\n" +
                "Полная стоимость - " + calcTotalCost();
    }
}

