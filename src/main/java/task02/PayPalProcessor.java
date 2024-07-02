package task02;

public class PayPalProcessor implements PaymentProcessor{

    private String email;
    // mai bine de accessat prin getteri si setterri din exterior decat a declara metoda de acces public

    static final int FLAT_FEE = 2; // in dolari

    // creez un constructor (recomandat mereu mai sus de getteri si setteri)
    // pentru a initializa obiectul direct cu un email in Main


    public PayPalProcessor(String email) {
        this.email = email;
    }

    public String getEmail() { // getter pentru email
        return email;
    }

    public void setEmail(String email) { // setter pentru email
        this.email = email;
    }

    public boolean validateEmail(String email) {
        if ((email.contains("@")) && (email != null)) {
            logTransaction("Thank you for your valid email "); // adaugat spatiu la finalul string-ului pentru a fi mai usor de citit
            return true;
        }
        else {
            // necesara deschiderea de acolade cand ai mai mult de o instructiune
            // (pentru a lua aici return ca a doua instructiune
            logTransaction("Please insert a valid email address.");
            return false;
        }
    }

    @Override
    public boolean processPayment(double amount) {
        if(!validateEmail(this.email)) // adica expresia (metoda) returneaza false
        {
            logTransaction("Cannot process payment because your email in not valid.");
            return false;
        } else {
            logTransaction("Transaction successfull with total amount of "
                    + (amount + FLAT_FEE) + "\n" + "and the flat fee of " + FLAT_FEE);
            return true;
            }
    }

}
