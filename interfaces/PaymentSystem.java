package interfaces;

interface Payment{
    void pay(double amt);   
}

class UPI implements Payment{
    public void pay(double amt){
        System.out.println("Paid "+amt+" using UPI" );
    }
}
class CreditCard implements Payment{
    public void pay(double amt){
        System.out.println("Paid "+amt+" using credit card" );
    }
}
class Wallet implements Payment{
    public void pay(double amt){
        System.out.println("Paid "+amt+" using wallet" );
    }
}

public class PaymentSystem{
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(500);
        wallet.pay(500);
    }
}