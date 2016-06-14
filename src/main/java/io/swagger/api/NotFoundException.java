package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-14T00:51:53.055Z")
public class NotFoundException extends ApiException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final int code;

    public NotFoundException(final int code, final String msg) {

        super(code, msg);
        this.code = code;
    }
}