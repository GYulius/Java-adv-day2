package task02;


public class CreditCardProcessor implements PaymentProcessor{

    static final double TRANSACTION_FEE_PERCENT = 0.02; // procent fix de 2%
    static final int MAX_LIMIT = 5000; // in dolari

    @Override
    public boolean processPayment(double amount) {

        double transactionfee = amount*TRANSACTION_FEE_PERCENT;

        double totalamount = amount + transactionfee;

        if(totalamount > MAX_LIMIT) {
            logTransaction("Credit card payment denied - limit exceeded");
            return false;
        }
        logTransaction("Credit card payment accepted for amount " + amount + " and transaction fee " + transactionfee);
        return true;
    }
}
