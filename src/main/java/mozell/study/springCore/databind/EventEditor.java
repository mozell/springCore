package mozell.study.springCore.databind;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
// value 라는 값이 서로 다른 쓰레드에 공유가 된다. -> 쓰레드세이프 하지 않다.