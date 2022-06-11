package me.msvasilets.reactiveweb.controller;

import lombok.extern.slf4j.Slf4j;
import me.msvasilets.reactiveweb.domain.Resume;
import me.msvasilets.reactiveweb.service.ResumeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.accepted;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Slf4j
@Configuration
@EnableWebFlux
public class FunctionalResumeController implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> resumeByIdRouter(ResumeService service) {
        return route().path("/resume", builder -> builder
                .GET("/{id}", request -> ok().body(service.findById(request.pathVariable("id")), Resume.class))
                .POST(accept(APPLICATION_JSON), request -> ok().body(service.saveNew(request.bodyToMono(Resume.class)), Resume.class))
                .DELETE("/{id}", request -> accepted().body(service.removeById(request.pathVariable("id")), Void.class))
        ).build();
    }


}
