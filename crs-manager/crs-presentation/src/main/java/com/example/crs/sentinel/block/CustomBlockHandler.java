package com.example.crs.sentinel.block;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author lvxuan
 * @description 自定义 sentinel限流处理逻辑
 */
public class CustomBlockHandler {

    public static ResponseEntity blockHandler() {
        return new ResponseEntity("当前请求已限流", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
