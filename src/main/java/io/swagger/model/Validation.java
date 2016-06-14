package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class Validation {

    private Boolean validation = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("validation")
    public Boolean getValidation() {
        return this.validation;
    }

    public void setValidation(final Boolean validation) {
        this.validation = validation;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        final Validation validation = (Validation) o;
        return Objects.equals(validation, validation.validation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.validation);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Validation {\n");

        sb.append("  validation: ").append(this.validation).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
