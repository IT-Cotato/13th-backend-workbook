package com.cotato.workbook.domain.user.exception.code;

import com.cotato.workbook.global.exception.code.BaseErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum UserErrorCode implements BaseErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER4041", "존재하지 않는 유저입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
