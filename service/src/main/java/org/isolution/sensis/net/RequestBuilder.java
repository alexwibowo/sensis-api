package org.isolution.sensis.net;

import java.io.UnsupportedEncodingException;

/**
 * Builder for making request string 
 * 
 * @author agwibowo
 * @since 1.0
 */
public class RequestBuilder {
	
	/**
	 * Location to search for. e.g.: East Melbourne
	 */
	private String location;
	
	/**
	 * Search keyword. e.g.: locksmith
	 */
	private String keyword;
	
	/**
	 * Search API Endpoint to use 
	 */
	private String endpoint;
	
	/**
	 * Sensis API key
	 */
	private String sensisAPIKey;
	
	public RequestBuilder withSensisAPIKey(String value) {		
		this.sensisAPIKey = value;
		return this;
	}
	
	public RequestBuilder withLocation(String value){
		this.location=value;
		return this;
	}
	
	public RequestBuilder withKeyword(String value){		
		this.keyword=value;
		return this;				
	}
	
	public RequestBuilder withEndpoint(String value) {
		this.endpoint=value;
		return this;								
	}
	
	public String build() throws UnsupportedEncodingException {
		String encodedKeyword = java.net.URLEncoder.encode(keyword, "UTF-8");
		String encodedLocation = java.net.URLEncoder.encode(location, "UTF-8");
		return new StringBuilder().append(endpoint).append("?key=").append(sensisAPIKey)
					.append("&query=").append(encodedKeyword)
					.append("&location=").append(encodedLocation)
					.toString();
	}

}
