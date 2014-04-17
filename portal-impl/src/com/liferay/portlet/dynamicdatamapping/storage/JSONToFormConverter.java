package com.liferay.portlet.dynamicdatamapping.storage;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portlet.dynamicdatamapping.layout.Form;
import com.liferay.portlet.dynamicdatamapping.layout.FormField;
import com.liferay.portlet.dynamicdatamapping.layout.FormPage;
import com.liferay.portlet.dynamicdatamapping.layout.FormSection;
import com.liferay.portlet.dynamicdatamapping.layout.LocalizedValue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JSONToFormConverter {
	public JSONToFormConverter(String layoutJSON, String structureJSON)
		throws JSONException {
		this(layoutJSON, structureJSON, null);
	}

	public JSONToFormConverter(
		String layoutJSON, String structureJSON, String valuesJSON) 
		throws JSONException  {

		_layoutRoot = JSONFactoryUtil.createJSONObject(layoutJSON);
		_fieldsLayoutRoot = _layoutRoot.getJSONObject("fieldsLayout");

		_structureRoot = JSONFactoryUtil.createJSONObject(structureJSON);

		if (valuesJSON != null) {
			_valuesRoot = JSONFactoryUtil.createJSONObject(valuesJSON);
		}
	}

	public Form convert() {
		Form form = new Form();
		JSONArray pagesArray = _layoutRoot.getJSONArray("pages");
		form.setPages(getPages(pagesArray));
		return form;
	}

	protected List<FormPage> getPages(JSONArray pagesArray) {
		List<FormPage> pages = new LinkedList<FormPage>();
		for (int i = 0; i < pagesArray.length(); ++i) {
			pages.add(getPage(pagesArray.getJSONObject(i)));
		}
		return pages;
	}

	protected FormPage getPage(JSONObject pageNode) {
		FormPage page = new FormPage();
		JSONArray sectionsArray = pageNode.getJSONArray("sections");
		page.setSections(getSections(sectionsArray));
		return page;
	}

	protected List<FormSection> getSections(JSONArray sectionsArray) {
		List<FormSection> sections = new LinkedList<FormSection>();
		for (int i = 0; i < sectionsArray.length(); ++i) {
			sections.add(getSection(sectionsArray.getJSONObject(i)));
		}
		return sections;
	}

	protected FormSection getSection(JSONObject sectionNode) {
		FormSection section = new FormSection();
		JSONArray fieldsArray = sectionNode.getJSONArray("fields");
		section.setFields(getFields(fieldsArray));
		return section;
	}

	protected List<FormField> getFields(JSONArray fieldsArray) {
		List<FormField> fields = new LinkedList<FormField>();
		for (int i = 0; i < fieldsArray.length(); ++i) {
			fields.add(getField(fieldsArray.getJSONObject(i)));
		}
		return fields;
	}

	protected FormField getField(JSONObject fieldNode) {
		FormField formField = new FormField();

		String fieldName = fieldNode.getString("name");
		formField.setName(fieldName);

		JSONObject fieldLayout = _fieldsLayoutRoot.getJSONObject(fieldName);
		formField.setLabel(fieldLayout.getString("label"));
		formField.setTip(fieldLayout.getString("tip"));

		JSONObject fieldStructure = _structureRoot.getJSONObject(fieldName);
		formField.setNestedFields(
				getFields(fieldStructure.getJSONArray("nestedFields")));

		if (_valuesRoot != null) {
			formField.setValue(
				getLocalizedValue(_valuesRoot.getJSONObject(fieldName)));
		}

		return formField;
	}

	protected LocalizedValue getLocalizedValue(JSONObject valueNode) {
		LocalizedValue value = new LocalizedValue();

		Iterator<String> languageIds = valueNode.keys();
		while(languageIds.hasNext()) {
			String languageId = languageIds.next();
			value.addValue(languageId, valueNode.getString(languageId));
		}

		return value;
	}

	private JSONObject _layoutRoot;
	private JSONObject _fieldsLayoutRoot;
	private JSONObject _structureRoot;
	private JSONObject _valuesRoot;
}
