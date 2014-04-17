/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.forms;

import java.util.List;

/**
 * @author Pablo Carvalho
 */
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

	public LocalizedValue getTip() {
		return _tip;
	}

	public String getType() {
		return _type;
	}

	public String getValidationExpression() {
		return _validationExpression;
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

	public void setTip(LocalizedValue tip) {
		_tip = tip;
	}

	public void setType(String type) {
		_type = type;
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
	private LocalizedValue _tip;
	private String _type;
	private String _validationExpression;
	private String _visibilityExpression;

}