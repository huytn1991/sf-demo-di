package com.example.sfdemodi.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SetterInjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getGreetingFromHello() throws Exception {
        mockMvc.perform(get("/setter/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Xin chào. Rất vui được gặp bạn."));
    }

}
