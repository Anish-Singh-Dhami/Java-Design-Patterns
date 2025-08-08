package org.anish.patterns.solid.lsp;

// can't use withdraw() thus divided account class into hierarchy
public class FixedDepositAccount implements NonWithdrawableAccount {
    double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount+" amount deposited, total balance "+balance);
    }
}
