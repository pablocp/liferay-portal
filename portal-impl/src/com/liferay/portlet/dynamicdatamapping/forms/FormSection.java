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
public class FormSection {

	public List<FormField> getFields() {
		return _fields;
	}

	public SectionLayout getLayout() {
		return _layout;
	}

	public void setFields(List<FormField> fields) {
		_fields = fields;
	}

	public void setLayout(SectionLayout layout) {
		_layout = layout;
	}

	private List<FormField> _fields;
	private SectionLayout _layout;

}