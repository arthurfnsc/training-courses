package io.swagger.api;

import javax.xml.bind.annotation.XmlTransient;

@javax.xml.bind.annotation.XmlRootElement
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-14T00:51:53.055Z")
public class ApiResponseMessage {

    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int INFO = 3;
    public static final int OK = 4;
    public static final int TOO_BUSY = 5;

    int code;
    String type;
    String message;

    public ApiResponseMessage() {
    }

    public ApiResponseMessage(final int code, final String message) {

        this.code = code;

        switch (code) {
        case ERROR:
            this.setType("error");
            break;
        case WARNING:
            this.setType("warning");
            break;
        case INFO:
            this.setType("info");
            break;
        case OK:
            this.setType("ok");
            break;
        case TOO_BUSY:
            this.setType("too busy");
            break;
        default:
            this.setType("unknown");
            break;
        }

        this.message = message;
    }

    @XmlTransient
    public int getCode() {
        return this.code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}