package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcreateClient;
import hello.proxy.pureproxy.concreteproxy.code.ConcreateLogic;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreateProxyTest {

    @Test
    void noProxy() {
        ConcreateLogic concreateLogic = new ConcreateLogic();
        ConcreateClient client = new ConcreateClient(concreateLogic);
        client.excute();
    }

    @Test
    void addProxy() {
        ConcreateLogic concreateLogic = new ConcreateLogic();
        TimeProxy timeProxy = new TimeProxy(concreateLogic);
        ConcreateClient client = new ConcreateClient(timeProxy);
        client.excute();
    }

}