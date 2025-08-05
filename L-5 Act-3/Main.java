// This activity is mainly to explain Hierarchical Inheritance

// Parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals class");
    }
}

// Child class
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class");
    }
}

// Another child class
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

class Main {
    public static void main(String args[]) {
        // Using Lion object correctly
        Lion objLion = new Lion(); // object of Lion class
        // objLion.hum(); // INVALID: Lion can't access hum()
        objLion.roar();  // valid: Lion method
        objLion.mam();   // valid: inherited from Mammals

        System.out.println("-------------------");

        // Using Human object correctly
        Human objHuman = new Human(); // object of Human class
        objHuman.hum();   // valid: Human method
        objHuman.mam();   // valid: inherited from Mammals
        // objHuman.roar(); // INVALID: Human can't access roar()
    }
}
