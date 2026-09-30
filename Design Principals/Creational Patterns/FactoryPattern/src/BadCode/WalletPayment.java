package BadCode;

public class WalletPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Wallet Payment pay");
    }
}
