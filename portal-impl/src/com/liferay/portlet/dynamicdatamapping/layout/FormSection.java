package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.List;

public class FormSection {
	public List<FormField> getFields() {
		return _fields;
	}

	public void setFields(List<FormField> fields) {
		_fields = fields;
	}

	public SectionLayout getLayout() {
		return _layout;
	}

	public void setLayout(SectionLayout layout) {
		_layout = layout;
	}

	private List<FormField> _fields;
	private SectionLayout _layout;
}
