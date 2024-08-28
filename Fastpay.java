package PaymentProcessing;

public class Fastpay implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        //
        System.out.println("The payment process via FastPay is loading...");
    }
    
}
