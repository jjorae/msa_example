package me.jjorae.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope // 이 어노테이션이 있어야 /actuator/refresh 할 때 바뀐 설정 값을 가져옴
public class TestService {
    @Value("${service1.msg}")
    private String msg;

    public String getMsg() {
        return msg;
    }
}
