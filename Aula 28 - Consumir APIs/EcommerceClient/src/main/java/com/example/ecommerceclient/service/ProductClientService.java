package com.example.ecommerceclient.service;

import com.example.ecommerceclient.entity.dto.ProductDTO;
import com.example.ecommerceclient.util.JsonUtil;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.springframework.stereotype.Service;

@Service
public class ProductClientService {
    /** Methods **/
    public ProductDTO save(ProductDTO productDTO) {
        HttpResponse<String> response = null;
        ProductDTO product = null;

        try {
            response = Unirest.post("http://localhost:8088/product")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(productDTO)).asString();

            product = JsonUtil.objectFromString(ProductDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }

    public ProductDTO findById(int id) {
        HttpResponse<String> response = null;
        ProductDTO product = null;

        try {
            response = Unirest.get("http://localhost:8088/product/" + id).asString();

            product = JsonUtil.objectFromString(ProductDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }
}
