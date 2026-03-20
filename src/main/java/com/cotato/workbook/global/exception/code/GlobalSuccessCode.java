package com.cotato.workbook.global.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GlobalSuccessCode implements BaseSuccessCode{

    COMMON_OK(HttpStatus.OK, "COMMON2001", "요청에 성공했습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
