package Bank_project;

public class Transaction {
    private final int accountId;
    private final TransactionType type;
    private final double amount;
    private final long timestamp;

    public Transaction(int accountId, TransactionType type, double amount) {
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.timestamp = System.currentTimeMillis();
    }

    public int getAccountId() {
        return accountId;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + new java.util.Date(timestamp) + "] "
                + type.getDescription()
                + " на счёте #" + accountId
                + ", сумма: " + amount;
    }

}
