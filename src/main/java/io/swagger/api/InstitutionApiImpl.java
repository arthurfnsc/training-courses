package io.swagger.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import br.com.arthurfnsc.services.InstitutionService;
import br.com.arthurfnsc.utils.InstitutionUtils;
import io.swagger.model.Address;
import io.swagger.model.Course;
import io.swagger.model.CreateInstitutionRequest;
import io.swagger.model.CreateInstitutionResponse;
import io.swagger.model.Institution;
import io.swagger.model.UpdateInstitutionRequest;
import io.swagger.model.Validation;

@Controller
public class InstitutionApiImpl implements InstitutionApi {

    @Autowired
    private InstitutionService service;

    @Override
    public ResponseEntity<Validation> institutionInstitutionidAddressPut(final String institutionid, final Address address) throws NotFoundException {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidCoursePut(final String institutionid, final Course course) throws NotFoundException {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidDelete(final String institutionid) throws NotFoundException {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Institution> institutionInstitutionidGet(final String institutionid) throws NotFoundException {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidPut(final String institutionid, final UpdateInstitutionRequest institution) throws NotFoundException {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CreateInstitutionResponse> institutionPost(final CreateInstitutionRequest institution) throws NotFoundException {

        final Institution apiSchema = new Institution();
        apiSchema.getAddresses().addAll(institution.getAddresses());
        apiSchema.getCourses().addAll(institution.getCourses());
        apiSchema.setDescription(institution.getDescription());
        apiSchema.setName(institution.getName());

        final br.com.arthurfnsc.models.Institution response = this.service.save(InstitutionUtils.toModel(apiSchema));

        if (response != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        throw new NotFoundException(400, "Nao foi possivel persistir o objeto");
    }
}
