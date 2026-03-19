package com.cotato.workbook.domain.user.exception;

import com.cotato.workbook.domain.user.exception.code.UserErrorCode;
import com.cotato.workbook.global.exception.CustomException;

public class UserException extends CustomException {

    public UserException(UserErrorCode errorCode) {
        super(errorCode);
    }
}