package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        // create a child class instance
        Derived obj = new Derived();
        System.out.println(obj.a + " | " + obj.b + " | " + obj.c);
        obj.displayAB();
        obj.displayABC();
    }
}