package com.cgs.db.exception;

public class SchemaInfoLevelException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SchemaInfoLevelException(String msg) {
		super(msg);
	}
	
	public SchemaInfoLevelException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
