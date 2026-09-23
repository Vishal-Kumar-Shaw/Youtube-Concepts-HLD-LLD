package BadCode;

public class Payment {
    public void pay(String type){
        if(type.equals("UPI")){
            System.out.println("Pay by UPI...");
        } else if(type.equals("CARD")){
            System.out.println("Pay by CARD...");
        }



        else if (type.equals("PAYPAL")) {
            System.out.println("Pay by PAYPAL...");
        }

    }
}
