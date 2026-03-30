package com.cotato.workbook.global.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GlobalErrorCode implements BaseErrorCode{

    COMMON_INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON5001", "서버 에러가 발생했습니다."),
    COMMON_BAD_REQUEST(HttpStatus.BAD_REQUEST, "COMMON4001", "잘못된 요청입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}