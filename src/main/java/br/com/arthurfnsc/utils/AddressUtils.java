package br.com.arthurfnsc.utils;

import br.com.arthurfnsc.models.Address;

public class AddressUtils {

    public static final Address toModel(final io.swagger.model.Address apiSchema) {

        final Address address = new Address(apiSchema.getDescription(), apiSchema.getUf(), apiSchema.getZipcode(), apiSchema.getLatitude(), apiSchema.getLongitude());

        return address;
    }

    public static final io.swagger.model.Address toApiSchema(final Address model) {

        final io.swagger.model.Address address = new io.swagger.model.Address();

        address.setDescription(model.getDescription());
        address.setLatitude(model.getLatitude());
        address.setLongitude(model.getLongitude());
        address.setUf(model.getUf());
        address.setZipcode(model.getZipcode());

        return address;
    }
}
