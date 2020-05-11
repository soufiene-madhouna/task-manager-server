package com.soufiene.vos;

public class ResultObjectVO {
	private boolean error;
	private Object resultObject;
	
	public ResultObjectVO(boolean error, Object resultObject) {
		this.error = error;
		this.resultObject = resultObject;
	}

	public ResultObjectVO() {
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the resultObject
	 */
	public Object getResultObject() {
		return resultObject;
	}

	/**
	 * @param resultObject the resultObject to set
	 */
	public void setResultObject(Object resultObject) {
		this.resultObject = resultObject;
	}
	 
	
}
