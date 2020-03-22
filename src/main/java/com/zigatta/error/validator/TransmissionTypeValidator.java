package com.zigatta.error.validator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TransmissionTypeValidator implements
	ConstraintValidator<TransmissionTypeValidatorConstraint, String> {

	@Override
	public void initialize(TransmissionTypeValidatorConstraint validator) {
	}
	
	List<String> transmissionType = Arrays.asList("MANUAL", "AUTO");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext cxt) {
		return transmissionType.contains(value);
	}
}
