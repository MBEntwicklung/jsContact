package de.mbentwicklung.jsContact.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * TODO
 * <p/>
 * User: Marc Bellmann
 * Date: 17.10.13
 * Time: 22:24
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"de.mbentwicklung.jsContact.controller"})
public class WebConfig {
}
