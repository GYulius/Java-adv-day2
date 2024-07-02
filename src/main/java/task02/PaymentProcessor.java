package task02;

import java.time.LocalDateTime;

public interface PaymentProcessor {

    public boolean processPayment(double amount);

    static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    default void logTransaction(String transactionDetails){
        System.out.println(transactionDetails + " at current precise time of " + System.currentTimeMillis());
    }


}
