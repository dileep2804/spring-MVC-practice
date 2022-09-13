package com.dileep.springdemo.mvc.validation;

import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//takes class which will implement our businessRules/ValidationLogic
@Constraint(validatedBy = CourseCodeConstraintValidator.class)

//takes for which elementType annotation will work on
@Target({ElementType.METHOD, ElementType.FIELD})

//for how long annotation is required
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//default course code
	public String value() default "LUV";
	
	//default error message if required course code is not entered
	public String message() default "must start with LUV";
	
	//define default groups-> can group related constraints
	public Class<?>[] groups() default {};
	
	//define default payloads->
	public Class<? extends Payload>[] payload() default {};
	
}
