package de.mbentwicklung.jsContact.controller;

import de.mbentwicklung.jsContact.service.ContactRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 21:21
 */
@Controller
@RequestMapping("/register")
public class RegistrationSiteController {

    @Autowired
    private ContactRegistrationService contactRegistrationService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getRegisterSite() {
        return "Register";
    }
}
