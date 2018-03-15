package com.privalia.restcontrollers.enpoints;

public class Bug {

	private int code;
	private String bugText;
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the bugText
	 */
	public String getBugText() {
		return bugText;
	}
	/**
	 * @param bugText the bugText to set
	 */
	public void setBugText(String bugText) {
		this.bugText = bugText;
	}
	
	public Bug(int code, String text)
	{
		this.code = code;
		this.bugText = text;
	}
	
}
