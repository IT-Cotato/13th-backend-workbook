package com.cotato.workbook.global.exception.code;

import org.springframework.http.HttpStatus;

// BaseSuccessCode.java
public interface BaseSuccessCode {
  HttpStatus getHttpStatus();
  String getCode();
  String getMessage();
}