package com.cotato.workbook.global.response;

import com.cotato.workbook.global.exception.code.BaseSuccessCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({ "isSuccess", "code", "message", "result" }) // JSON 응답 필드 출력 순서를 고정해요
public class CommonResponse<T> {
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    private T result;

    // 성공 응답 — BaseSuccessCode를 구현한 Enum이라면 모두 받을 수 있어요
    public static <T> CommonResponse<T> onSuccess(BaseSuccessCode successCode, T result) {
        return new CommonResponse<>(true,
                successCode.getCode(),
                successCode.getMessage(),
                result);
    }

    // 실패 응답
    public static <T> CommonResponse<T> onFailure(String code, String message) {
        return new CommonResponse<>(false, code, message, null);
    }
}
