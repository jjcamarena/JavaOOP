class EmployeeA {
    int empno;
    String ename;
    float salary;

    EmployeeA() {}

    EmployeeA(int a, String b) {
        this.empno = a;
        this.ename = b;
    }

    EmployeeA(int i, String s, float f) {
        /*this.empno = i;
        this.ename = s;
        */
        // Constructor chaining
        this(i, s);
        this.salary = f;
    }

    void getDetails() {
        System.out.println(this.empno + " | " + this.ename + " | " + this.salary);
    }

}
public class OverloadingConstructors {
    public static void main(String[] args) {
        EmployeeA emp1 = new EmployeeA();
        EmployeeA emp2 = new EmployeeA(100, "Pepe");
        EmployeeA emp3 = new EmployeeA(120, "Sunil", 5000f);

        emp1.getDetails();
        emp2.getDetails();
        emp3.getDetails();
    }

}
