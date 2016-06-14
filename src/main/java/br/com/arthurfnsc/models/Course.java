package br.com.arthurfnsc.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Integer duration;

    @SuppressWarnings("unused")
    private Course() {

    }

    public Course(final String name, final String description, final int duration) {

        this.description = description;
        this.duration = duration;
        this.name = name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final void setDuration(final Integer duration) {
        this.duration = duration;
    }

    public final void setName(final String name) {
        this.name = name;
    }
}
