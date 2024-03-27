package bankingApp;

public class Account {
    long accno;
    String name;
    float balance;

    // Constructors
    public Account() {}

    public Account(long accno, String name, float balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    // Metodo deposito
    void deposit(float amount) {
        this.balance = this.balance + amount;
        System.out.println("Monto: " + amount + " acreditado | Saldo: " + this.balance);
    }

    // Metodo retiro
    void withdraw(float amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            System.out.println("Retiro: " + amount + " | Saldo: " + this.balance);
        } else {
            System.out.println("ERROR: Saldo insuficiente");
        }
    }

    // Metodo detalle de cuenta
    void getBalance() {
        System.out.println("Cta: " + this.accno
                + " | Nombre: " + this.name
                + " | Saldo: " + this.balance);
    }
}
