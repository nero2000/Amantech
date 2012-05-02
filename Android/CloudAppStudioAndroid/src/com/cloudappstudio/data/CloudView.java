package com.cloudappstudio.data;

public class CloudView {
	private String title;
	private String viewName;
	
	public CloudView(String title, String viewName) {
		this.title = title;
		this.viewName = viewName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
}
