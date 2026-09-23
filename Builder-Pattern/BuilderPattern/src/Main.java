import WithoutBuilder.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        User u1 = new User("Vishal","abc123","29","Banglore","vishal@test.com");
        u1.printDetails();
        // what if i need to use only 2 information to create a user
        // So we need to create another constructor
        // Or we need to pass null null everywhere where we do not have properties

        // but what if we need to create user with 2 other property
        // then we need to create some other constructor

        // But what if we create a user without any constructor and add properties ac to our needs
        // This will create another issue that is called invalid object creation
    }
}