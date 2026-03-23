package com.cotato.workbook.domain.user.exception.code;

import com.cotato.workbook.global.exception.code.BaseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

// UserSuccessCode.java
@Getter
@AllArgsConstructor
public enum UserSuccessCode implements BaseSuccessCode {

    USER_FOUND(HttpStatus.OK, "USER2001", "유저를 조회했습니다."),
    USER_CREATED(HttpStatus.CREATED, "USER2011", "유저가 생성되었습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
    // @Getter가 getHttpStatus(), getCode(), getMessage()를 자동으로 만들어줘서
    // BaseSuccessCode 인터페이스의 메서드를 별도 구현 없이 바로 충족해요
}