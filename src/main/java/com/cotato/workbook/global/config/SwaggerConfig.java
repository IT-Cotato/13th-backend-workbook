package com.cotato.workbook.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value; // ✨ @Value를 사용하기 위해 꼭 필요한 import!
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    // yml 파일에 적힌 swagger.title 값을 찾아와서 이 변수에 쏙 넣어줍니다.
    @Value("${swagger.title}")
    private String swaggerTitle;

    // yml 파일에 적힌 swagger.description 값을 찾아와서 이 변수에 쏙 넣어줍니다.
    @Value("${swagger.description}")
    private String swaggerDescription;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(swaggerTitle)              // ✨ 직접 쓴 글자 대신 변수로 교체!
                        .description(swaggerDescription)  // ✨ 직접 쓴 글자 대신 변수로 교체!
                        .version("v1.0.0"));              // 기존에 있던 버전 정보는 그대로 살려둘게요!
    }
}