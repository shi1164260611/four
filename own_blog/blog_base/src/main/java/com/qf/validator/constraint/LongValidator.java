package com.qf.validator.constraint;

import com.qf.validator.annotion.IntegerNotNull;
import com.qf.validator.annotion.LongNotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author 陌溪
 * @date 2019年12月4日13:16:06
 */
public class LongValidator implements ConstraintValidator<LongNotNull, Long> {


    @Override
    public void initialize(LongNotNull constraintAnnotation) {

    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null ) {
            return false;
        }
        return true;
    }
}
