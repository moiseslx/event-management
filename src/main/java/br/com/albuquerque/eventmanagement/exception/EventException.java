package br.com.albuquerque.eventmanagement.exception;

public class EventException extends RuntimeException {

    private final ErrorCode errorCode;

    public EventException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public EventException(ErrorCode errorCode, String customMessage) {
        super(customMessage);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
