package com.cotato.workbook.domain.user.controller;

import com.cotato.workbook.domain.user.dto.UserRequest;
import com.cotato.workbook.domain.user.dto.UserResponse;
import com.cotato.workbook.domain.user.exception.UserException;
import com.cotato.workbook.domain.user.exception.code.UserErrorCode;
import com.cotato.workbook.domain.user.exception.code.UserSuccessCode;
import com.cotato.workbook.global.response.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "User API", description = "유저 관련 API")
@RestController
@RequestMapping("/users")
public class UserController {

    @Operation(summary = "유저 단건 조회", description = "ID로 유저 정보를 조회해요.")
    @ApiResponses({
            @ApiResponse(responseCode = "USER2001", description = "조회 성공"),
            @ApiResponse(responseCode = "USER4041", description = "유저를 찾을 수 없음")
    })
    @GetMapping("/{id}")  // GET /users/{id}
    public CommonResponse<UserResponse> getUser(
            @Parameter(description = "조회할 유저의 ID", example = "1")
            @PathVariable Long id) {
        if (id == 999L) {
            throw new UserException(UserErrorCode.USER_NOT_FOUND);
        }
        return CommonResponse.onSuccess(UserSuccessCode.USER_FOUND,
                new UserResponse(id, "임준서", "junseo@example.com"));
    }

    @Operation(summary = "유저 생성", description = "새로운 유저를 생성해요.")
    @ApiResponse(responseCode = "USER2011", description = "생성 성공")
    @PostMapping           // POST /users
    public CommonResponse<UserResponse> createUser(@RequestBody UserRequest request) {
        return CommonResponse.onSuccess(UserSuccessCode.USER_CREATED,
                new UserResponse(1L, request.getName(), request.getEmail()));
    }
}