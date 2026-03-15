// UserRequest.java - 유저 생성/수정 시 클라이언트에서 받아오는 데이터

package com.cotato.workbook.domain.user.dto;

import lombok.Getter;

@Getter
public class UserRequest {
    private String name;
    private String email;
}
