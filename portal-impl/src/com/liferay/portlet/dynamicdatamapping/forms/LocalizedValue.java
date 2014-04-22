package com.liferay.portlet.dynamicdatamapping.forms;

import com.liferay.portal.kernel.util.LocaleUtil;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalizedValue {
	public LocalizedValue() {
		this(LocaleUtil.getDefault());
	}

	public LocalizedValue(Locale defaultLocale) {
		_values = new HashMap<Locale, String>();
	}

	public LocalizedValue(String defaultLanguageId) {
		this(LocaleUtil.fromLanguageId(defaultLanguageId));
	}

	public void addValue(Locale locale, String value) {
		_values.put(locale, value);
	}

	public void addValue(String languageId, String value) {
		addValue(LocaleUtil.fromLanguageId(languageId), value);
	}

	public String getValue(Locale locale) {
		String value = _values.get(locale);
		if (value == null) {
			value = _values.get(_defaultLocale);
		}
		return value;
	}

	public String getValue(String languageId) {
		return getValue(LocaleUtil.fromLanguageId(languageId));
	}

	private Map<Locale, String> _values;
	private Locale _defaultLocale;
}