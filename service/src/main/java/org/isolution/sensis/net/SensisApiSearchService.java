package org.isolution.sensis.net;

import org.codehaus.jackson.map.ObjectMapper;
import org.isolution.sensis.domain.SearchResult;
import org.isolution.sensis.json.JacksonObjectMapperFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 12:42 PM
 */
public class SensisApiSearchService {
    //TODO: externalize to properties
    private String endpoint = "http://api.sensis.com.au/ob-20110511/test/search";

    private String key;

    public SensisApiSearchService(String key) {
        this.key = key;
    }


    public static void main(String[] args) throws IOException {
        SensisApiSearchService sensisApiSearchService = new SensisApiSearchService("CHANGEME");
        SearchResult cafe = sensisApiSearchService.search("malaysian restaurant", "east bentleigh");
        System.out.println(cafe.getCount());
    }

    /**
     * @param keyword search keyword
     * @param location location for search
     * @return search result
     * @throws IOException
     */
    public SearchResult search(final String keyword, final String location)
            throws IOException{
        java.net.URL url = new java.net.URL(getEndpoint() + "?key=" + key +
                "&query=" + java.net.URLEncoder.encode(keyword, "UTF-8") +
                "&location=" + java.net.URLEncoder.encode(location, "UTF-8"));
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

    private String getEndpoint() {
        return endpoint;
    }

}
