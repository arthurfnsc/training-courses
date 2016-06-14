package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class Institution {

    private String id = null;
    private String name = null;
    private String description = null;
    private List<Address> addresses = new ArrayList<Address>();
    private List<Course> courses = new ArrayList<Course>();

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
        final Institution institution = (Institution) o;
        return Objects.equals(this.id, institution.id) && Objects.equals(this.name, institution.name) && Objects.equals(this.description, institution.description)
                && Objects.equals(this.addresses, institution.addresses) && Objects.equals(this.courses, institution.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.description, this.addresses, this.courses);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Institution {\n");

        sb.append("  id: ").append(this.id).append("\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  description: ").append(this.description).append("\n");
        sb.append("  addresses: ").append(this.addresses).append("\n");
        sb.append("  courses: ").append(this.courses).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
