package training.advanced.java.advanced.java.calculator;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {
        super();
        addOperation("add", Double::sum);
        addOperation("subs", (x, y) -> x - y);
        addOperation("multi", (x, y) -> x * y);
        addOperation("div", (x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        });
    }
}
