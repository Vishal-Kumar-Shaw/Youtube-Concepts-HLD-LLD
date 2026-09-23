package BadCode;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Resp - 1 - Employee Data
    public String getName() {
        return name;
    }

    // Resp - 2 - Calculating In Hand Salary
    public double calculateSalary() {
        return salary*0.9;
    }

    // Resp - 3 - Generate Report
    public void generateReport() {
        System.out.println("Employee " + name + " has a salary of $" + salary);
    }

    // Resp - 4 - Save to db
    public void saveToDB(){
        System.out.println("Saving employee information into db");
    }



}
