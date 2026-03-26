package com.cotato.workbook.global.exception.code;

import org.springframework.http.HttpStatus;

// BaseErrorCode.java
public interface BaseErrorCode {
  HttpStatus getHttpStatus();
  String getCode();
  String getMessage();
}