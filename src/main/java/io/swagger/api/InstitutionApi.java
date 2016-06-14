package io.swagger.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Address;
import io.swagger.model.Course;
import io.swagger.model.CreateInstitutionRequest;
import io.swagger.model.CreateInstitutionResponse;
import io.swagger.model.Institution;
import io.swagger.model.UpdateInstitutionRequest;
import io.swagger.model.Validation;

@RequestMapping(value = "/institution", produces = { APPLICATION_JSON_VALUE })
@Api(value = "/institution", description = "the institution API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-08T18:10:13.357Z")
public interface InstitutionApi {

    @ApiOperation(value = "update", notes = "Add address institution", response = Validation.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Execution validation", response = Validation.class),
            @ApiResponse(code = 404, message = "Institution not found", response = Validation.class) })
    @RequestMapping(value = "/{institutionid}/address", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.PUT)
    ResponseEntity<Validation> institutionInstitutionidAddressPut(@ApiParam(value = "Institution ID", required = true) @PathVariable("institutionid") String institutionid,
            @ApiParam(value = "Institution Address", required = true) @RequestBody Address address) throws NotFoundException;

    @ApiOperation(value = "update", notes = "Add course institution", response = Validation.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Execution validation", response = Validation.class),
            @ApiResponse(code = 404, message = "Institution not found", response = Validation.class) })
    @RequestMapping(value = "/{institutionid}/course", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.PUT)
    ResponseEntity<Validation> institutionInstitutionidCoursePut(@ApiParam(value = "Institution ID", required = true) @PathVariable("institutionid") String institutionid,
            @ApiParam(value = "Institution course", required = true) @RequestBody Course course) throws NotFoundException;

    @ApiOperation(value = "delete", notes = "Delete institution", response = Validation.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Execution validation", response = Validation.class),
            @ApiResponse(code = 404, message = "Institution not found", response = Validation.class) })
    @RequestMapping(value = "/{institutionid}", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.DELETE)
    ResponseEntity<Validation> institutionInstitutionidDelete(@ApiParam(value = "Institution ID", required = true) @PathVariable("institutionid") String institutionid) throws NotFoundException;

    @ApiOperation(value = "retrieve", notes = "Retrieve institution", response = Institution.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Institution", response = Institution.class),
            @ApiResponse(code = 404, message = "Institution not found", response = Institution.class) })
    @RequestMapping(value = "/{institutionid}", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.GET)
    ResponseEntity<Institution> institutionInstitutionidGet(@ApiParam(value = "Institution ID", required = true) @PathVariable("institutionid") String institutionid) throws NotFoundException;

    @ApiOperation(value = "update", notes = "Update institution", response = Validation.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Execution validation", response = Validation.class),
            @ApiResponse(code = 404, message = "Institution not found", response = Validation.class) })
    @RequestMapping(value = "/{institutionid}", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.PUT)
    ResponseEntity<Validation> institutionInstitutionidPut(@ApiParam(value = "Institution ID", required = true) @PathVariable("institutionid") String institutionid,
            @ApiParam(value = "Institution", required = true) @RequestBody UpdateInstitutionRequest institution) throws NotFoundException;

    @ApiOperation(value = "create", notes = "Create institution", response = CreateInstitutionResponse.class)
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Institution identifier", response = CreateInstitutionResponse.class),
            @ApiResponse(code = 400, message = "Execution not allowed", response = CreateInstitutionResponse.class) })
    @RequestMapping(value = "", consumes = { "application/json" }, produces = { "application/json" }, method = RequestMethod.POST)
    ResponseEntity<CreateInstitutionResponse> institutionPost(@ApiParam(value = "Institution", required = true) @RequestBody CreateInstitutionRequest institution) throws NotFoundException;
}
