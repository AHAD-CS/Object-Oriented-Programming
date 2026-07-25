public class Calculator {

    // Attributes

    private String brand;
    private boolean power;
    private double result;

    // Default Constructor

    public Calculator() {
        this.brand = "Unknown";
        this.power = false;
        this.result = 0.0;
    }

    // Parameterized Constructor

    public Calculator(String brand) {
        this.brand = brand;
        this.power = false;
        this.result = 0.0;
    }

    // Getters

    public String getBrand() {
        return brand;
    }

    public boolean ispower() {
        return power;
    }

    public double getResult() {
        return result;
    }

    // Setter

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Power Methods

    public void turnOn() {

        if (!power) {
            power = true;
            System.out.println("Calculator is ON.");
        } else {
            System.out.println("Calculator is already ON.");
        }

    }

    public void turnOff() {

        if (power) {
            power = false;
            System.out.println("Calculator is OFF.");
        } else {
            System.out.println("Calculator is already OFF.");
        }

    }

    // Addition

    public void add(double... numbers) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        result = 0;

        for (double number : numbers) {
            result += number;
        }

        System.out.println("Addition = " + result);
    }

    // Subtraction

    public void subtract(double... numbers) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        System.out.println("Subtraction = " + result);
    }

    // Multiplication

    public void multiply(double... numbers) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        result = 1;

        for (double number : numbers) {
            result *= number;
        }

        System.out.println("Multiplication = " + result);
    }

    // Division

    public void divide(double... numbers) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                System.out.println("Error! Division by zero is not allowed.");
                return;
            }

            result /= numbers[i];
        }

        System.out.println("Division = " + result);
    }

    // Power

    public void power(double base, double exponent) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        result = Math.pow(base, exponent);

        System.out.println("Power = " + result);
    }

    // Average

    public void average(double... numbers) {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        result = sum / numbers.length;

        System.out.println("Average = " + result);
    }



    // Clear Result

    public void clear() {

        if (!power) {
            System.out.println("Please turn ON the calculator.");
            return;
        }

        result = 0;

        System.out.println("Calculator memory cleared.");
    }

    // Display Status

    public void displayStatus() {

        System.out.println("\n========== Calculator ==========");
        System.out.println("Brand      : " + brand);
        System.out.println("Power      : " + (power ? "ON" : "OFF"));
        System.out.println("Last Result: " + result);
        System.out.println("================================");
    }
}