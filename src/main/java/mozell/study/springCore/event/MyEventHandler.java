package mozell.study.springCore.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void handle(MyEvent event) {
        System.out.println("이벤트 받았고, 그 데이터는 "+event.getData());
    }
}
