package de.mbentwicklung.jsContact.integrationtest;

import de.mbentwicklung.jsContact.controller.RegistrationSiteController;
import de.mbentwicklung.jsContact.domain.Contact;
import de.mbentwicklung.jsContact.service.ContactRegistrationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 21:22
 */
public class RegistrationSiteIntegrationTest {

    private static final String RESPONSE_BODY = "Register";
    MockMvc mockMvc;

    @InjectMocks
    private RegistrationSiteController registrationSiteController;

    @MockitoAnnotations.Mock
    private ContactRegistrationService contactRegistrationService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = standaloneSetup(registrationSiteController).build();

        when(contactRegistrationService.register(any(Contact.class))).thenReturn(true);
    }

    @Test
    public void loadRegistrationSite() throws Exception {
        mockMvc.perform(get("/register"))
                .andDo(print())
                .andExpect(content().string(RESPONSE_BODY));

    }
}
