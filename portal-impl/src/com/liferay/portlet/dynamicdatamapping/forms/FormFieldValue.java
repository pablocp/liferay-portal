package com.liferay.portlet.dynamicdatamapping.forms;

public class FormFieldValue {
	public LocalizedValue getCalculatedValue() {
		return _calculatedValue;
	}

	public String getFieldName() {
		return _fieldName;
	}

	public FlatFieldRepresentation getNestedFieldsValues() {
		return _nestedFieldsValues;
	}

	public void setCalculatedValue(LocalizedValue calculatedValue) {
		_calculatedValue = calculatedValue;
	}

	public void setFieldName(String fieldName) {
		_fieldName = fieldName;
	}

	public void setNestedFieldsValues(FlatFieldRepresentation nestedFieldsValues) {
		_nestedFieldsValues = nestedFieldsValues;
	} public LocalizedValue getValueExpression() {
		return _valueExpression;
	}

	public void setValueExpression(LocalizedValue valueExpression) {
		_valueExpression = valueExpression;
	}

	private LocalizedValue _calculatedValue;
	private String _fieldName;
	private FlatFieldRepresentation _nestedFieldsValues;
	private LocalizedValue _valueExpression;

}