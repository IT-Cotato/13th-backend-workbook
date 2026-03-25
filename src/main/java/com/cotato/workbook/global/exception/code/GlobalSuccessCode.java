package com.cotato.workbook.global.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GlobalSuccessCode implements BaseSuccessCode  {
    COMMON_OK(HttpStatus.OK, "COMMON2001", "요청에 성공했습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
    // @Getter가 getHttpStatus(), getCode(), getMessage()를 자동으로 만들어줘서
    // BaseSuccessCode 인터페이스의 메서드를 별도 구현 없이 바로 충족해요
}
