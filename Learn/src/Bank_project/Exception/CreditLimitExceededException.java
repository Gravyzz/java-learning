package Bank_project.Exception;

public class CreditLimitExceededException extends RuntimeException {

    public CreditLimitExceededException(String message){
        super(message);
    }

}
