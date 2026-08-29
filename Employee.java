class EmployeeData {
    String id;
    double salary;

    EmployeeData(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void display() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {

        EmployeeData[] employees = {
            new EmployeeData("E-101", 40000),
            new EmployeeData("E-102", 55000),
            new EmployeeData("E-103", 62000),
            new EmployeeData("E-104", 48000)
        };

        for (int i = 0; i < employees.length; i++) {
            employees[i].raiseSalary(5000);
            employees[i].display();
        }
    }
}
