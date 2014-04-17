package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.List;
public class FormPage {

	public List<FormSection> getSections() {
		return _sections;
	}

	public void setSections(List<FormSection> sections) {
		_sections = sections;
	}

	private List<FormSection> _sections;
}