package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.List;

public class FormField {
	public String getDataType() {
		return _dataType;
	}
	public String getIndexType() {
		return _indexType;
	}
	public String getLabel() {
		return _label;
	}
	public String getName() {
		return _name;
	}
	public List<FormField> getNestedFields() {
		return _nestedFields;
	}
	public String getTip() {
		return _tip;
	}
	public String getValidationExpression() {
		return _validationExpression;
	}
	public boolean isMultiple() {
		return _multiple;
	}
	public boolean isRepeatable() {
		return _repeatable;
	}
	public void setDataType(String dataType) {
		_dataType = dataType;
	}
	public void setIndexType(String indexType) {
		_indexType = indexType;
	}
	public void setLabel(String label) {
		_label = label;
	}
	public void setMultiple(boolean multiple) {
		_multiple = multiple;
	}
	public void setName(String name) {
		_name = name;
	}
	public void setNestedFields(List<FormField> nestedFields) {
		_nestedFields = nestedFields;
	}
	public void setRepeatable(boolean repeatable) {
		_repeatable = repeatable;
	}
	public void setTip(String tip) {
		_tip = tip;
	}
	public void setValidationExpression(String validationExpression) {
		_validationExpression = validationExpression;
	}

	private String _dataType;
	private String _indexType;
	private String _label;
	private boolean _multiple;
	private String _name;
	private List<FormField> _nestedFields;
	private boolean _repeatable;
	private String _tip;
	private String _validationExpression;
}
