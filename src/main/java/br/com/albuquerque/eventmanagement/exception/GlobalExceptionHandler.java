package br.com.albuquerque.eventmanagement.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex, HttpServletRequest request) {
        var errorCode = ErrorCode.UNKNOWN_ERROR;

        var errorResponse = new ErrorResponse(
                errorCode.getCode(),
                LocalDateTime.now(),
                errorCode.getMessage(),
                ex.getMessage(),
                request.getRequestURI(),
                String.valueOf(errorCode.getStatus())
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorCode.getStatus()));
    }

    @ExceptionHandler(EventException.class)
    public ResponseEntity<ErrorResponse> handleEventException(EventException ex, HttpServletRequest request) {
        var errorCode = ex.getErrorCode();

        var errorResponse = new ErrorResponse(
                errorCode.getCode(),
                LocalDateTime.now(),
                errorCode.getMessage(),
                ex.getMessage(),
                request.getRequestURI(),
                String.valueOf(errorCode.getStatus())
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorCode.getStatus()));
    }
}
