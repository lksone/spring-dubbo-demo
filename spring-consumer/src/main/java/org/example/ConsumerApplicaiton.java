package org.example;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.example.controller.RestApiService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 消费这
 *
 * @author kes5li
 */
public class ConsumerApplicaiton {
    public static void main(String[] args) throws Exception {
        int port = 8282;
        try {
            port = Integer.parseInt(System.getenv("rest.api.port"));
        } catch (Exception ex) {
        }

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerApplicaiton.class);
        context.start();
        RestApiService.applicationContext = context;
        Server server = new Server(port);
        ServletHolder servlet = new ServletHolder(ServletContainer.class);
        servlet.setInitParameter("com.sun.jersey.config.property.packages", "org.example.serviceImpl");
        servlet.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        handler.addServlet(servlet, "/*");
        server.setHandler(handler);
        server.start();
        System.out.println("dubbo service init finish");
    }
}
