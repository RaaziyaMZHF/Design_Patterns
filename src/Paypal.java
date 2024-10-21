class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " made through PayPal.");
    }
}

interface PaymentGateway {
    void pay(double amount);
}


class PayPalAdapter implements PaymentGateway {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(double amount) {
        payPal.sendPayment(amount);
    }
}


