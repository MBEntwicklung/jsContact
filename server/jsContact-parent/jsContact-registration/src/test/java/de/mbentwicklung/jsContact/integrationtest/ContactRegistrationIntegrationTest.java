package de.mbentwicklung.jsContact.integrationtest;

import de.mbentwicklung.jsContact.configuration.RegistrationConfig;
import de.mbentwicklung.jsContact.domain.Contact;
import de.mbentwicklung.jsContact.service.ContactRegistrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 22:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RegistrationConfig.class})
public class ContactRegistrationIntegrationTest {

    private static final Contact DEFAULT_CONTACT = new Contact();

    @Autowired
    private ContactRegistrationService contactRegistrationService;


    @Test
    public void assertRegisterContact() throws Exception {
        assertThat(this.contactRegistrationService.register(DEFAULT_CONTACT), is(true));
    }
}
