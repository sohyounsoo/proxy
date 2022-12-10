package hello.proxy.cglib;

import hello.proxy.common.service.ConcreateService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CglibTest {

    @Test
    void cglib() {
        ConcreateService target = new ConcreateService();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreateService.class);
        enhancer.setCallback(new TimeMethodInterceptor(target));
        ConcreateService proxy = (ConcreateService) enhancer.create();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());

        proxy.call();

    }

}