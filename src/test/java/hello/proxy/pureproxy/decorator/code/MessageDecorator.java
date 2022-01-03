package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component {

    private final Component target;

    public MessageDecorator(Component target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String data = target.operation();
        String decoResult = "*****" + data + "*****";
        log.info("데코 적용 전: {}, 적용 후: {}", data, decoResult);
        return decoResult;
    }
}
