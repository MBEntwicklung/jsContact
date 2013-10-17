package de.mbentwicklung.jsContact.configuration;

import de.mbentwicklung.jsContact.domain.Contact;
import de.mbentwicklung.jsContact.service.ContactRegistrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 22:15
 */
@Configuration
public class RegistrationConfig {

    @Bean
    public ContactRegistrationService contactRegistrationService() {
        return new ContactRegistrationService() {
            @Override
            public boolean register(Contact contact) {
                return true;
            }
        };
    }
}
