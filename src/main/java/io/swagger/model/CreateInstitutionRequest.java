package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-14T00:51:53.055Z")
public class CreateInstitutionRequest {

    private String name = null;
    private String description = null;
    private List<Address> addresses = new ArrayList<Address>();
    private List<Course> courses = new ArrayList<Course>();

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

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(final List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("courses")
    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(final List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        final CreateInstitutionRequest createInstitutionRequest = (CreateInstitutionRequest) o;
        return Objects.equals(this.name, createInstitutionRequest.name) && Objects.equals(this.description, createInstitutionRequest.description)
                && Objects.equals(this.addresses, createInstitutionRequest.addresses) && Objects.equals(this.courses, createInstitutionRequest.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.description, this.addresses, this.courses);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstitutionRequest {\n");

        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  description: ").append(this.description).append("\n");
        sb.append("  addresses: ").append(this.addresses).append("\n");
        sb.append("  courses: ").append(this.courses).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}