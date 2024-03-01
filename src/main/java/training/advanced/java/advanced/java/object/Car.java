package training.advanced.java.advanced.java.object;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Car implements Comparable<Car> {
    private String name;
    private String model;
    private String color;
    private int x;
    private int y;


    public void forward(int metre) {
        // ... code
    }

    public void backward(int metre) {
    }

    public void turn(int metre) {
    }


    @Override
    public int compareTo(final Car o) {
        return o.name.compareTo(name);
    }
}
