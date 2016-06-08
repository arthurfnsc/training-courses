package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class Validation  {
  
  private Boolean validation = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validation")
  public Boolean getValidation() {
    return validation;
  }
  public void setValidation(Boolean validation) {
    this.validation = validation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validation validation = (Validation) o;
    return Objects.equals(validation, validation.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validation {\n");
    
    sb.append("  validation: ").append(validation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
