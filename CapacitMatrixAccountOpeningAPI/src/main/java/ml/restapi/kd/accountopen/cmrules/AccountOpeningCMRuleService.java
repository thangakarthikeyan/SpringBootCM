package ml.restapi.kd.accountopen.cmrules;


import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRulesRequest;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRulesResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/")
@Api(value = "/", description = "")
public interface AccountOpeningCMRuleService  {

    @POST
    @Path("/Roles")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountOpeningRulesResponse.class) })
    public AccountOpeningRulesResponse rulesForGivenProductType(AccountOpeningRulesRequest body);
}

