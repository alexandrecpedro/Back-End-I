package com.example.ecommerce.controller.integration;

import com.example.ecommerce.entity.dto.CategoryDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static com.example.ecommerce.utils.CommerceUtils.asJsonString;
import static com.example.ecommerce.utils.CommerceUtils.objectFromString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

@SpringBootTest
@AutoConfigureMockMvc
class CategoryControllerIntegrationTest {
    /** Attributes **/
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    /** Before Test **/
    @BeforeEach
    void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }

    /** Tests **/
    // Registering an user
    @Test
    @WithMockUser(username = "potato", password = "potato123", roles = "ADMIN")
    void saveCategory() throws Exception {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("Electronics");

        // Returns a MockHttpServletResponse object
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/category")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(asJsonString(categoryDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        // Convert String to Object
        categoryDTO = objectFromString(CategoryDTO.class, responseBody);
        assertNotNull(categoryDTO.getId());
    }

    // Registering an user
    @Test
    @WithMockUser(username = "potato", password = "potato123", roles = "ADMIN")
    void getCategoryByIdTest() throws Exception {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("Perfums");

        // POST
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/category")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(asJsonString(categoryDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        // Convert String to Object
        categoryDTO = objectFromString(CategoryDTO.class, responseBody);

        // GET
        mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/category/{id}", categoryDTO.getId())
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        responseBody = mvcResult.getResponse().getContentAsString();
        CategoryDTO categoryDTO2 = objectFromString(CategoryDTO.class, responseBody);
        assertEquals(categoryDTO.getId(), categoryDTO2.getId());
        assertEquals(categoryDTO.getName(), categoryDTO2.getName());
    }
}