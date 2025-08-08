class Parent {
    protected void protect() {
        System.out.println("I'm inside protected method");
    }
}

class Child extends Parent {
    private void privateMethod() {
        System.out.println("I'm inside private method");
    }
}

class Main {
    public static void main(String[] args) {
        Child kid = new Child();
        // kid.privateMethod();

        System.out.println("Hello world!");
    }
}
