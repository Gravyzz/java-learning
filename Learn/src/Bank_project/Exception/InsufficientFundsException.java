package Bank_project.Exception;

public class InsufficientFundsException extends RuntimeException {


    private final int accountId;
    private final double requestedAmount;
    private final double availableBalance;


    public InsufficientFundsException(int accountId, double requestedAmount, double availableBalance) {
        super("Недостаточно средств на счёте #" + accountId
                + ". Запрошено: " + requestedAmount
                + ", доступно: " + availableBalance);
        this.accountId = accountId;
        this.requestedAmount = requestedAmount;
        this.availableBalance = availableBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}
