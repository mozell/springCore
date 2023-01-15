package mozell.study.springCore.aop;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) //애노테이션 정보를 어디까지 저장할 것인가?
public @interface PerfLogging {

}
