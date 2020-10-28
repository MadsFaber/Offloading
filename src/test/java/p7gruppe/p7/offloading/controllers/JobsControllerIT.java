package p7gruppe.p7.offloading.api;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
class JobsControllerIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Ok response when request is sent to /jobs endpoint")
    public void shouldReturnOkOnJobsEndpoint() throws Exception {
        mockMvc.perform(get("/jobs")).andExpect(status().isOk());
    }
}
