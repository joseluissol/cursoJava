package es.coritel.java.EjercicioAnotaciones;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)

public @interface TiempoDeVida {
	public int tiempo() default 0;
	 public int tiempoMax() default 10;
}
