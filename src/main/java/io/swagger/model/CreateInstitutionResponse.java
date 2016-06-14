package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class CreateInstitutionResponse {

    private String id = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        final CreateInstitutionResponse createInstitutionResponse = (CreateInstitutionResponse) o;
        return Objects.equals(this.id, createInstitutionResponse.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstitutionResponse {\n");

        sb.append("  id: ").append(this.id).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
