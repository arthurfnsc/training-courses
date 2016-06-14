package br.com.arthurfnsc.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String uf;
    private String zipcode;

    private Double latitude;
    private Double longitude;

    @SuppressWarnings("unused")
    private Address() {

    }

    public Address(final String description, final String uf, final String zipcode, final Double latitude, final Double longitude) {

        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.uf = uf;
        this.zipcode = zipcode;

    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getUf() {
        return this.uf;
    }

    public final String getZipcode() {
        return this.zipcode;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final void setUf(final String uf) {
        this.uf = uf;
    }

    public final void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }
}
