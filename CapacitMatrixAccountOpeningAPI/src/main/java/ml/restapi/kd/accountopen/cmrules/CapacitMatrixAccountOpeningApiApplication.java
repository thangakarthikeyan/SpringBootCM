package ml.restapi.kd.accountopen.cmrules;

import java.util.Arrays;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;



@SpringBootApplication
public class CapacitMatrixAccountOpeningApiApplication {

	@Autowired
	private Bus bus;
	
	@Autowired
	private AccountOpeningCMRuleServiceImpl service1;

	public static void main(String[] args) {
		SpringApplication.run(CapacitMatrixAccountOpeningApiApplication.class, args);
	}
	
	@Bean
	public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/account");
        
        // Register 2 JAX-RS root resources supporting "/sayHello/{id}" and "/sayHello2/{id}" relative paths
        endpoint.setServiceBeans(Arrays.<Object>asList(service1));
        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        endpoint.setProviders(Arrays.asList(jacksonJaxbJsonProvider(), jaxbElementProvider()));
        return endpoint.create();
    }
    
   
    @Bean
    public JacksonJaxbJsonProvider jacksonJaxbJsonProvider() {
        return new JacksonJaxbJsonProvider();
    }
    @Bean
    public JAXBElementProvider jaxbElementProvider() {
        return new JAXBElementProvider();
    }
}
