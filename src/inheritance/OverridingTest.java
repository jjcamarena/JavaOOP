package inheritance;

class Padre {
    int a = 10, b = 20;

    void display() {
        System.out.println("Clase Padre: " + a + " | " + b);
    }
}

class Hija extends Padre {
    int a = 11, b = 22;

    void display() {
        System.out.println("En Clase Hija: " + this.a + " | " + b
                + " | " + super.a + " | " + super.b);
        super.display();
    }
}
public class OverridingTest {
    public static void main(String[] args) {
        // Create a child class instance
        Hija obj = new Hija();
        System.out.println(obj.a + " | " + obj.b);
        obj.display();
    }
}
