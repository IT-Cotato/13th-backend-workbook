package com.cotato.workbook.global.exception;

import com.cotato.workbook.global.exception.code.BaseErrorCode;
import lombok.Getter;

// CustomException.java
@Getter
public class CustomException extends RuntimeException {

    private final BaseErrorCode errorCode;

    public CustomException(BaseErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}