public class Employee {
    int empno;
    String ename;
    float salary;

    Employee() {
        System.out.println("*****");
        empno = 101;
        ename = "Pepe";
        salary = 5000;
    }
    public static void main(String[] args) {
        // Create an Employee type object
        Employee employee = new Employee();

        // Access the employee object properties using reference
        System.out.println(employee.empno + " | " + employee.ename + " | " + employee.salary);

        // Changing the state of object using reference
        employee.empno = 101;
        employee.ename = "Pepe";
        employee.salary = 52000.5f;

        employee.displayProperties(employee);

        // Changing the state of object using a method
        employee.setProperties(employee);
        employee.displayProperties(employee);
    }
    void displayProperties(Employee employee) {
        System.out.println(employee.empno + " | " + employee.ename + " | " + employee.salary);
    }

    void setProperties(Employee employee) {
        employee.ename = "Jose";
        employee.salary = 52500f;
    }
}