// Creating an interface
interface Vehicle {

    // all are abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

// Bicycle implements Vehicle
class Bicycle implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

// Car implements Vehicle
class Car implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // creating an instance of Bicycle
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state:");
        bicycle.printStates();

        // creating an instance of Car
        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);

        System.out.println("Car present state:");
        car.printStates();
    }
}
