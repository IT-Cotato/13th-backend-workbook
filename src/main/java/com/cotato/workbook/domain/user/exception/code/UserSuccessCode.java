package com.cotato.workbook.domain.user.exception.code;

import com.cotato.workbook.global.exception.code.BaseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum UserSuccessCode implements BaseSuccessCode {

    USER_FOUND(HttpStatus.OK, "USER2001", "유저를 조회했습니다."),
    USER_CREATED(HttpStatus.CREATED, "USER2011", "유저가 생성되었습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
