package training.advanced.java.advanced.java.generics;

import training.advanced.java.advanced.java.object.Car;

import java.util.function.Function;

public class GenericsMain {

    public static void main(String[] args) {
        IntValueHolder valueHolderLoc = new IntValueHolder();
        valueHolderLoc.setValue(100);
        Integer valueLoc = valueHolderLoc.getValue();

        StringValueHolder stringLoc = new StringValueHolder();
        stringLoc.setValue("ali");

        ObjectValueHolder objectValueHolderLoc = new ObjectValueHolder();
        objectValueHolderLoc.setValue(new Car());

        Object valueLoc1 = objectValueHolderLoc.getValue();
        if (valueLoc1 instanceof Car) {
            Car carLoc = (Car) objectValueHolderLoc.getValue();
        } else if (valueLoc1 instanceof Integer) {
            Integer integerLoc = (Integer) objectValueHolderLoc.getValue();
        }

        GenericValueHolder<Integer> ivLoc = new GenericValueHolder<>();
        ivLoc.setValue(100);
        Integer valueLoc2 = ivLoc.getValue();

        GenericValueHolder<String> svLoc = new GenericValueHolder<>();
        svLoc.setValue("ali");
        String valueLoc3 = svLoc.getValue();

        PairHolder<String, Integer> pairHolderLoc = new PairHolder<>("ali",
                54);
        String sLoc = test("ali");
        Integer iLoc = test(100);

        Integer integerLoc2 = test2("ali",
                String::length);
        PairHolderEx<Integer, Car> carPairHolderExLoc = new PairHolderEx<>(100,
                new Car());

    }

    public static <T> T test(T tParam) {
        System.out.println("Input : " + tParam);
        return tParam;
    }

    public static <T, E> T test2(E tParam,
                                 Function<E, T> functionParam) {
        System.out.println("Input : " + tParam);
        return functionParam.apply(tParam);
    }

}
