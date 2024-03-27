package inheritance;

class Base {
    int a = 10, b = 20;

    void displayAB() {
        System.out.println("In Base Class: " + a + " | " + b);
    }
}

class Derived extends Base {
    int c = 30;

    void displayABC() {
        System.out.println("In Derived Class: " + a + " | " + b + " | " + c);
    }
}
