package com.bilgeadam.commentapp.java4.exception;

import lombok.Getter;

@Getter
public class CommentAppException extends RuntimeException {

    private final ErrorType errorType;

    public CommentAppException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public CommentAppException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
