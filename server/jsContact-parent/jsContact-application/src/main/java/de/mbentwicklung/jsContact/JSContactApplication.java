package de.mbentwicklung.jsContact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class JSContactApplication {

    public static void main(final String... args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "context/jsContact-context.xml"
        );

        final JSContactBean bean = (JSContactBean) context.getBean("jsContactBean");
        bean.startServer();
    }
}
