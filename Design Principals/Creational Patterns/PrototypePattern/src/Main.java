//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Soldier1 s1 = new Soldier1("AK101", 100, 20);
        Soldier1 s2 = new Soldier1("AK102", 90, 40);
        Soldier1 s3 = new Soldier1("AK103", 90, 40);

        // super.clone() yahan shallow copy banata hai.
        // Primitive fields ki values copy hoti hain,
        // lekin mutable object references share ho sakte hain.
        // Agar nested objects bhi independently copy karne
        // hain, toh deep-copy logic chahiye ho sakta hai.

        Soldier1 s4 = s1.clone();


    }
}