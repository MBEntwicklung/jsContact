package de.mbentwicklung.jsContact.service;

import de.mbentwicklung.jsContact.domain.Contact;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 21:37
 */
public interface ContactRegistrationService {

    /**
     * Register Contact
     *
     * @param contact Contact
     * @return successfull
     */
    boolean register(Contact contact);

}
