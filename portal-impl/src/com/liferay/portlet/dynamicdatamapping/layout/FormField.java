package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.List;
public class FormField {
	public LocalizedValue getCalculatedValueExpression() {
		return _calculatedValueExpression;
	}

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

	public LocalizedValue getPredefinedValue() {
		return _predefinedValue;
	}

	public LocalizedValue getStyle() {
		return _style;
	}

	public String getTip() {
		return _tip;
	}

	public String getType() {
		return _type;
	}

	public String getValidationExpression() {
		return _validationExpression;
	}

	public LocalizedValue getValue() {
		return _value;
	}

	public String getVisibilityExpression() {
		return _visibilityExpression;
	}

	public boolean isMultiple() {
		return _multiple;
	}

	public boolean isRepeatable() {
		return _repeatable;
	}

	public void setCalculatedValueExpression(
			LocalizedValue calculatedValueExpression) {
		_calculatedValueExpression = calculatedValueExpression;
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

	public void setPredefinedValue(LocalizedValue predefinedValue) {
		_predefinedValue = predefinedValue;
	}

	public void setRepeatable(boolean repeatable) {
		_repeatable = repeatable;
	}

	public void setStyle(LocalizedValue style) {
		_style = style;
	}

	public void setTip(String tip) {
		_tip = tip;
	}

	public void setType(String type) {
		_type = type;
	} 

	public void setValue(LocalizedValue value) {
		_value = value;
	}

	public void setValidationExpression(String validationExpression) {
		_validationExpression = validationExpression;
	}

	public void setVisibilityExpression(String visibilityExpression) {
		_visibilityExpression = visibilityExpression;
	}

	private LocalizedValue _calculatedValueExpression;
	private String _dataType;
	private String _indexType;
	private String _label;
	private boolean _multiple;
	private String _name;
	private List<FormField> _nestedFields;
	private LocalizedValue _predefinedValue;
	private boolean _repeatable;
	private LocalizedValue _style;
	private String _tip;
	private String _type;
	private String _validationExpression;
	private LocalizedValue _value;
	private String _visibilityExpression;

}