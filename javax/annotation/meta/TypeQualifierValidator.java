package javax.annotation.meta;

import javax.annotation.Nonnull;

public interface TypeQualifierValidator<A extends java.lang.annotation.Annotation> {
  @Nonnull
  When forConstantValue(@Nonnull A paramA, Object paramObject);
}


/* Location:              C:\User\\user\Desktop\내꺼\Discord Bots\New Bot\JMusicBot-0.2.7-Windows.jar!\javax\annotation\meta\TypeQualifierValidator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */