package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.HashMap;
import java.util.Map;
public class FlatFieldRepresentation {
	public FlatFieldRepresentation() {
		_fields = new HashMap<String, FormField>();
	}

	public void addField(FormField field) {
		_fields.put(field.getName(), field);
	}

	public void addFields(Iterable<FormField> fields) {
		for (FormField field : fields) {
			addField(field);
		}
	}

	public FormField getField(String fieldName) {
		return _fields.get(fieldName);
	}

	private Map<String, FormField> _fields;
}