package com.liferay.portlet.dynamicdatamapping.layout;

import java.util.LinkedList;
import java.util.List;
public class Form {
	public Form() {
		_pages = new LinkedList<FormPage>();
	}

	public void addPage(FormPage page) {
		_pages.add(page);
	}

	public List<FormPage> getPages() {
		return _pages;
	}

	public void setPages(List<FormPage> pages) {
		_pages = pages;
	}

	private List<FormPage> _pages;
}