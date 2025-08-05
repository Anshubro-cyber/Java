// Parent class
class Parent {
    int age, id;
    String name;

    void naming(String name) {
        System.out.println("Name: " + name);
    }
}

// Child class
class Child extends Parent {
    void ageN(int age) {
        System.out.println("Age of student is: " + age);
    }
}

// Main class
class Main {
    public static void main(String[] er) {
        Child s = new Child(); // creating object of child class
        s.naming("Aashish");
        s.ageN(14);
    }
}
