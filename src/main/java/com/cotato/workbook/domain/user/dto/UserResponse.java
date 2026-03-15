package com.cotato.workbook.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor     //모든 필드를 받는 생성자 자동 생성
public class UserResponse {
    private Long id;
    private String name;
    private String email;
}
