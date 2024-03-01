package training.advanced.java.advanced.java.calculator;

public class CalculatorFactory {

    public static ICalculator createCalculator(String type) {
        if (type.equalsIgnoreCase("Basic")) {
            return new BasicCalculator();
        } else if (type.equalsIgnoreCase("Advanced")) {
            return new AdvancedCalculator();
        }
        return null;
    }

}
