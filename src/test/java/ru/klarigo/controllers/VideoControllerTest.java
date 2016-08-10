package ru.klarigo.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import ru.klarigo.services.VideoService;

/**
 * @author Rafael_Irgalin
 */

@RunWith(SpringRunner.class)
@WebMvcTest(VideoController.class)
@EnableConfigurationProperties
public class VideoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    VideoService videoService;

    @Test
    public void showVideoSection() throws Exception {
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/video"));
        result.andExpect(MockMvcResultMatchers.view().name("video"));
    }

}