package ml.restapi.kd.accountopen.cmrules;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRulesRequest;
import ml.restapi.kd.accountopen.cmrules.model.AccountOpeningRulesResponse;
import ml.restapi.kd.accountopen.cmrules.model.StatusInfo;

import org.apache.cxf.jaxrs.ext.multipart.*;
import org.springframework.stereotype.Service;

import io.swagger.annotations.Api;

@Service
public class AccountOpeningCMRuleServiceImpl implements AccountOpeningCMRuleService {
	
	
    public AccountOpeningRulesResponse rulesForGivenProductType(AccountOpeningRulesRequest body) {
        // TODO: Implement...
        
    	AccountOpeningRulesResponse response = new AccountOpeningRulesResponse();
    	StatusInfo status = new StatusInfo();
    	status.setCode("KD_CMRulses_SUCC_00");
    	status.setBusinessDescription("Rule Service Processing Successful");
    	status.setTechnicalDescription("Rule Service Processing Successful");
    	response.setTransactionStatus(status);
    	if(body!= null)
    	{
    		//response.setInputProductsList(body.getInputProductsList());
    	    //response.setTransactionInfo(body.getTransactionInfo());
    	}
        return response;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getService()
    {
    	  return "Hello this is CM";
    }
}

