package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class ApiException extends Exception{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private int code;
	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
