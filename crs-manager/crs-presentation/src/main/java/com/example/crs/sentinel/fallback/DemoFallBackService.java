package com.example.crs.sentinel.fallback;

import com.example.crs.api.IDemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author lvxuan
 * @description IDemoService 服务降级处理逻辑
 */
@Component
public class DemoFallBackService implements IDemoService {

    @Override
    public ResponseEntity testDemo() {
        return new ResponseEntity("服务降级", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
