package Bank;

public enum TransactionType {
    DEPOSIT("Пополнение"),
    WITHDRAW("Снятие"),
    INTEREST("Начисленеи процентов");

    private final String description;

    TransactionType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
