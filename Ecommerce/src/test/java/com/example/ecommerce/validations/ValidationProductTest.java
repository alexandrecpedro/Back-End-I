package com.example.ecommerce.validations;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.exception.NullVariableException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationProductTest {
    /** Tests **/
    @Test
    void validationProductVariablesTest() {
        ValidationProduct validationProduct = new ValidationProduct();
        ProductDTO productDTO = new ProductDTO();

        NullVariableException nullVariableException = assertThrows(NullVariableException.class,
                () -> validationProduct.validationProductVariables(productDTO));

        assertFalse("Verify listed variables" != nullVariableException.getMessage());
        assertEquals(5, nullVariableException.getVariableList().size());
    }

    @Test
    void validationProductVariablesTest2() {
        ValidationProduct validationProduct = new ValidationProduct();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setTitle("PlayStation 4");

        NullVariableException nullVariableException = assertThrows(NullVariableException.class,
                () -> validationProduct.validationProductVariables(productDTO));

        assertTrue("Verify listed variables" == nullVariableException.getMessage());
        assertEquals(4, nullVariableException.getVariableList().size());
    }
}