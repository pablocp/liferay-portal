package com.liferay.portlet.dynamicdatamapping.layout;

import com.liferay.portal.kernel.util.LocaleUtil;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalizedValue {
	public LocalizedValue() {
		_values = new HashMap<Locale, String>();
	}
	public void addValue(Locale locale, String value) {
		_values.put(locale, value);
	}
	public void addValue(String languageId, String value) {
		addValue(LocaleUtil.fromLanguageId(languageId), value);
	}
	public String getValue(Locale locale) {
		return _values.get(locale);
	}
	public String getValue(String languageId) {
		return getValue(LocaleUtil.fromLanguageId(languageId));
	}
	private Map<Locale, String> _values;
}
