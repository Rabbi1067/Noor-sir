void main() {
    IO.println("Hello to SOLID");

    // SRP
    Payment payment = new Payment();
    payment.pay("Cash");

    // OCP
    PaymentInterface cashPayment = new CashPayment();
    cashPayment.pay();

    PaymentInterface bkashPayment = new BkashPayment();
    bkashPayment.pay();


    // DIP
    Switch s1 = new Switch(new AppleBulb());
    s1.press();
}
