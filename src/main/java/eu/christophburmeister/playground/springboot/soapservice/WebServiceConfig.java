package eu.christophburmeister.playground.springboot.soapservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//http://localhost:9000/ws/GetCityByCodeService.wsdl

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import eu.christophburmeister.playground.springboot.CityRepository;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	static final Logger logger = LogManager.getLogger(WebServiceConfig.class.getName());

	private static final String TARGET_NAMESPACE = "http://christophburmeister.eu/playground/springboot/gen";
	private static final String SERVLET_REGISTRATION_BEAN = "/ws";

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		logger.info("registering the servlet");
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, SERVLET_REGISTRATION_BEAN + "/*");
	}

	@Bean(name = "cities")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema citiesSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("CitiesPort");
		wsdl11Definition.setLocationUri(SERVLET_REGISTRATION_BEAN);
		wsdl11Definition.setTargetNamespace(TARGET_NAMESPACE);
		wsdl11Definition.setSchema(citiesSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema citiesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/cities.xsd"));
	}
}