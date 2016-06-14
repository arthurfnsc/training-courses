package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-14T00:51:53.055Z")
public class ApiException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final int code;

    public ApiException(final int code, final String msg) {
        super(msg);
        this.code = code;
    }
}