package br.com.barbero.gae.app;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class CustomXmlWebApplicationContext extends XmlWebApplicationContext {
	private static final Log LOGGER = LogFactory.getLog(CustomXmlWebApplicationContext.class);

	@Override
	protected void initBeanDefinitionReader(XmlBeanDefinitionReader beanDefinitionReader) {
		super.initBeanDefinitionReader(beanDefinitionReader);
		LOGGER.info("Atribuindo Validacao de XML do Spring como VALIDATION_NONE");
		beanDefinitionReader.setValidationMode(XmlBeanDefinitionReader.VALIDATION_NONE);
		beanDefinitionReader.setNamespaceAware(true);
	}

	@Override
	protected void loadBeanDefinitions(XmlBeanDefinitionReader reader)throws IOException {
		long start = System.currentTimeMillis();
		super.loadBeanDefinitions(reader);
		long duration = (System.currentTimeMillis() - start);
		LOGGER.info(String.format("Tempo de carregamento dos beans: %s milisegundos ", duration) );
	}
}