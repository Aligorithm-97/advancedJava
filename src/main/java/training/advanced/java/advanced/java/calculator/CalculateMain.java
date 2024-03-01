package training.advanced.java.advanced.java.calculator;

import java.util.Scanner;

public class CalculateMain {
    public static void main(String[] args) {
        //Try with Resources -> It closes scanner automatically after process is done.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menu");
            System.out.println("1-Basic");
            System.out.println("2-Advanced");
            System.out.print("Your choice : ");
            String choice = scanner.nextLine();

            ICalculator calculator = CalculatorFactory.createCalculator(choice);
            if (calculator != null) {
                try (Scanner scannerLoc = new Scanner(System.in)) {
                    System.out.print("Operation Name(add,subs,multi,div) : ");
                    String operationName = scannerLoc.nextLine();

                    System.out.print("First Number : ");
                    double x = scannerLoc.nextDouble();

                    System.out.print("Second Number : ");
                    double y = scannerLoc.nextDouble();

                    double result = calculator.calculate(operationName, x, y);
                    System.out.println("Result : " + result);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
