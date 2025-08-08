package org.anish.patterns.solid.lsp;

public interface WithdrawableAccount extends NonWithdrawableAccount {
    double withdraw(double amount);
}
