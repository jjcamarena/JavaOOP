public class Employee {
    int empno;
    String ename;
    float salary;

    public static void main(String[] args) {
        // Create an Employee type pbject
        Employee emp = new Employee();

        // Access the employee object properties using reference
        System.out.println(emp.empno + " | " + emp.ename + " | " + emp.salary);

    }
}
