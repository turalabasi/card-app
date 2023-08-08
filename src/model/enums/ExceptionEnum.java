package model.enums;

public enum ExceptionEnum {
     NOTFOUND_EXCEPTION("Username not found: "),
    ACCOUNT_TYPE_EXCEPTION("You can`t  send to yourself"),
    LOW_BALANCE_EXCEPTION("Low balance: ");

    ExceptionEnum(String message) {
        this.message=message;
    }
private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
