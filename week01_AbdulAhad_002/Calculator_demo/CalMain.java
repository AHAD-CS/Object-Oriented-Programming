public class CalMain {

    public static void main(String[] args) {

        // Create Calculator Object
        Calculator calc = new Calculator("Casio");

        // Display Initial Status
        calc.displayStatus();

        // Edge Case: Calculator is OFF
        calc.add(10, 20);

        // Turn ON Calculator
        calc.turnOn();

        // Display Status
        calc.displayStatus();

        // Addition
        System.out.println("\n----- Addition -----");
        calc.add(10, 20, 30, 40, 50);      // Normal Case
        calc.add();                        // Edge Case

        // Subtraction
        System.out.println("\n----- Subtraction -----");
        calc.subtract(100, 20, 10);        // Normal Case
        calc.subtract();                   // Edge Case

        // Multiplication
        System.out.println("\n----- Multiplication -----");
        calc.multiply(2, 3, 4, 5);         // Normal Case
        calc.multiply();                   // Edge Case

        // Division
        System.out.println("\n----- Division -----");
        calc.divide(100, 2, 5);            // Normal Case
        calc.divide(100, 0);               // Edge Case

    
        // Power
        System.out.println("\n----- Power -----");
        calc.power(2, 5);                  // Normal Case
        calc.power(5, 0);                  // Edge Case

        // Average
        System.out.println("\n----- Average -----");
        calc.average(10, 20, 30, 40, 50);  // Normal Case
        calc.average();                    // Edge Case

        // Clear Memory
        System.out.println("\n----- Clear -----");
        calc.clear();

        // Display Final Status
        calc.displayStatus();

        // Turn OFF Calculator
        calc.turnOff();

        // Edge Case: Calculator is OFF
        calc.multiply(5, 5);
    }
}