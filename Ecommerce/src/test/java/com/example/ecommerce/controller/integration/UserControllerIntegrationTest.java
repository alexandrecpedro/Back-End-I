package com.example.ecommerce.controller.integration;

import com.example.ecommerce.entity.dto.UserDTO;
import com.example.ecommerce.enums.UserRoles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static com.example.ecommerce.utils.CommerceUtils.asJsonString;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerIntegrationTest {
    /** Attributes **/
    @Autowired
    private MockMvc mockMvc;

    /** Tests **/
    // Registering an user
    @Test
    void createTest() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Thiago Bellini");
        userDTO.setUsername("thiagobellini");
        userDTO.setEmail("thiagobellini@email.com");
        userDTO.setPassword("1234567890");
        userDTO.setUserRoles(UserRoles.ROLE_ADMIN);

        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(asJsonString(userDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }
}