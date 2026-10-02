package BadCode;

public class User {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;

    // 1. Adding new property will force us to change the constructor and reduce readability


    // 2. Optional fields like we have to send many nulls
    //  User user1 = new User('@v_shaw', '12345', null, null, null .....)



    public User(String username, String password, String email, String phone, String address, String city, String state, String country) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // 3. Constructor explosion
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}
