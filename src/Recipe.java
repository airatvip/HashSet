import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Recipe <T extends Product> {

    private String nameRecipe;
    private List <Product> recipe = new ArrayList<>();
    private double totalCost;

    public Recipe(String nameRecipe, List<Product> recipe) {
        this.nameRecipe = nameRecipe;
        this.recipe = recipe;
        this.totalCost = calcTotalCost();
        }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public List<Product> getRecipe() {
        return recipe;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double calcTotalCost () {
        for (int i = 0; i < recipe.size(); i++) {
            totalCost = totalCost + recipe.get(i).getPrice() * recipe.get(i).getWeight();
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

