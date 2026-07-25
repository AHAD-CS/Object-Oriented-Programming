public class Car {

    // Private attributes (Data Members)
    private String brand;
    private double speed;
    private boolean state;
    private double gear;
    private double fuelLevel;
    private double mileage;
    private String direction;

    // Default Constructor
    public Car() {
        this.brand = "Unknown";
        this.speed = 0.0;
        this.state = false;
        this.gear = 0;
        this.fuelLevel = 0.0;
        this.mileage = 0.0;
    }

    // Parameterized Constructor
    public Car(String brand, double speed, boolean state, double gear, double fuelLevel, double mileage) {
        this.brand = brand;
        this.speed = speed;
        if ((this.speed / this.gear) <= 50) {
            this.gear = 1;
        } else if ((this.speed / this.gear) <= 100) {
            this.gear = 2;
        } else if ((this.speed / this.gear) <= 150) {
            this.gear = 3;
        } else if ((this.speed / this.gear) <= 200) {
            this.gear = 4;
        } else {
            this.gear = 5;
        }
        this.gear = gear;
        switch ((int) this.gear) {

            case 1:
                this.speed = 50;
                break;

            case 2:
                this.speed = 100;
                break;

            case 3:
                this.speed = 150;
                break;

            case 4:
                this.speed = 200;
                break;

            case 5:
                this.speed = 250;
                break;

            // If user enters an invalid gear
            default:
                System.out.println("Invalid gear value. Gear must be between 1 and 5.");
        }
        this.state = state;
        if (!this.state) {
            this.speed = 0; // Reset speed to 0 when the engine is stopped
            this.gear = 0; // Reset gear to 0 when the engine is stopped
        }
        this.fuelLevel = fuelLevel;
         if (this.fuelLevel < 10) {
            System.out.println("Warning: Fuel level is low. Please refuel soon.");
        }
        this.mileage = mileage;
    }

    // Set the direction of the car
    public void setDirection(String direction) {
        this.direction = direction;

        // Check the direction entered by the user
        if (this.direction.equalsIgnoreCase("forward")) {
            System.out.println("Car is moving forward.");
        } else if (this.direction.equalsIgnoreCase("backward")) {
            System.out.println("Car is moving backward.");
        } else if (this.direction.equalsIgnoreCase("left")) {
            System.out.println("Car is turning left. Left indicator is blinking.");
        } else if (this.direction.equalsIgnoreCase("right")) {
            System.out.println("Car is turning right. Right indicator is blinking.");
        } else {
            System.out.println("Invalid direction. Please specify 'forward' or 'backward'.");
        }
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter for engine state
    public void setState(boolean state) {
        this.state = state;
    }

    // Setter for gear
    public void setGear(double gear) {
        this.gear = gear;

        // Automatically set speed according to gear
        switch ((int) this.gear) {

            case 1:
                this.speed = 50;
                break;

            case 2:
                this.speed = 100;
                break;

            case 3:
                this.speed = 150;
                break;

            case 4:
                this.speed = 200;
                break;

            case 5:
                this.speed = 250;
                break;

            // If user enters an invalid gear
            default:
                System.out.println("Invalid gear value. Gear must be between 1 and 5.");
        }
    }

    // Setter for fuel level
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;

        if (this.fuelLevel < 10) {
            System.out.println("Warning: Fuel level is low. Please refuel soon.");
        }
    }

    // Setter for mileage
    public void setMileage(double mileage) {
        this.mileage = mileage;

    }

    // Start the engine
    public void start() {
        if (this.state) {
            System.out.println("Engine is already started!");
        } else {
            this.state = true;
            System.out.println("Engine is started!");
        }
    }

    // Stop the engine
    public void stop() {
        if (!this.state) {
            System.out.println("Engine is already stopped!");
        } else {
            this.state = false;
            System.out.println("Engine is stopped!");
            this.speed = 0; // Reset speed to 0 when the engine is stopped
            this.gear = 0; // Reset gear to 0 when the engine is stopped
        }
    }

    // Set speed and automatically decide gear
    public void setspeed(double speed) {
        this.speed = speed;

        // Calculate suitable gear according to speed
        if ((this.speed / this.gear) <= 50) {
            this.gear = 1;
        } else if ((this.speed / this.gear) <= 100) {
            this.gear = 2;
        } else if ((this.speed / this.gear) <= 150) {
            this.gear = 3;
        } else if ((this.speed / this.gear) <= 200) {
            this.gear = 4;
        } else {
            this.gear = 5;
        }
    }

    // Getters
    public String getBrand() {
        return this.brand;
    }

    public double getSpeed() {
        return this.speed;
    }

    public boolean getState() {
        return this.state;
    }

    public double getGear() {
        return this.gear;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public double getMileage() {
        return this.mileage;
    }

    public String getDirection() {
        return this.direction;
    }

    // Display all car information
    public void display() {
        System.out.println("---- Car Details ----");
        System.out.println("Brand: " + this.brand);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("State: " + (this.state ? "On" : "Off"));
        System.out.println("Gear: " + this.gear);
        System.out.println("Fuel Level: " + this.fuelLevel + " liters");
        System.out.println("Mileage: " + this.mileage + " km");
        System.out.println("---------------------");
    }
}