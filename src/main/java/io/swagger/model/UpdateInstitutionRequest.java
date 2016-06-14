package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class UpdateInstitutionRequest {

    private String name = null;
    private String description = null;

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        final UpdateInstitutionRequest updateInstitutionRequest = (UpdateInstitutionRequest) o;
        return Objects.equals(this.name, updateInstitutionRequest.name) && Objects.equals(this.description, updateInstitutionRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstitutionRequest {\n");

        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  description: ").append(this.description).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
