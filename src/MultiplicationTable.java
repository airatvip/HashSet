import java.util.Objects;
import java.util.Random;


public class MultiplicationTable {

    private int num1;
    private int num2;

    public MultiplicationTable() {
        Random random = new Random();
        this.num1 = random.nextInt (8) + 2;
        this.num2 = random.nextInt (8) + 2;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return (num1 == that.num1 && num2 == that.num2) || (num1 == that.num2 && num2 == that.num1) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2) + Objects.hash(num2, num1);
    }

    @Override
    public String toString() {
        return num1 + " * " +  num2 + " =";
    }
}
