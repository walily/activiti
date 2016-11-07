package com.zte.it.dof.form;

import org.activiti.engine.form.AbstractFormType;

/**
 * Created by wll on 11/7/16.
 */
public class JavascriptFormType extends AbstractFormType {

    @Override
    public String getName() {
        return "javascript";
    }

    @Override
    public Object convertFormValueToModelValue(String propertyValue) {
        return propertyValue;
    }

    @Override
    public String convertModelValueToFormValue(Object modelValue) {
        return (String) modelValue;
    }
}