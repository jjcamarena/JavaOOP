package bankingApp;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

    Account acc = null;
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("1 Crear cuenta");
        System.out.println("2 Deposito");
        System.out.println("3 Retiro");
        System.out.println("4 Detalles de cuenta");
        System.out.println("5 Salir");

        System.out.println("Opcion >> ");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1: // Crear cuenta
                if (acc == null) {
                    System.out.println("Escriba numero de cuenta >> ");
                    long accno = scanner.nextLong();

                    scanner.nextLine();
                    System.out.println("Titular de la cuenta >> ");
                    String name = scanner.nextLine();

                    System.out.println("Deposito inicial >> ");
                    float balance = scanner.nextFloat();

                    acc = new Account(accno, name, balance);
                    System.out.println("Cuenta creada");
                }
                else {
                    System.out.println("PSI: La cuenta ya existe");
                }
                break;
            case 2: // Deposito
                if (acc != null) {
                    System.out.println("Monto a depositar >> ");
                    float monto = scanner.nextFloat();
                    acc.deposit(monto);
                } else {
                    System.out.println("PSI: Hay que crear una cuenta");
                }
                break;
            case 3: // Retiro
                if (acc != null) {
                    System.out.println("Monto a retirar >> ");
                    float monto = scanner.nextFloat();
                    acc.withdraw(monto);
                } else {
                    System.out.println("PSI: Hay que crear una cuenta");
                }
                break;
            case 4: // Detalles de cuenta
                if (acc != null) {
                    acc.getBalance();
                } else {
                    System.out.println("PSI: Hay que crear una cuenta");
                }
                break;
            case 5: // Salir
                System.out.println("---- Bye ----");
                System.exit(0);
            default: //
                System.out.println("Opcion invalida");
        } // Switch
        System.out.println("--------------------------------");
    } // While
}
}
