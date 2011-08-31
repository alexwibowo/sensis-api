package org.isolution.sensis.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.codehaus.jackson.map.ObjectMapper;
import org.isolution.sensis.cfg.SensisApiConfiguration;
import org.isolution.sensis.domain.SearchResult;
import org.isolution.sensis.json.JacksonObjectMapperFactory;

/**
 * Date: 19/08/11
 * Time: 12:42 PM
 * 
 * @author agwibowo
 * @since 1.0
 */
public class SensisApiSearchService {
    
    private SensisApiConfiguration configuration;
    
    public SensisApiSearchService(SensisApiConfiguration configuration) {
        this.configuration = configuration;        
    }

    /**
     * @param keyword search keyword
     * @param location location for search
     * @return search result
     * @throws IOException
     */
    public SearchResult search(final String keyword, final String location)
            throws IOException{
        String query = new RequestBuilder()
        		.withEndpoint(configuration.getEndpointUrl())
        		.withSensisAPIKey(configuration.getSensisApiKey())
        		.withKeyword(keyword)
        		.withLocation(location)
        		.build();
		java.net.URL url = new java.net.URL(query);
		
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException(
                    "Error calling Search API (HTTP status " + connection.getResponseCode() + ")");
            }
            ObjectMapper objectMapper = JacksonObjectMapperFactory.create();
            InputStream inputStream = connection.getInputStream();
            return objectMapper.readValue(inputStream, SearchResult.class);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }	
}
