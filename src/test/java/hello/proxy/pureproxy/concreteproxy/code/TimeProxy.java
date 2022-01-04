package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeProxy extends ConcreteLogic {

    private final ConcreteLogic concreteLogic;

    public TimeProxy(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    @Override
    public String operation() {
        log.info("TimeProxy 실행");
        long startTime = System.currentTimeMillis();

        String result = super.operation();

        long endTime = System.currentTimeMillis();
        log.info("소요시간: {}ms", endTime - startTime);
        return result;
    }
}
