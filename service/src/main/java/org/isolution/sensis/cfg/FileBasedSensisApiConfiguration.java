package org.isolution.sensis.cfg;

import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * A file based implementation of {@link SensisApiConfiguration}. It reads the configuration from 
 * <code>sensis-api.properties</code> file which should be accessible in the classpath.
 * 
 * @author agwibowo
 * @since 1.0
 */
public class FileBasedSensisApiConfiguration implements SensisApiConfiguration{	
	private static final String CONFIG_FILE = "sensis-api.properties";
	
	private PropertiesConfiguration configuration;
	
	public FileBasedSensisApiConfiguration() {
		try {
			configuration = new PropertiesConfiguration(CONFIG_FILE);
		} catch (Exception e) {
			throw new RuntimeException("Unable to load configuration file", e);
		}		
	}
	
	public String getSensisApiKey() {
			return configuration.getString("sensis-api.key");		
	}

	public String getEndpointUrl() {	
		return configuration.getString("sensis-api.url");
	}	
}
