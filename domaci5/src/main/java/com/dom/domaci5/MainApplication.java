package com.dom.domaci5;

import com.dom.domaci5.repositories.InMemoryPostRepository;
import com.dom.domaci5.repositories.PostRepository;
import com.dom.domaci5.service.PostService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class MainApplication extends ResourceConfig {

    public MainApplication() {

        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);

                this.bindAsContract(PostService.class);
            }
        };
        register(binder);

        packages("com.dom.domaci5.resource");

    }

}
