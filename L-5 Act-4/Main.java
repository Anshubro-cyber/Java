class Main {
    int age;

    Main(int age) {
        this.age = age; // Correctly assign parameter to instance variable
    }

    public static void main(String[] args) {
        Main obj = new Main(24);
        System.out.println("obj.age = " + obj.age);
    }
}
