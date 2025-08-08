package org.anish.patterns.solid.lsp;

import java.util.ArrayList;

public class Client {
    private final ArrayList<NonWithdrawableAccount> nonWithdrawableAccounts;
    private final ArrayList<WithdrawableAccount> withdrawableAccounts;
    public Client(ArrayList<NonWithdrawableAccount> nonWithdrawableAccounts, ArrayList<WithdrawableAccount> withdrawableAccounts) {
        this.nonWithdrawableAccounts = nonWithdrawableAccounts;
        this.withdrawableAccounts = withdrawableAccounts;
    }

    void processTransactions(double deposit, double withdraw) {
        for(WithdrawableAccount account: withdrawableAccounts) {
            account.withdraw(withdraw);
            account.deposit(deposit);
        }
        for(NonWithdrawableAccount account: nonWithdrawableAccounts) {
            account.deposit(deposit);
        }
    }
}
