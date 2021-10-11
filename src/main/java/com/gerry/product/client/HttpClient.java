package com.gerry.product.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gerry.product.model.Product;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class HttpClient {

    public Product getProductById(String productId) throws Exception{

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet("http://localhost:8080/api/v1/" + productId + "/inventory");

        getRequest.addHeader("accept", "application/json");

        HttpResponse response = httpClient.execute(getRequest);

        //verify the valid error code first
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200)
        {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }

        HttpEntity httpEntity = response.getEntity();
        String apiOutput = EntityUtils.toString(httpEntity);
        ObjectMapper mapper = new ObjectMapper();

        Product p = mapper.readValue(apiOutput, Product.class);


        return p;
    }

}
