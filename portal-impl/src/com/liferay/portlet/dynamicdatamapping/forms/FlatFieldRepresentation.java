package com.liferay.portlet.dynamicdatamapping.forms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FlatFieldRepresentation {
	public FlatFieldRepresentation() {
		_fields = new HashMap<String, List<FormFieldValue> >();
	}

	public void addFieldValue(FormFieldValue fieldValue) {
		List<FormFieldValue> currentValues = _fields.get(
			fieldValue.getFieldName());

		if (currentValues == null) {
			currentValues = new ArrayList<FormFieldValue>();
			_fields.put(fieldValue.getFieldName(), currentValues);
		}

		currentValues.add(fieldValue);
	}

	public void addFieldValue(Iterable<FormFieldValue> fieldValues) {
		for (FormFieldValue fieldValue : fieldValues) {
			addFieldValue(fieldValue);
		}
	}

	public List<FormFieldValue> getFieldValue(String fieldName) {
		return _fields.get(fieldName);
	}

	private Map<String, List<FormFieldValue> > _fields;
}