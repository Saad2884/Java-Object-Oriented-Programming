public class CashRegister {
    private double purchase;
    private double payment;
    private double change;

    public CashRegister(double purchase, double payment) {
        this.purchase = purchase;
        this.payment = payment;
    }

    public double getPurchase() {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }

    public double getChange() {
        change = payment - purchase;
        return change;
    }

}
