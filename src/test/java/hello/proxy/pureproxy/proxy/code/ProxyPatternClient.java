package hello.proxy.pureproxy.proxy.code;

import org.springframework.beans.factory.annotation.Autowired;

public class ProxyPatternClient {

    private Subject subject;

    @Autowired
    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.operation();
    }

}
