package io.swagger.api;

import io.swagger.model.Address;
import io.swagger.model.Course;
import io.swagger.model.CreateInstitutionRequest;
import io.swagger.model.CreateInstitutionResponse;
import io.swagger.model.Institution;
import io.swagger.model.UpdateInstitutionRequest;
import io.swagger.model.Validation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class InstitutionApiImpl implements InstitutionApi {

    @Override
    public ResponseEntity<Validation> institutionInstitutionidAddressPut(String institutionid, Address address) throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidCoursePut(String institutionid, Course course) throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidDelete(String institutionid) throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Institution> institutionInstitutionidGet(String institutionid) throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Validation> institutionInstitutionidPut(String institutionid, UpdateInstitutionRequest institution)
            throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CreateInstitutionResponse> institutionPost(CreateInstitutionRequest institution) throws NotFoundException {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
