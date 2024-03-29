package mozell.study.springCore.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Component
public class AnotherMyEventHandler {

    @EventListener
    @Async
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another "+myEvent.getData());
    }
}
