package com.cgs.db.exception;

/**
 * java.sql.DatabaseMeta can not get database meta exception
 * 
 * @author xumh
 *
 */
public class DatabaseMetaGetMetaException extends DataAccessException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseMetaGetMetaException(String msg) {
		super(msg);
	}
	
	public DatabaseMetaGetMetaException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
