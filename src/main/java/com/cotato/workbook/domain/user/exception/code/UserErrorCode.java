package com.cotato.workbook.domain.user.exception.code;

import com.cotato.workbook.global.exception.code.BaseErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

// UserErrorCode.java
@Getter
@AllArgsConstructor
public enum UserErrorCode implements BaseErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER4041", "존재하지 않는 유저입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
    // @Getter가 getHttpStatus(), getCode(), getMessage()를 자동으로 만들어줘서
    // BaseErrorCode 인터페이스의 메서드를 별도 구현 없이 바로 충족해요
}