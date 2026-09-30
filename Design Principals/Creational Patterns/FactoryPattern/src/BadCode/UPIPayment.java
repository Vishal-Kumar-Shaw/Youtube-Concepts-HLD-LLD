package BadCode;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("UPIPayment pay");
    }
}
