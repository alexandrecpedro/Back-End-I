package com.example.ecommerce.validations;

import com.example.ecommerce.entity.dto.ProductDTO;

public class ValidationProduct {
    /** Methods **/
    public String validationProductVariables(ProductDTO productDTO) {
        if (productDTO.getTitle().equals(null)) {
            return "Title not found";
        } else if (productDTO.getPrice() <= 0) {
            return "Price error or not filled";
        }
        return null;
    }
}
