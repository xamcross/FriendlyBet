package cross.xam.friendlybet.entity;

/**
 * Created by dmytro_korniienko on 3/11/16.
 */
public class Account {

    private Long id;

    private Double balance = 0.0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean withdraw(Double sumToWithdraw) {
        if (sumToWithdraw == null || sumToWithdraw <= 0.0) {
            System.out.println("You have attempted to withdraw unacceptable amount");
            return false;
        }
        if (balance >= sumToWithdraw) {
            balance -= sumToWithdraw;
        } else {
            System.out.println("Insufficient funds\n" + "Your balance is: "
                    + balance + "\n" + "You have attempted to withdraw: " + sumToWithdraw);
            return false;
        }
        return true;
    }

    public boolean deposit(Double sumToDeposit) {
        if (sumToDeposit == null || sumToDeposit <= 0.0) {
            System.out.println("You have attempted to deposit unacceptable amount");
            return false;
        }
        balance += sumToDeposit;
        System.out.println("You have deposited " + sumToDeposit + "\nYour current balance: " + balance);
        return true;
    }

    public boolean transferToAccount(Account targetAccount, Double amount){
        if (targetAccount != null) {
            if (this.withdraw(amount)) {
                if (targetAccount.deposit(amount)) {
                    return true;
                }
            }
        }
        return false;
    }
}
