package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public class Address {

    private String description = null;
    private String uf = null;
    private String zipcode = null;
    private Double latitude = null;
    private Double longitude = null;

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
    @JsonProperty("uf")
    public String getUf() {
        return this.uf;
    }

    public void setUf(final String uf) {
        this.uf = uf;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("zipcode")
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("latitude")
    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("longitude")
    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        final Address address = (Address) o;
        return Objects.equals(this.description, address.description) && Objects.equals(this.uf, address.uf) && Objects.equals(this.zipcode, address.zipcode)
                && Objects.equals(this.latitude, address.latitude) && Objects.equals(this.longitude, address.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.description, this.uf, this.zipcode, this.latitude, this.longitude);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("  description: ").append(this.description).append("\n");
        sb.append("  uf: ").append(this.uf).append("\n");
        sb.append("  zipcode: ").append(this.zipcode).append("\n");
        sb.append("  latitude: ").append(this.latitude).append("\n");
        sb.append("  longitude: ").append(this.longitude).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
