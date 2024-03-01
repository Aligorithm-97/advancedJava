package training.advanced.java.advanced.java.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator implements ICalculator {
    protected Map<String, ICalculate> processors;

    public Calculator() {
        processors = new HashMap<>();
    }

    @Override
    public void addOperation(String operationName, ICalculate calculation) {
        processors.put(operationName, calculation);
    }

    @Override
    public double calculate(String operationName, double x, double y) {
        if (processors.containsKey(operationName)) {
            ICalculate calculation = processors.get(operationName);
            return calculation.calc(x, y);
        } else {
            throw new UnsupportedOperationException("Operation not supported");
        }
    }
}
