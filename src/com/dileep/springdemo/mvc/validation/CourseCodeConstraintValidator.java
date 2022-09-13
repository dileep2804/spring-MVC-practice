package com.dileep.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements  ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}

	@Override
	public boolean isValid(String enteredValue, ConstraintValidatorContext theConstraintValidatorContext) {

		if(enteredValue==null) return true;
		
		boolean result=enteredValue.startsWith(coursePrefix);
		return result;
	}

	
}
