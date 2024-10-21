public class PaypalMain {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentGateway paymentGateway = new PayPalAdapter(payPal);
        paymentGateway.pay(100.0);
    }
}