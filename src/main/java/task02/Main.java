package task02;

public class Main {
    public static void main(String[] args) {
        CreditCardProcessor creditCardProcessor = new CreditCardProcessor();

        String email = "ionel@gmail.com";

        PayPalProcessor payPalProcessor = new PayPalProcessor(email);

        double amount4 = 540;

        payPalProcessor.processPayment(amount4); // apelata din linia 40 a clasei PayPalProcessor

        double amount1 = 10; // aici variabila alocata pentru a face debug mai usor

        creditCardProcessor.processPayment(amount1); // apelata medoda din obiectul declarat mai sus

        double amount2 = 5010; // special alease pentru a testa metoda cu o valoare mai mare decat limita din PaymentProcessor

        creditCardProcessor.processPayment(amount2);

        double amount3 = 55.50; // in dolari
        double exchangeRate1 = 0.98; // rata de schimb ceruta ca variabila mai jos

        double convertedamount = PaymentProcessor.convertCurrency(amount3,exchangeRate1);
        System.out.println("Converted amount is " + convertedamount);
    }
}
