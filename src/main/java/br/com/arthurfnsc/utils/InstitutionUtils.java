package br.com.arthurfnsc.utils;

import br.com.arthurfnsc.models.Institution;

public class InstitutionUtils {

    public static final Institution toModel(final io.swagger.model.Institution apiSchema) {

        final Institution institution = new Institution(apiSchema.getName(), apiSchema.getDescription());

        if (!apiSchema.getAddresses().isEmpty()) {

        }

        if (!apiSchema.getCourses().isEmpty()) {

        }

        return institution;
    }

    public static final io.swagger.model.Institution toApiSchema(final Institution model) {

        final io.swagger.model.Institution institution = new io.swagger.model.Institution();

        if (!model.getAddresses().isEmpty()) {

        }

        if (!model.getCourses().isEmpty()) {

        }

        institution.setDescription(model.getDescription());
        institution.setName(model.getName());

        return institution;
    }
}
