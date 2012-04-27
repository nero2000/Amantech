package com.cloudappstudio.data;

/**
 * Simple data structure for matching columns to values 
 * @author mrjanek <Jesper Lindberg>
 */
public class ColumnValue {
	private String mColumn;
	private String mValue;
	
	public ColumnValue(String column, String value) {
		this.mColumn = column;
		this.mValue = value;
	}

	public String getColumn() {
		return mColumn;
	}

	public void setColumn(String volumn) {
		this.mColumn = volumn;
	}

	public String getValue() {
		return mValue;
	}

	public void setValue(String value) {
		this.mValue = value;
	}
}
