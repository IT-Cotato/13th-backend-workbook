package com.cotato.workbook.global.exception;

import com.cotato.workbook.global.exception.code.BaseErrorCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException { // 모든 도메인 예외가 상속할 부모 클래스

    private final BaseErrorCode errorCode;

    public CustomException(BaseErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
