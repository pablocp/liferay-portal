package com.liferay.portlet.dynamicdatamapping.forms;

import java.util.HashMap;
import java.util.Map;
public class FlatFieldRepresentation {
	public FlatFieldRepresentation() {
		_fields = new HashMap<String, FormFieldValue>();
	}

	public void addFieldValue(FormFieldValue field) {
		_fields.put(field.getFieldName(), field);
	}

	public void addFieldValue(Iterable<FormFieldValue> fields) {
		for (FormFieldValue field : fields) {
			addFieldValue(field);
		}
	}

	public FormFieldValue getFieldValue(String fieldName) {
		return _fields.get(fieldName);
	}

	private Map<String, FormFieldValue> _fields;
}