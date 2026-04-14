package basics;
import mypack.Calculator;
public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5, 3);
        int difference = calc.subtract(5, 3);
        int product = calc.multiply(5, 3);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}