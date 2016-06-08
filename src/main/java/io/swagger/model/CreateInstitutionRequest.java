package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class CreateInstitutionRequest  {
  
  private String name = null;
  private String description = null;
  private Object address = null;
  private Object courses = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public Object getAddress() {
    return address;
  }
  public void setAddress(Object address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("courses")
  public Object getCourses() {
    return courses;
  }
  public void setCourses(Object courses) {
    this.courses = courses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstitutionRequest createInstitutionRequest = (CreateInstitutionRequest) o;
    return Objects.equals(name, createInstitutionRequest.name) &&
        Objects.equals(description, createInstitutionRequest.description) &&
        Objects.equals(address, createInstitutionRequest.address) &&
        Objects.equals(courses, createInstitutionRequest.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, address, courses);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstitutionRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  courses: ").append(courses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
