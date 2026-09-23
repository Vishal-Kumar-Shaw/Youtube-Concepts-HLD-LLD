package WithoutBuilder;

public class User {
    private String name;
    private String password;
    private String age;
    private String address;
    private String email;

    public User(String name, String password, String age, String address, String email) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Password: " + this.password);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Email: " + this.email);
    }

}
