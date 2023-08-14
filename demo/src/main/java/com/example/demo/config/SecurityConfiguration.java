package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
public class SecurityConfiguration {
    @Autowired
    HandlerMappingIntrospector introspector;

    @Autowired
    private OAuth2UserService customUserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//        http// "/", "/error", "/webjars/**"
//                .authorizeRequests(a -> a.requestMatchers(new AntPathRequestMatcher("/"),
//                        new AntPathRequestMatcher("/error"), //
//                        new AntPathRequestMatcher("/webjars/**")).permitAll()
//                        .anyRequest().authenticated()
//                )
//                .exceptionHandling(e -> e
//                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//                ).oauth2Login();
//        http
//                .securityMatcher("/user").oauth2Login();
        http
                .httpBasic().disable()
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/app.js"), new MvcRequestMatcher(introspector,"/style.css"),new MvcRequestMatcher(introspector,"/index.html"),new MvcRequestMatcher(introspector,"/"), new MvcRequestMatcher(introspector,"/webjars/**"), new MvcRequestMatcher(introspector,"/error")).permitAll()
                        .anyRequest().authenticated()

                ).headers(header -> header.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))
                .csrf(CsrfConfigurer::disable)
                .exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                .oauth2Login(oauth2Login ->
                        oauth2Login
                                .defaultSuccessUrl("http://localhost:5500/index.html")
                                .userInfoEndpoint(userInfoEndpoint ->
                                        userInfoEndpoint
                                                .oidcUserService(customUserService) // Use your custom OAuth2UserService
                                )
                );

        return http.build();
    }

}