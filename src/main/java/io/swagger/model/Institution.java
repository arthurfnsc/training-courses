package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.Course;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class Institution  {
  
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
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

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
  @JsonProperty("addresses")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("courses")
  public List<Course> getCourses() {
    return courses;
  }
  public void setCourses(List<Course> courses) {
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
    Institution institution = (Institution) o;
    return Objects.equals(id, institution.id) &&
        Objects.equals(name, institution.name) &&
        Objects.equals(description, institution.description) &&
        Objects.equals(addresses, institution.addresses) &&
        Objects.equals(courses, institution.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, addresses, courses);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("  courses: ").append(courses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
