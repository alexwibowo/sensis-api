package org.isolution.sensis.cfg;

/**
 * All configuration of Sensis API
 * 
 * @author agwibowo
 */
public interface SensisApiConfiguration {
	
	/** 
	 * @return Sensis API Key
	 */	
	String getSensisApiKey();
	
	/** 
	 * @return Sensis API URL
	 */	
	String getEndpointUrl();
}
