package GoodCode;

public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving Employee " +
                employee.getName() + " to Database");
    }
}
