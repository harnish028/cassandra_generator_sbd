package annotation;

import generator.TramWorkerIdGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PrimeGen(TramWorkerIdGenerator.class)
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenTramWorkerId {

    int MIN_ID = 1;
    int MAX_ID = 1000;

    int from() default MIN_ID;

    int to() default MAX_ID;
}
