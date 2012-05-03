package com.cloudappstudio.data;

public class CloudViewEntry {
	private String[] columns;
	private String[] values;
	
	public CloudViewEntry(String[] columns, String[] values) {
		this.columns = columns;
		this.values = values;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}
	
	public String getValue(int index) {
		if (index < values.length)
			return values[index];
		else
			return null;
	}
	
	public String getValueByColumnName(String name) {
		for (String column : columns) {
			if (column.equals(name))
				return column;
		}
		return null;
	}
	
	public String getTitleValue() {
		for (int i = 0; i < columns.length; i++) {
			if (columns[i].contains("title") || columns[i].contains("name") || columns[i].contains("titel") || columns[i].contains("Titel")) {
				if (i < values.length)
					return values[i];
			}
		}
		return null;
	}
	
}
