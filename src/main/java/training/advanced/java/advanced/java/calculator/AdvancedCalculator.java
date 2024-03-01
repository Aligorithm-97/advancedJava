package training.advanced.java.advanced.java.calculator;

public class AdvancedCalculator extends BasicCalculator {
    public AdvancedCalculator() {
        super();
        addOperation("log", (x, y) -> Math.log(x));
    }
}
