package com.example.ecommerce.validations;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.exception.NullVariableException;

import java.util.ArrayList;
import java.util.List;

public class ValidationProduct {
    /** Methods **/
    public Boolean validationProductVariables(ProductDTO productDTO) throws NullVariableException {
        List<String> variables = new ArrayList<>();

        if (productDTO.getTitle() == null || productDTO.getTitle().isEmpty()) {
            variables.add("Title");
        }
        if (productDTO.getPrice() <= 0) {
            variables.add("Price");
        }
        if (productDTO.getDescription() == null || productDTO.getDescription().isEmpty()) {
            variables.add("Description");
        }
        if (productDTO.getImage() == null || productDTO.getImage().isEmpty()) {
            variables.add("Image");
        }
        if (productDTO.getCategory() == null || productDTO.getCategory().getId() <= 0) {
            variables.add("Category");
        }

        if (!variables.isEmpty())
            throw new NullVariableException("Verify listed variables", variables);

        return true;
    }
}
