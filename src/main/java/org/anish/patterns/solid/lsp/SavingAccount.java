package org.anish.patterns.solid.lsp;

public class SavingAccount implements WithdrawableAccount {
    double balance = 0;
    @Override
    public double withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawing "+amount+" balance remain "+balance);
            return amount;
        } else {
            System.out.println("Insufficient funds!!");
            return 0;
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount+" amount deposited, total balance "+balance);
    }
}
