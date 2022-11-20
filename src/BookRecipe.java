import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookRecipe<T extends Recipe> {

    private static Set<Recipe> bookRecipe = new HashSet<>();


    public static Set<Recipe> getBookRecipe() {
        return bookRecipe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRecipe that = (BookRecipe) o;
        return Objects.equals(bookRecipe, that.bookRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookRecipe);
    }

    @Override
    public String toString() {
        return "BookRecipe{" +
                "bookRecipe=" + bookRecipe +
                '}';
    }

    public static boolean addBookRecipe(Recipe recipe1) {
        for (int i = 0; i < bookRecipe.size(); i++) {
            if (bookRecipe.contains(recipe1)) {
                System.out.println("Рецепт с таким названием уже есть в книге рецептов!"); break;
            }
        }return bookRecipe.add(recipe1);

    }
}
