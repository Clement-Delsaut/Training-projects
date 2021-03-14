package Calculator;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        int multiplication = calc.multiply(num1, num2);
        float division = calc.divide(num1, num2);
        System.out.println(sum);
        System.out.println(multiplication);
        System.out.println(division);

    }

    public int add(int num1, int num2) {
        return (num1 + num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public float divide(float num1, float num2) {
        return (num1 / num2);
    }
}
