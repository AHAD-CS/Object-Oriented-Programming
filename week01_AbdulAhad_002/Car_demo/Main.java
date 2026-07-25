public class Main {
    public static void main(String[] args) {
        // ==========================
        // Create first object using the default constructor
        // ==========================
        Car bmw = new Car();

        // Set BMW details
        bmw.setBrand("BMW");
        bmw.setFuelLevel(9);
        bmw.setMileage(18000);

        // Start the engine
        bmw.start();

        // Set gear to 1 (speed automatically becomes 50)
        bmw.setGear(1);

        // Move the car forward
        bmw.setDirection("Forward");

        // Display BMW details
        bmw.display();

        // Change gear to 3 (speed automatically becomes 150)
        bmw.setGear(3);

        // Turn the car to the right
        bmw.setDirection("Right");

        // Display updated details
        bmw.display();

        // Stop the engine
        bmw.stop();

        // Display final BMW details
        bmw.display();

        // ==========================
        // Create second object using the parameterized constructor
        // ==========================
        Car tesla = new Car("Tesla", 0, false, 0, 5, 12000);

        // Start the engine
        tesla.start();

        // Set gear to 2 (speed automatically becomes 100)
        tesla.setGear(2);

        // Move the car forward
        tesla.setDirection("Forward");

        // Display Tesla details
        tesla.display();

        // Change gear to 5 (speed automatically becomes 250)
        tesla.setGear(5);

        // Turn the car to the left
        tesla.setDirection("Left");

        // Display updated details
        tesla.display();

        // Stop the engine
        tesla.stop();

        // Display final Tesla details
        tesla.display();

    }
}