package LatihanModul9;

class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("memproses pembayaran sejumlah: " + amount);
    }
    public void processPayment(double amount, String currency) {
        System.out.println("memproses pembayaran sejumlah: " + amount + "dalam mata uang: " + currency);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("credit card memproses pembayaran: " + amount);
    }
    public void processPayment(double amount, String currency) {
        System.out.println("credit card memproses pembayaran: " + amount 
        + " dalam mata uang: " + currency);
    }
}

class EWallet extends PaymentMethod {
    @Override 
    public void processPayment(double amount) {
        System.out.println("E-Wallet dalam mata uang: " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("E-Wallet memproses pembayaran: " + amount + " dalam mata uang: " + currency);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.err.println("Bank transfer memproses pembayaran: " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Bank transfer memproses pembayaran: " + amount + " dalam mata uang: " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

    for (PaymentMethod pm : payments) {
        pm.processPayment(120000);
        pm.processPayment(150000, "IDR");

        } 
    } 
}  
