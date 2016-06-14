package br.com.arthurfnsc.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Institution implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(cascade = CascadeType.PERSIST)
    private final List<Address> addresses = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private final List<Course> courses = new ArrayList<>();

    @SuppressWarnings("unused")
    private Institution() {

    }

    public Institution(final String name, final String description) {

        this.description = description;
        this.name = name;
    }

    public final List<Address> getAddresses() {
        return Collections.unmodifiableList(this.addresses);
    }

    public final List<Course> getCourses() {
        return Collections.unmodifiableList(this.courses);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getId() {
        return this.id;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public final void setName(final String name) {
        this.name = name;
    }
}
