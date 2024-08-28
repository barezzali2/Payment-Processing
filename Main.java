package PaymentProcessing;

public class Main {
    public static void main(String... args) {
        PaymentProcessor ps = new PaymentProcessor(new Asia7awalla());
        ps.process(100.0); // Amount to process
    }
}
