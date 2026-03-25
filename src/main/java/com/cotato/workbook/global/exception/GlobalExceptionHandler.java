package com.cotato.workbook.global.exception;

import com.cotato.workbook.global.exception.code.BaseErrorCode;
import com.cotato.workbook.global.response.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // CustomException 처리 — UserException, PostException 등 모두 여기서 처리돼요
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CommonResponse<Void>> handleCustomException(CustomException e) {
        BaseErrorCode errorCode = e.getErrorCode();
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(CommonResponse.onFailure(errorCode.getCode(), errorCode.getMessage()));
    }

    // 그 외 예상치 못한 예외 처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse<Void>> handleException(Exception e) {
        return ResponseEntity
                .status(500)
                .body(CommonResponse.onFailure("COMMON5001", "서버 에러가 발생했습니다."));
    }
}