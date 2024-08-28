package PaymentProcessing;

public class PaymentProcessor {
    
    // Method 1
    // public void process(double amount) {
    //     // API bank for deducting the amount money
    //     // Credit card, paypal, AsiaHawala, ZainCash and FIB
    //     if(payment.method == "paypal") {
    //         // call paypal API
    //     } else if(payment.method == "Zain Cash") {
    //         // code for Zain Cash
    //     } else if(payment.method == "Credit Card") {
    //         // 40 lines of code
    //     }
    // }


    // Method 2
    private PaymentStrategy payStrategy;

    public PaymentProcessor(PaymentStrategy ps) {
        this.payStrategy = ps;
    }

    public void process(double amount) {
        payStrategy.processPayment(amount);
    }

}
