package com.example.developmentlanguage;

import com.example.developmentlanguage.controller.LanguageController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(LanguageController.class)
@AutoConfigureMockMvc(addFilters = false)
class DevelopmentLanguageApplicationTests {
    /** Attribute **/
    @Autowired
    private MockMvc mockMvc;

    /** Tests **/
    @Test
    void findAllLanguagesAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/languages")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findLanguageByTypeAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/languages/{type}", "Java")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findNonExistentLanguageByTypeAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/languages/{type}", "JavaScript")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

}
