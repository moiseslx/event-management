package br.com.albuquerque.eventmanagement.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String code;
    private LocalDateTime timestamp;
    private String message;
    private String description;
    private String uri;
    private String status;

    public ErrorResponse(String code, LocalDateTime timestamp, String message, String description, String uri, String status) {
        this.code = code;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
        this.uri = uri;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
