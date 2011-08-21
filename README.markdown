Sensis API
===========

Overview
------------
This project is intended to ease development when using Sensis Search API (SAPI).  There are two modules contained within the project:
<ul>
    <li>Sensis API Model</li>
    <li>Sensis API Service</li>
</ul>

Sensis API Model
---------------------
POJO representations of the JSON result returned from SAPI. Usage:

<code>
            java.net.URL url = new java.net.URL(getEndpoint() + "?key=" + key +
                "&query=" + java.net.URLEncoder.encode(keyword, "UTF-8") +
                "&location=" + java.net.URLEncoder.encode(location, "UTF-8"));
            HttpURLConnection connection = = (HttpURLConnection) url.openConnection();
            ObjectMapper objectMapper = JacksonObjectMapperFactory.create();
            InputStream inputStream = connection.getInputStream();
            return objectMapper.readValue(inputStream, SearchResult.class);
</code>


Sensis API Service
----------------------

