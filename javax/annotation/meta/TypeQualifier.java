package javax.annotation.meta;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeQualifier {
  Class<?> applicableTo() default Object.class;
}


/* Location:              C:\User\\user\Desktop\내꺼\Discord Bots\New Bot\JMusicBot-0.2.7-Windows.jar!\javax\annotation\meta\TypeQualifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */