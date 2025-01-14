package br.com.albuquerque.eventmanagement.exception;

public enum ErrorCode {
    CATEGORY_NOT_FOUND("E001", "Category not found", 404),
    EVENT_NOT_FOUND("E002", "Event not found", 404),
    PARTICIPANT_NOT_FOUND("E003", "Participant not found", 404),
    INVALID_REQUEST("E004", "Invalid request", 400),
    UNKNOWN_ERROR("E999", "Unknown error occurred", 500);

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public static ErrorCode fromCode(String code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.code.equals(code)) {
                return errorCode;
            }
        }
        return UNKNOWN_ERROR;
    }
}
