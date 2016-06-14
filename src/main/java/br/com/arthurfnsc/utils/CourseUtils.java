package br.com.arthurfnsc.utils;

import java.math.BigDecimal;

import br.com.arthurfnsc.models.Course;

public class CourseUtils {

    public static final Course toModel(final io.swagger.model.Course apiSchema) {

        final Course course = new Course(apiSchema.getName(), apiSchema.getDescription(), apiSchema.getDuration().intValue());

        return course;
    }

    public static final io.swagger.model.Course toApiSchema(final Course model) {

        final io.swagger.model.Course course = new io.swagger.model.Course();

        course.setDescription(model.getDescription());
        course.setDuration(new BigDecimal(model.getDuration()));
        course.setName(model.getName());

        return course;
    }
}
