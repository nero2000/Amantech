package com.cloudappstudio.data;

public class CloudWebApp {
	private String title;
	private String description;
	private String appName;
	
	public CloudWebApp(String title, String description, String appName) {
		this.title = title;
		this.description = description;
		this.appName = appName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
