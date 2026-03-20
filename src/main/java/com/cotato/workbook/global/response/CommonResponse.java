package com.cotato.workbook.global.response;

import com.cotato.workbook.global.exception.code.BaseSuccessCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public class CommonResponse<T> {
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    private T result;

    public static <T> CommonResponse<T> onSuccess(BaseSuccessCode successCode, T result) {
        return new CommonResponse<>(true,
                successCode.getCode(),
                successCode.getMessage(),
                result);
    }

    public static <T> CommonResponse<T> onFailure(String code, String message) {
        return new CommonResponse<>(false, code, message, null);
    }
}
