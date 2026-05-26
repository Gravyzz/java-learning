package Bank_project;

public enum TransactionType {
    DEPOSIT("Пополнение"),
    WITHDRAW("Снятие"),
    INTEREST("Начисление процентов");

    private final String description;

    TransactionType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
